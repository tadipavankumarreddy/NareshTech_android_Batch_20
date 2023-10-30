package `in`.nareshtechnologies.registerme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.widget.SwitchCompat
import com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class PreviousCode : AppCompatActivity(), AdapterView.OnItemSelectedListener{
    lateinit var userName:TextInputLayout
    lateinit var sub:Button
    lateinit var rg:RadioGroup
    lateinit var hindi:CheckBox
    lateinit var english:CheckBox
    lateinit var marati:CheckBox
    lateinit var spinner:Spinner
    lateinit var switchCompat:SwitchCompat
    var gender:String = "Not Selected"
    var country:String = "Select Country"
    var availability:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_main)*/

        userName = findViewById(R.id.user_name)
        sub = findViewById(R.id.submit)
        rg = findViewById(R.id.gender_group)
        hindi = findViewById(R.id.hindi)
        english = findViewById(R.id.english)
        marati = findViewById(R.id.marati)
        spinner = findViewById(R.id.nationality)
        switchCompat = findViewById(R.id.availability)

        switchCompat.setOnCheckedChangeListener { buttonView, isChecked ->
            availability = isChecked
        }
        // populate the data
        val items = arrayOf<String>("Select Country","India","USA","UK","Canada","Australia","Ireland","Switzerland")

        //We need ArrayAdapter to display multiple items on the spinner
        val adapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,items)

        //Once the adapter is ready, attach the adapter to the Spinner
        spinner.adapter = adapter

        spinner.onItemSelectedListener = this

        rg.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId == R.id.male){
                gender = "Male"
            }else if(checkedId == R.id.female){
                gender = "Female"
            }else{
                gender = "Not Interested"
            }
        }

        sub.setOnClickListener { v->
            var lang:String = ""
            if(hindi.isChecked){
                lang = lang+"Hindi\n"
            }
            if(english.isChecked){
                lang = lang+"English\n"
            }
            if(marati.isChecked){
                lang = lang+"Marati\n"
            }

            Snackbar.make(v,"$availability",Snackbar.LENGTH_LONG).show()
        }
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        country = parent?.getItemAtPosition(position).toString()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}
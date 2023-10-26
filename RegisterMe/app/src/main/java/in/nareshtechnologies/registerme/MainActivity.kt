package `in`.nareshtechnologies.registerme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var userName:TextInputLayout
    lateinit var sub:Button
    lateinit var rg:RadioGroup
    var gender:String = "Not Selected"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userName = findViewById(R.id.user_name)
        sub = findViewById(R.id.submit)
        rg = findViewById(R.id.gender_group)

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
            val s:String = userName.editText?.text.toString()
            Snackbar.make(v,"$s is $gender",Snackbar.LENGTH_LONG).show()
            userName.editText?.text?.clear()
        }
    }
}
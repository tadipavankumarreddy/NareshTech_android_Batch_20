package `in`.nareshtechnologies.intentsexplicitimplicit

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var et:TextInputLayout
    lateinit var ob:TextInputLayout
    lateinit var od:TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et = findViewById(R.id.til_name)
        ob = findViewById(R.id.web_address)
        od = findViewById(R.id.phone_num)
    }

    // This method gets invoked when the button is clicked on the xml file
    fun gotoNextScreen(view: View) {
        val s:String = et.editText?.text.toString()
        // Now, its time to open the next screen.
        //TODO 1: To open another screen, first create that screen
        // TODO 2: Open the next screen when the go button is tapped.
        val i = Intent(this,WishActivity::class.java)
        // TODO 3: Send the data along with the intent
        i.putExtra("DATA",s)
        startActivity(i)
    }

    fun openBrowser(view: View) {
        // TODO 5: Get the data and convert it to a URI (Uniform Resource Identifier)
        val link:String = ob.editText?.text.toString()
        val data:Uri = Uri.parse("https://$link")
        // TODO 6: Create an Implicit Intent, Provide data to it.
        val i:Intent = Intent(Intent.ACTION_VIEW,data)
        // TODO 7: start the activity
        startActivity(i)
    }

    fun openDailer(view: View) {
        // get the data
        val num = od.editText?.text.toString().toLong()
        val data = Uri.parse("tel:$num")
        val i = Intent(Intent.ACTION_DIAL,data)
        startActivity(i)
    }
}
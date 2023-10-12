package `in`.nareshtechnologies.scoretracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {

    var count = 0 // we just created a integer variable.
    lateinit var r:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        r = findViewById(R.id.result)

        if(savedInstanceState!=null && savedInstanceState.containsKey("COUNT")){
            count = savedInstanceState.getInt("COUNT")
            r.text = count.toString()
        }
    }
    // This function is called when the + button is clicked.
    fun incrementScore(view: View) {
        count++ // count = count+1
        r.text = count.toString()
    }
    // This function is called when the - button is clicked.
    fun decrementScore(view: View) {
        count--
        r.text = count.toString()
    }

    //Step - 1 override onSaveInstanceState() method
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("COUNT",count)
    }
    // Step- 2 get the value in a new Acitivyt Instance

    // This method attaches the menu xml to the appbar of this activity
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu,menu)
        return true
    }

    // This method gets invoked when the item is selected from the menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.first){
           // This executes when the selected item is the first item
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }else if(item.itemId == R.id.second){
            // This executes when the selected item is the second item
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }else if(item.itemId == R.id.third){
            Toast.makeText(this,"Third is clicked",Toast.LENGTH_LONG).show()
        }else if(item.itemId == R.id.reset){
            count = 0
            r.text = count.toString()
        }
        return true
    }
}
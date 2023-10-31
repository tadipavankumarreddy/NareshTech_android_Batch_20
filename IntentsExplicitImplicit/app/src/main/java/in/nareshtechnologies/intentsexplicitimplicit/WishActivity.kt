package `in`.nareshtechnologies.intentsexplicitimplicit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WishActivity : AppCompatActivity() {
    lateinit var n:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wish)

        n = findViewById(R.id.name)

        //TODO 4: Get the Data from the intent
        val i = intent
        val bborg = i.getStringExtra("DATA")
        n.text = bborg
    }
}
package `in`.nareshtechnologies.favoritefruits

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


data class Fruit(val name:String, val image:Int)
class MainActivity : AppCompatActivity() {

    lateinit var lv:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lv = findViewById(R.id.fruit_list)
        /*val fruits = arrayOf(
            "Apple",
            "Mango",
            "Banana",
            "Orange",
            "Grape",
            "Melon",
            "Watermelon",
            "Peach",
            "Apricot",
            "Plum",
            "Lemon",
            "Lime",
            "Grapefruit",
            "Persimmon",
            "Pear",
            "Cherry",
            "Strawberry",
            "Cranberry",
            "Raspberry",
            "Blackberry",
            "Blueberry",
            "Lychee",
            "Rambutan",
            "Pineapple",
            "Coconut",
            "Papaya",
            "Avocado",
            "Durian",
            "Passion fruit",
            "Guava",
            "Fig",
            "Pomegranate"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, fruits)

        lv.setAdapter(adapter)

        lv.setOnItemClickListener { parent, view, position, id ->
            val itemName = fruits[position]
            // Display the item name as a Snackbar
            val snackbar = Snackbar.make(view, itemName, Snackbar.LENGTH_SHORT)
            snackbar.show()
        }*/

        val fruits = arrayOf<Fruit>(
            Fruit("Apple",R.drawable.apple),
            Fruit("Banana", R.drawable.banana),
            Fruit("Grapes",R.drawable.grapes),
            Fruit("Guava",R.drawable.guava),
            Fruit("Mango",R.drawable.mango),
            Fruit("Orange",R.drawable.orange),
            Fruit("Water Melon", R.drawable.watermelon)
        )

        val adapter:LVAdapter = LVAdapter(this,fruits)
        lv.adapter = adapter

        lv.setOnItemClickListener { parent, view, position, id ->
            Snackbar.make(view,fruits.get(position).name,Snackbar.LENGTH_LONG).show()
        }
    }

    class LVAdapter(val context:Context,val fruits:Array<Fruit>):BaseAdapter(){
        override fun getCount(): Int {
            return fruits.size
        }

        override fun getItem(position: Int): Any {
            return position
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val v:View = LayoutInflater.from(context).inflate(R.layout.one_item_design,parent,false)
            val image:ImageView = v.findViewById(R.id.imageView)
            val fname:TextView = v.findViewById(R.id.textView)
            image.setImageResource(fruits.get(position).image)
            fname.text = fruits.get(position).name
            return v
        }

    }
}
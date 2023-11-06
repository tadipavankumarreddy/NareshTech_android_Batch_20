package `in`.nareshtechnologies.favoritemovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

data class FavMovies(val name:String, val image:Int)
class MainActivity : AppCompatActivity() {

    lateinit var recyclerview:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview = findViewById(R.id.recyclerview)

        val data:MutableList<FavMovies> = prepareData()

        val fma:FavoriteMoviesAdapter = FavoriteMoviesAdapter(this,data)
        recyclerview.adapter = fma

        /*recyclerview.layoutManager = LinearLayoutManager(this)*//*,LinearLayoutManager.HORIZONTAL,false)*/
        recyclerview.layoutManager = GridLayoutManager(this,2)
    }

    private fun prepareData():MutableList<FavMovies> {
        val l:MutableList<FavMovies> = mutableListOf()
        l.add(FavMovies("Avengers",R.drawable.a))
        l.add(FavMovies("Bahubali - The Conclusion",R.drawable.b))
        l.add(FavMovies("Captain America", R.drawable.c))
        l.add(FavMovies("Don",R.drawable.d))
        l.add(FavMovies("Eternals",R.drawable.e))
        l.add(FavMovies("Fast and Furious",R.drawable.f))
        l.add(FavMovies("Guru",R.drawable.g))
        l.add(FavMovies("Hero",R.drawable.h))
        l.add(FavMovies("I",R.drawable.i))
        l.add(FavMovies("Joker",R.drawable.j))
        return l
    }

    // TODO 1: Prepare data (refer PrepareData() method)
    // TODO 2: Add Recyclerview
    // TODO 3: Design a layout file to hold the design template of each item on the recyclerview
    // TODO 4: Create an Adapter along with a view holder to populate the data items correctly.
    // tODO 8: Define the layout manager
}
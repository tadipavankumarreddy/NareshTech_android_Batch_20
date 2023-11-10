package `in`.nareshtechnologies.favoritemovies

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.google.android.material.card.MaterialCardView

// TODO 5: Extend the FavoriteMoviesAdapter to RecyclerView's Adapter class
// TODO 6: Provide the information related to the viewholder class for your Adapter
// TODO 7: Resolve your errors from right to left
class FavoriteMoviesAdapter(val context:Context, val l:MutableList<FavMovies>)
    : Adapter<FavoriteMoviesAdapter.FMViewholder>() {

    class FMViewholder(v: View): ViewHolder(v) {
        val iv:ImageView = v.findViewById(R.id.imageView)
        val tv:TextView = v.findViewById(R.id.textView)
        val b:Button = v.findViewById(R.id.show_img)
        val cv:CardView = v.findViewById(R.id.card_checked)
    }

    // This method inflates the template for the item that is about to be shown on the recyclerview
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FMViewholder {
        val v:View = LayoutInflater.from(context).inflate(R.layout.one_item_design,parent,false)
        return FMViewholder(v)
    }

    // It is responsible to tell us how many total items are there for display
    override fun getItemCount(): Int {
        return l.size
    }

    // Populate the relevant data on the returned item (Returned from onCreateViewHolder())
    override fun onBindViewHolder(holder: FMViewholder, position: Int) {
        holder.iv.setImageResource(l.get(position).image)
        holder.iv.visibility = View.INVISIBLE
        holder.tv.text = l.get(position).name

        holder.b.setOnClickListener { v->
            holder.iv.visibility = View.VISIBLE
            holder.b.visibility = View.INVISIBLE
        }

        holder.iv.setOnClickListener { v->
            holder.iv.visibility = View.INVISIBLE
            holder.b.visibility = View.VISIBLE
        }

        holder.cv.setOnClickListener { v->
            val i = Intent(context,MovieDetails::class.java)
            context.startActivity(i)
        }
    }

}
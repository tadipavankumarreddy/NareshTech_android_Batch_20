package com.nareshtechnologies.googlebooks

import android.content.ClipData.Item
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.nareshtechnologies.googlebooks.dataclasses.Items

class RecycleAdapter(val context: Context, val items:List<Items>): Adapter<RecycleAdapter.RecycleViewHolder>() {

    class RecycleViewHolder(val view: View):ViewHolder(view){
        val iv:ImageView = view.findViewById(R.id.bookcover)
        val title:TextView = view.findViewById(R.id.booktitle)
        val author:TextView = view.findViewById(R.id.bookauthor)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.one_item_design,parent,false)
        return RecycleViewHolder(v)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecycleViewHolder, position: Int) {
        // how to show an image to the user from the url
        Glide.with(context).load(items.get(position).volumeInfo?.imageLinks?.thumbnail).into(holder.iv)
        holder.title.text = items.get(position).volumeInfo?.title
        holder.author.text = ""
        var i:Int=0
        while(i< items.get(position).volumeInfo?.authors?.size!!){
            holder.author.text = holder.author.text.toString()+" "+items.get(position).volumeInfo?.authors?.get(i)
            i++
        }
    }
}
package com.nareshtechnologies.googlebooks

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.nareshtechnologies.googlebooks.dataclasses.Items

class BookDetailsActivity : AppCompatActivity() {
    lateinit var bookDetailsImage:ImageView
    lateinit var bookDetailsTitle:TextView
    lateinit var bookDetailsAuthor:TextView
    lateinit var bookDetailsCountry:TextView
    lateinit var bookDetailsePub:TextView
    lateinit var bookDetailsPdf:TextView
    lateinit var bookDetailsDesc:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)
        initializeviews()
        val i:Items = intent.getSerializableExtra("ITEM") as Items

        Glide.with(this).load(i.volumeInfo?.imageLinks?.thumbnail).into(bookDetailsImage)
        bookDetailsTitle.text = i.volumeInfo?.title
        bookDetailsAuthor.text = ""
        for(a:String in i.volumeInfo?.authors!!){
            bookDetailsAuthor.text = bookDetailsAuthor.text.toString()+"  "+a
        }
        bookDetailsCountry.text = i.accessInfo?.country
        bookDetailsePub.text = if(i.accessInfo?.epub?.isAvailable!!) "Yes" else "No"
        bookDetailsPdf.text = if(i.accessInfo?.pdf?.isAvailable!!) "Yes" else "No"
        bookDetailsDesc.text = i.volumeInfo?.description
    }

    private fun initializeviews() {
        bookDetailsImage = findViewById(R.id.book_details_image)
        bookDetailsTitle = findViewById(R.id.book_details_title)
        bookDetailsCountry = findViewById(R.id.book_details_country)
        bookDetailsePub = findViewById(R.id.book_details_epub)
        bookDetailsAuthor = findViewById(R.id.book_details_authors)
        bookDetailsPdf = findViewById(R.id.book_details_pdf)
        bookDetailsDesc = findViewById(R.id.book_details_desc)
    }
}
package com.nareshtechnologies.sqlitedatabases

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

// You should be extending this class to SQLiteOpenHelper
// SQLiteOpenHelper is a pre-defined class that has helper methods to perform your
// Database operations easily.
class DatabaseHelper(context: Context?):SQLiteOpenHelper(context,"Pavan.db",null,1) {

    companion object{
        const val TABLE_NAME = "person"
        const val COL_0 = "person_id"
        const val COL_1 = "person_name"
        const val COL_2 = "person_age"
    }

    // This method is used to create the database tables.
    override fun onCreate(db: SQLiteDatabase?) {
        val create_query = "create table $TABLE_NAME($COL_0 integer primary key autoincrement, $COL_1 text, $COL_2 integer);"
        db?.execSQL(create_query)
    }

    // This is used to upgrade the database when the project version changes
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
       db?.execSQL("drop table $TABLE_NAME")
        onCreate(db)
    }

    fun insertData(contentValues: ContentValues?){
        val db = this.writableDatabase
        db.insert(TABLE_NAME,null,contentValues)
    }

    fun getAllData():Cursor{
        val db = this.readableDatabase
        return db.rawQuery("select * from $TABLE_NAME",null)
    }
}
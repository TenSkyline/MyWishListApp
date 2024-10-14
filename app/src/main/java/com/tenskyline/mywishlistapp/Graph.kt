package com.tenskyline.mywishlistapp

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.tenskyline.mywishlistapp.data.WishDatabase
import com.tenskyline.mywishlistapp.data.WishRepository

object Graph {
    lateinit var database: WishDatabase

    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }

    fun provide (context: Context){
        database = Room.databaseBuilder(context, WishDatabase::class.java, "wishlist.db").build()
    }
}
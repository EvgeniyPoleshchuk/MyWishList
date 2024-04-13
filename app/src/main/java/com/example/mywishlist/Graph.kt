package com.example.mywishlist

import android.content.Context
import androidx.room.Room
import com.example.mywishlist.data.WishDataBase
import com.example.mywishlist.data.WishRepository

object Graph {
    lateinit var dataBase: WishDataBase

    val wishRepository by lazy {
        WishRepository(dataBase.wishDao())
    }
    fun provide(context: Context){
        dataBase = Room.databaseBuilder(context,WishDataBase::class.java,"wishList.db").build()
    }
}
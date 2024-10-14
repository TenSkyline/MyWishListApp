package com.tenskyline.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish_table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name="wish_title")
    val title: String = "",
    @ColumnInfo(name="wish_desc")
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Book", description = "Old Book"),
        Wish(title = "Watch", description = "An Watch"),
        Wish(title = "HP", description = "Brand New Phone")
    )
}

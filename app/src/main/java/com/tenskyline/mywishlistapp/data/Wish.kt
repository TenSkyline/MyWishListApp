package com.tenskyline.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Book", description = "Old Book"),
        Wish(title = "Watch", description = "An Watch"),
        Wish(title = "HP", description = "Brand New Phone")
    )
}

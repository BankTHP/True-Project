package com.example.last_mini_project.data

var categoryList = mutableListOf<Category>()

class Category(
    var title: String,
    var movieShelf: List<Movie>
)

fun addCategory() {
    val category = listOf(
        "New Movie",
        "Best SoundTrack",
        "Anime",
        "Top Hits",
        "Old School Movie"
    )
    for (element in category) {
        val i = Category(element, movieList)
        categoryList.add(i)
    }
}

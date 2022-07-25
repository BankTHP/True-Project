package com.example.last_mini_project.common

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.last_mini_project.adapter.MovieAdapter
import com.example.last_mini_project.data.Category
import com.example.last_mini_project.data.Movie
import com.example.last_mini_project.databinding.CardshelfparentItemBinding

class ShelfMovieViewHolder(
    private val shelfBinding: CardshelfparentItemBinding
) : RecyclerView.ViewHolder(shelfBinding.root) {
    var onItemClick: ((movie: Movie) -> Unit)? = null
    fun bindCategory(category: Category) {
        shelfBinding.categoryTextView.text = category.title
        shelfBinding.childrenRecyclerView.layoutManager =
            LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
        shelfBinding.childrenRecyclerView.adapter = MovieAdapter(category.movieShelf).apply {
            onClick = { movie -> this@ShelfMovieViewHolder?.onItemClick?.invoke(movie) }
        }
    }
}
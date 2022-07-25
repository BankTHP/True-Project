package com.example.last_mini_project.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.last_mini_project.common.MovieClickListener
import com.example.last_mini_project.common.ShelfMovieViewHolder
import com.example.last_mini_project.data.Category
import com.example.last_mini_project.data.Movie
import com.example.last_mini_project.databinding.CardshelfparentItemBinding

class ShelfAdapter(
    private val category: List<Category>
) : RecyclerView.Adapter<ShelfMovieViewHolder>() {
    var clickListener: MovieClickListener? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShelfMovieViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardshelfparentItemBinding.inflate(from, parent, false)
        return ShelfMovieViewHolder(binding).apply {
            onItemClick = { movie ->
                clickListener?.onClick(movie)
            }
        }
    }

    override fun onBindViewHolder(holder: ShelfMovieViewHolder, position: Int) {
        holder.bindCategory(category[position])
    }

    override fun getItemCount(): Int = category.size

}
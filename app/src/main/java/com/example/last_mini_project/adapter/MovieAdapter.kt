package com.example.last_mini_project.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.last_mini_project.common.MovieViewHolder
import com.example.last_mini_project.common.MovieClickListener
import com.example.last_mini_project.data.Movie
import com.example.last_mini_project.databinding.CardshelfBinding


class MovieAdapter(
    private val movies: List<Movie>
) : RecyclerView.Adapter<MovieViewHolder>() {
    var onClick : ((movie : Movie) -> Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardshelfBinding.inflate(from, parent, false)
        return MovieViewHolder(binding).apply {
            onClick = {movie -> this@MovieAdapter.onClick?.invoke(movie)  }
        }
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindMovie(movies[position])
    }

    override fun getItemCount(): Int = movies.size

}
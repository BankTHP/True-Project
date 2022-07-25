package com.example.last_mini_project.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.last_mini_project.common.MovieViewHolder
import com.example.last_mini_project.common.MovieClickListener
import com.example.last_mini_project.data.Movie
import com.example.last_mini_project.databinding.CardshelfBinding
import com.example.mini_project_20.ShelfActivity


class MovieAdapter (
    private val movies : List<Movie>,
    private val clickListener: MovieClickListener? = null
        ) : RecyclerView.Adapter<MovieViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardshelfBinding.inflate(from,parent,false)
        return MovieViewHolder(binding,clickListener)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
       holder.bindMovie(movies[position])
    }

    override fun getItemCount(): Int = movies.size

}
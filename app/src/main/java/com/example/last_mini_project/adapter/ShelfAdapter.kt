package com.example.last_mini_project.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.last_mini_project.common.MovieClickListener
import com.example.last_mini_project.common.ShelfMovieViewHolder
import com.example.last_mini_project.data.Category
import com.example.last_mini_project.databinding.CardshelfparentItemBinding
class ShelfAdapter(private val category: List<Category>,private val clickListener: MovieClickListener) : RecyclerView.Adapter<ShelfMovieViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShelfMovieViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardshelfparentItemBinding.inflate(from,parent,false)
        return ShelfMovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ShelfMovieViewHolder, position: Int) {
        holder.bindCategory(category[position])
    }

    override fun getItemCount(): Int = category.size

}
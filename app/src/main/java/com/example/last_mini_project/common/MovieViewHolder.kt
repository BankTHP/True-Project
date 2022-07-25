package com.example.last_mini_project.common

import androidx.recyclerview.widget.RecyclerView
import com.example.last_mini_project.data.Movie
import com.example.last_mini_project.databinding.CardshelfBinding

class MovieViewHolder (
    private val cardshelfBinding: CardshelfBinding,
    private val clickListener: MovieClickListener?= null
    ) : RecyclerView.ViewHolder(cardshelfBinding.root)
{
        fun bindMovie(movie : Movie){
            cardshelfBinding.coverImageView.setImageResource(movie.cover)
            cardshelfBinding.movieNameTextView.text = movie.moviename

            cardshelfBinding.movieCardView.setOnClickListener{
                clickListener?.onClick(movie)
            }
        }
    }

package com.example.last_mini_project.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.last_mini_project.data.MOVIE_EXTRA_ID
import com.example.last_mini_project.data.Movie
import com.example.last_mini_project.data.movieList
import com.example.last_mini_project.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movieID = intent.getIntExtra(MOVIE_EXTRA_ID, -1)
        val movie = movieFromID(movieID)
        if (movie != null) {
           binding.coverImageView.setBackgroundResource(movie.cover)
           binding.titleTextView.text = movie.moviename
           binding.genreTextView.text = movie.genres
            binding.descriptionTextView.text = movie.description
        }
        binding.detailBackButton.setOnClickListener {
            onBackPressed()
       }
    }

    private fun movieFromID(movieID: Int): Movie? {
       for (movie in movieList) {
           if (movie.id == movieID)
               return movie
       }
        return null
    }
}
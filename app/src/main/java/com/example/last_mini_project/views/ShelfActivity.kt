package com.example.mini_project_20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.last_mini_project.adapter.MovieAdapter
import com.example.last_mini_project.common.MovieClickListener
import com.example.last_mini_project.data.MOVIE_EXTRA_ID
import com.example.last_mini_project.data.Movie
import com.example.last_mini_project.data.addMovies
import com.example.last_mini_project.data.movieList
import com.example.last_mini_project.databinding.ActivityMainBinding
import com.example.last_mini_project.views.DetailActivity

class ShelfActivity : AppCompatActivity(), MovieClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addMovies()

        val shelfActivity = this
        binding.shelfRecyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext,1,GridLayoutManager.HORIZONTAL,false)
            adapter = MovieAdapter(movieList,shelfActivity)
        }
    }
    override fun onClick(movie: Movie) {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(MOVIE_EXTRA_ID, movie.id)
        startActivity(intent)
    }
}

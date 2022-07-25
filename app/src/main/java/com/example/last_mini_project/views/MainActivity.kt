package com.example.last_mini_project.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.last_mini_project.adapter.MovieAdapter
import com.example.last_mini_project.adapter.ShelfAdapter
import com.example.last_mini_project.common.MovieClickListener
import com.example.last_mini_project.data.*
import com.example.last_mini_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MovieClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addMovies()
        addCategory()

        binding.shelfRecyclerView.apply {
            layoutManager =
                LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
            adapter = ShelfAdapter(categoryList).apply {
                clickListener = this@MainActivity
            }
        }
    }

    override fun onClick(movie: Movie) {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(MOVIE_EXTRA_ID, movie.id)
        startActivity(intent)
    }
}
package com.example.teste1.ui.homeScreen.movieDetailScreen

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.teste1.R
import com.example.teste1.model.Movie

class MovieDetailActivity : AppCompatActivity() {

    private lateinit var movieTarget: Movie
    private lateinit var tvTitle: TextView
    private lateinit var tvOverview: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        tvTitle = findViewById(R.id.tvTitle)
        tvOverview = findViewById(R.id.tvOverview)

        if (intent.hasExtra(MOVIE_KEY)) {
            movieTarget = intent.getParcelableExtra(MOVIE_KEY)
            movieTarget.toString()
        } else {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        loadInfo()
    }

    private fun loadInfo() {
        tvTitle.text = movieTarget.name
        tvOverview.text = movieTarget.overview
    }

    companion object {
        private const val MOVIE_KEY: String = "Movie"

        fun startNewActivity(context: Context, movie: Movie?) {
            val intent = Intent(context, MovieDetailActivity::class.java)
            intent.putExtra(MOVIE_KEY, movie)
            context.startActivity(intent)
        }
    }
}

package com.example.teste1.ui.homeScreen.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.example.teste1.R
import com.example.teste1.model.Movie
import com.example.teste1.ui.homeScreen.movieDetailScreen.MovieDetailActivity

class MovieViewHolder(view : View) : RecyclerView.ViewHolder(view) {
    val tvTitle : TextView = view.findViewById(R.id.tvTitle)
    val tvYear : TextView? = view.findViewById(R.id.tvYear)
    var movie : Movie? = null

    init {
        view.setOnClickListener {
            MovieDetailActivity.startNewActivity(it.context, movie)
        }
    }
}
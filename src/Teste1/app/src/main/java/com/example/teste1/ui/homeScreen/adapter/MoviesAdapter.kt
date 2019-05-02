package com.example.teste1.ui.homeScreen.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.teste1.R
import com.example.teste1.repository.MoviesRepository
import com.example.teste1.util.DateUtil


class MoviesAdapter : RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.favorite_item_layout, parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int {
        return MoviesRepository.moviesList.size
    }

    override fun onBindViewHolder(p0: MovieViewHolder, count: Int) {
        // pegar um objeto da lista e popular o view holder
        val movie = MoviesRepository.moviesList[count]
        p0.tvTitle.text = movie.name
        p0.tvYear?.text = DateUtil.getYear(movie.releaseDate)
        p0.movie = movie
    }

}
package com.example.teste1.repository

import com.example.teste1.model.Movie
import java.util.*

object MoviesRepository {

    val moviesList = ArrayList<Movie>()


    fun saveMovies(moviesArgument: ArrayList<Movie>) {
        moviesList.clear()
        moviesList.addAll(moviesArgument)
    }

}
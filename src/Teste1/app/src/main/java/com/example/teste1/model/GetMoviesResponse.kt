package com.example.teste1.model

import com.google.gson.annotations.SerializedName

data class GetMoviesResponse(
    @SerializedName("movies")
    val moviesList: List<Movie>?
)
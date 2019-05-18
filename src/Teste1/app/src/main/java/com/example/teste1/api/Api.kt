package com.example.teste1.api

import com.example.teste1.model.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {


    @GET("filmesJson.json")
    fun getMovies(): Call<List<GetMoviesResponse>>


}
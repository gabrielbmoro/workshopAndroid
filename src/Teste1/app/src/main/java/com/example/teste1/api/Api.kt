package com.example.teste1.api

import com.example.teste1.model.GetMoviesResponse
import io.reactivex.Observable
import retrofit2.http.GET

interface Api {


    @GET("filmesJson.json")
    fun getMovies(): Observable<List<GetMoviesResponse>>


}
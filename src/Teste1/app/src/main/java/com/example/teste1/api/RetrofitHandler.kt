package com.example.teste1.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHandler {

    private const val BASE_URL = "https://raw.githubusercontent.com/gabrielbmoro/workshopAndroid/master/jsonFiles/"

    val repository: Api

    init {

        repository = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Api::class.java)

    }
}
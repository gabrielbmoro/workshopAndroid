package com.example.teste1.util

import com.example.teste1.model.Movie
import org.json.JSONArray
import java.util.*


object JSONConverter {


    fun convertToMovie(text: String): ArrayList<Movie> {

        val results = ArrayList<Movie>()

        val jsonArray = JSONArray(text)
        val rootElement = jsonArray.getJSONObject(0)

        val moviesFromJson = rootElement.getJSONArray("movies")

        var count = 0

        while (count < moviesFromJson.length()) {

            val id = moviesFromJson.getJSONObject(count).getLong(Movie.ID_KEY)
            val name = moviesFromJson.getJSONObject(count).getString(Movie.TITLE_KEY)
            val overview = moviesFromJson.getJSONObject(count).getString(Movie.OVERVIEW_KEY)
            val releaseDate = DateUtil.convertStringToDate(moviesFromJson.getJSONObject(count).getString(Movie.RELEASE_DATE))

            results.add(
                Movie(
                    id = id,
                    name = name,
                    overview = overview,
                    releaseDate = releaseDate
                )
            )
            count++
        }


        return results
    }
}
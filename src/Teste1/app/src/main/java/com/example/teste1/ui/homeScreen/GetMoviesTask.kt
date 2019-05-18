package com.example.teste1.ui.homeScreen

import android.os.AsyncTask
import com.example.teste1.api.RetrofitHandler
import com.example.teste1.model.Movie

class GetMoviesTask(contractArgument: UpdateHomeActivity) : AsyncTask<String?, List<Movie>?, List<Movie>?>() {

    private val contract: UpdateHomeActivity = contractArgument

    private var list: List<Movie>? = null


    override fun doInBackground(vararg params: String?): List<Movie>? {

        list = RetrofitHandler.repository
            .getMovies()
            .execute()
            .body()?.firstOrNull()?.moviesList

        return list
    }

    override fun onPostExecute(result: List<Movie>?) {
        if (result != null) {

            contract.finishRequest(result)
        }
    }
}
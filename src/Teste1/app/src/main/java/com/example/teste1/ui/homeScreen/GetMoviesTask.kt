package com.example.teste1.ui.homeScreen

import android.os.AsyncTask
import android.util.Log
import com.example.teste1.api.RetrofitHandler
import com.example.teste1.model.GetMoviesResponse
import com.example.teste1.model.Movie
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GetMoviesTask(contractArgument: UpdateHomeActivity) : AsyncTask<String?, List<Movie>?, List<Movie>?>() {

    private val contract: UpdateHomeActivity = contractArgument

    private var list: List<Movie>? = null


    override fun doInBackground(vararg params: String?): List<Movie>? {

        RetrofitHandler.repository.getMovies().enqueue(object : Callback<List<GetMoviesResponse>> {

            override fun onFailure(call: Call<List<GetMoviesResponse>>, t: Throwable) {
                list = emptyList()
                Log.e("onFailure", t.message)
            }

            override fun onResponse(call: Call<List<GetMoviesResponse>>, response: Response<List<GetMoviesResponse>>) {
                list = response.body()?.firstOrNull()?.moviesList ?: emptyList()
                list.toString()
            }

        })

        while (list == null)
            Thread.sleep(1000)

        return list
    }

    override fun onPostExecute(result: List<Movie>?) {
        if (result != null) {

            contract.finishRequest(result)
        }
    }
}
package com.example.teste1.ui.homeScreen

import android.os.AsyncTask
import com.example.teste1.api.NetworkUtil
import com.example.teste1.repository.MoviesRepository
import com.example.teste1.util.JSONConverter

class GetMoviesTask(contractArgument: UpdateHomeActivity) : AsyncTask<String?, String?, String?>() {

    private val contract: UpdateHomeActivity = contractArgument


    override fun doInBackground(vararg params: String?): String? {
        return NetworkUtil.callApi(NetworkUtil.buildUrl())
    }

    override fun onPostExecute(result: String?) {
        if (result != null) {

            MoviesRepository.saveMovies(JSONConverter.convertToMovie(result))

            contract.repositoryIsUpdated()
        }
    }
}
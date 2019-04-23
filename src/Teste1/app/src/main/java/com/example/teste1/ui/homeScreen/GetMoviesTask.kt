package com.example.teste1.ui.homeScreen

import android.os.AsyncTask
import android.util.Log
import com.example.teste1.api.NetworkUtil

class GetMoviesTask : AsyncTask<String?, String?, String?>() {
    override fun doInBackground(vararg params: String?): String? {
        return NetworkUtil.callApi(NetworkUtil.buildUrl())
    }

    override fun onPostExecute(result: String?) {
        if(result != null)
            Log.d("RESPONSE", result)
    }
}
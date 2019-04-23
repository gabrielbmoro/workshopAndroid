package com.example.teste1.ui.homeScreen

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.Toast
import com.example.teste1.R
import com.example.teste1.api.NetworkUtil
import com.example.teste1.ui.homeScreen.adapter.MoviesAdapter
import com.example.teste1.repository.MoviesRepository

class HomeActivity : AppCompatActivity() {

    private var name : String? = null
    private lateinit var rvList : RecyclerView
    private var getMoviesTask : GetMoviesTask? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        if(intent.hasExtra(NAME_KEY)) {
            name = intent.getStringExtra(NAME_KEY)
        } else
            finish()

        getMoviesTask = GetMoviesTask()
        getMoviesTask?.execute()



        MoviesRepository.moviesList


        rvList = findViewById(R.id.recyclerView)
        val linearLayoutManager = LinearLayoutManager(this)
        rvList.layoutManager = linearLayoutManager
        rvList.adapter = MoviesAdapter(MoviesRepository.moviesList)
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        if(getMoviesTask?.isCancelled==false) {
            getMoviesTask?.cancel(true)
        }
    }

    companion object {
        private const val NAME_KEY : String = "Name"
        fun startNewActivity(context : Context, name : String) {
            val intent = Intent(context, HomeActivity::class.java)
            intent.putExtra(NAME_KEY, name)
            context.startActivity(intent)
        }
    }
}

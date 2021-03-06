package com.example.teste1.ui.homeScreen

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ProgressBar
import com.example.teste1.R
import com.example.teste1.api.RetrofitHandler
import com.example.teste1.ui.homeScreen.adapter.MoviesAdapter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class HomeActivity : AppCompatActivity() {

    private var name: String? = null
    private lateinit var rvList: RecyclerView
    private lateinit var pbProgressBar: ProgressBar
    private var disposable: Disposable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        if (intent.hasExtra(NAME_KEY)) {
            name = intent.getStringExtra(NAME_KEY)
        } else
            finish()


        pbProgressBar = findViewById(R.id.pbProgressBar)
        rvList = findViewById(R.id.recyclerView)
        val linearLayoutManager = LinearLayoutManager(this)
        rvList.layoutManager = linearLayoutManager
        rvList.adapter = MoviesAdapter()
    }

    override fun onResume() {
        super.onResume()

        disposable = RetrofitHandler.repository.getMovies()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                val result = it?.firstOrNull()?.moviesList ?: emptyList()
                (rvList.adapter as? MoviesAdapter)?.changeContent(result)
                pbProgressBar.visibility = ProgressBar.GONE
            }

    }

    override fun onDestroy() {
        super.onDestroy()

        if (disposable?.isDisposed == false) {
            disposable?.dispose()
        }
    }

    companion object {
        private const val NAME_KEY: String = "Name"
        fun startNewActivity(context: Context, name: String) {
            val intent = Intent(context, HomeActivity::class.java)
            intent.putExtra(NAME_KEY, name)
            context.startActivity(intent)
        }
    }
}

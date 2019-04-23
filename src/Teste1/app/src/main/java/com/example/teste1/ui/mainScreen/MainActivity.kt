package com.example.teste1.ui.mainScreen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.teste1.R
import com.example.teste1.ui.homeScreen.HomeActivity

class MainActivity : AppCompatActivity() {

    val TAG: String = "MainActivity"
    lateinit var editTextName: EditText
    lateinit var btnGo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.etName)
        btnGo = findViewById(R.id.btnGo)


        btnGo.setOnClickListener {
            val name = editTextName.text.toString()
            HomeActivity.startNewActivity(name = name, context = this)
        }

        Log.d(TAG, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }
}

package com.example.logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "OnCreate Called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "OnStart Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity", "OnRestart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "OnResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "OnPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "OnStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "OnDestroy Called")
    }

}

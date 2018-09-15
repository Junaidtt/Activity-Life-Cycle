package com.example.ibookholiday5.activitylifecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG,"in onCreate")
    }



    override fun onStart() {
        super.onStart()
        Log.i(TAG,"in onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"in onResume")

    }

    override fun onRestart() {
        super.onRestart()

        Log.i(TAG,"in onResume")

    }

    override fun onPause() {
        super.onPause()

        Log.i(TAG,"in onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"in onStop")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i(TAG,"in onDestroy")

    }

}


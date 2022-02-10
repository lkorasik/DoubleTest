package com.example.doubletest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogExtension.i("onCreate")
    }

    override fun onStart() {
        super.onStart()

        LogExtension.i("onStart")
    }

    override fun onRestart() {
        super.onRestart()

        LogExtension.i("onRestart")
    }

    override fun onResume() {
        super.onResume()

        LogExtension.i("onResume")
    }

    override fun onPause() {
        super.onPause()

        LogExtension.i("onPause")
    }

    override fun onStop() {
        super.onStop()

        LogExtension.i("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        LogExtension.i("onDestroy")
    }
}
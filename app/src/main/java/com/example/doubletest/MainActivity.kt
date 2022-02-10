package com.example.doubletest

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var counterView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterView = findViewById(R.id.counter)
        counterView.text = 0.toString()

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

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt(COUNTER_KEY, counterView.text.toString().toInt() + 1)

        LogExtension.i("onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        counterView.text = savedInstanceState.getInt(COUNTER_KEY).toString()

        LogExtension.i("onRestoreInstanceState")
    }

    companion object{
        const val COUNTER_KEY = "COUNTER"
    }
}
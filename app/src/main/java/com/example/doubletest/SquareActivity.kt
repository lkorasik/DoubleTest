package com.example.doubletest

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SquareActivity: AppCompatActivity() {
    private lateinit var counterView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterView = findViewById(R.id.counter)
        counterView.text = 0.toString()

        var counter = intent.getIntExtra(COUNTER_KEY, 0).toLong()
        counter *= counter
        counterView.text = counter.toString()

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

        outState.putLong(COUNTER_KEY, counterView.text.toString().toLong())

        LogExtension.i("onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        counterView.text = savedInstanceState.getLong(COUNTER_KEY).toString()

        LogExtension.i("onRestoreInstanceState")
    }

    companion object{
        const val COUNTER_KEY = "COUNTER"
    }
}
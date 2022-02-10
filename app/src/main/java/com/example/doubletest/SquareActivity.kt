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

        var counter = intent.getIntExtra(IntentKeys.COUNTER_KEY, 0).toLong()
        counter *= counter
        counterView.text = counter.toString()

        LogExtension.i(this, "onCreate")
    }

    override fun onStart() {
        super.onStart()

        LogExtension.i(this, "onStart")
    }

    override fun onRestart() {
        super.onRestart()

        LogExtension.i(this, "onRestart")
    }

    override fun onResume() {
        super.onResume()

        LogExtension.i(this, "onResume")
    }

    override fun onPause() {
        super.onPause()

        LogExtension.i(this, "onPause")
    }

    override fun onStop() {
        super.onStop()

        LogExtension.i(this, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        LogExtension.i(this, "onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putLong(IntentKeys.COUNTER_KEY, counterView.text.toString().toLong())

        LogExtension.i(this, "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        counterView.text = savedInstanceState.getLong(IntentKeys.COUNTER_KEY).toString()

        LogExtension.i(this, "onRestoreInstanceState")
    }
}
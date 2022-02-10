package com.example.doubletest

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.base_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.square_activity -> {
                val intent = Intent(this, SquareActivity::class.java)
                intent.putExtra(COUNTER_KEY, counterView.text.toString().toInt())
                startActivity(intent)
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    companion object {
        const val COUNTER_KEY = "COUNTER"
    }
}
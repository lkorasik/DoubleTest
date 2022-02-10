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

        outState.putInt(IntentKeys.COUNTER_KEY, counterView.text.toString().toInt() + 1)

        LogExtension.i(this, "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        counterView.text = savedInstanceState.getInt(IntentKeys.COUNTER_KEY).toString()

        LogExtension.i(this, "onRestoreInstanceState")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.base_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.square_activity -> {
                val intent = Intent(this, SquareActivity::class.java)
                intent.putExtra(IntentKeys.COUNTER_KEY, counterView.text.toString().toInt())
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
package com.example.doubletest

import android.util.Log

object LogExtension {
    private const val TAG = "DoubleTestApp"

    fun i(message: String){
        Log.i(TAG, message)
    }
}
package com.example.doubletest

import android.app.Activity
import android.util.Log

object LogExtension {
    private const val TAG = "DoubleTestApp"

    fun i(activity: Activity, message: String){
        val tag = "$TAG.${activity::class.simpleName}"

        Log.i(tag, message)
    }
}
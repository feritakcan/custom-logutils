package com.alvgit.logutil

import android.util.Log

object LogDebug {

    private val TAG = "CustomLogDebug"

    fun d(message: String) {
        Log.d(TAG, message)
    }
}
package com.alvgit.errorutil

import android.util.Log

object ErrorDebug {

    private val TAG = "CustomErrorDebug"

    fun e(message: String) {
        Log.e(TAG, message)
    }
}
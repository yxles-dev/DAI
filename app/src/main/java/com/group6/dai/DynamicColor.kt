package com.group6.dai

import android.app.Application
import com.google.android.material.color.DynamicColors

class DynamicColor : Application() {
    override fun onCreate() {
        super.onCreate()
        DynamicColors.applyToActivitiesIfAvailable(this)
    }
}
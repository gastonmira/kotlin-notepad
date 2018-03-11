package com.udacity.notepad.util

import android.content.Context
import android.view.LayoutInflater

/**
 * Created by gaston.mira on 03/11/18.
 */

val Context.layoutInflater get() = LayoutInflater.from(this)
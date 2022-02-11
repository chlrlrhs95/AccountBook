package com.example.accountbook

import android.icu.text.NumberFormat

fun Long.format() = NumberFormat.getInstance().format(this)

package com.l2hyunwoo.pagingpractice.util

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("app:setValue")
fun TextView.setValue(value: Int) {
    this.text = value.toString()
}
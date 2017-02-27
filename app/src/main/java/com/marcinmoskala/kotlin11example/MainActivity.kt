package com.marcinmoskala.kotlin11example

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val map = mapOf("Poland" to "Warsaw", "England" to "London")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        map.map { (capital, country) -> "The capital of $country is $capital" }
                .joinToString(separator = "\n")
                .let { Toast.makeText(this, it, Toast.LENGTH_LONG).show() }
    }
}

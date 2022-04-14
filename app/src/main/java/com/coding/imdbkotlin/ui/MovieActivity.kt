package com.coding.imdbkotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coding.imdbkotlin.R
import kotlinx.android.synthetic.main.header_layout_main.*

class MovieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)
        btn_back.setOnClickListener {
            finish()
        }
    }
}
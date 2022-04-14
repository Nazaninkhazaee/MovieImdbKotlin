 package com.coding.imdbkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coding.imdbkotlin.ui.MovieActivity
import kotlinx.android.synthetic.main.header_layout.*

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_search.setOnClickListener{
            val intent = Intent(this,MovieActivity::class.java)
            startActivity(intent)
        }
    }
}

 
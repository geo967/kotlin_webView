package com.example.website_kotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val btn:Button=findViewById(R.id.button)

        btn.setOnClickListener(View.OnClickListener {
            val url = "https://api.publicapis.org/entries"
           // https://www.balldontlie.io/api/v1/players
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        })
    }
}
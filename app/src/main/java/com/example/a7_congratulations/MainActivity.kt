package com.example.a7_congratulations

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val next:ImageButton=findViewById(R.id.boton_next)
        next.setOnClickListener {
            val intent= Intent(this,game::class.java)
            startActivity(intent)
        }

    }

}
package com.example.petiverse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity4 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var imageButton3 = findViewById<ImageButton>(R.id.imageButton3)
        //var imageButton4 = findViewById<ImageButton>(R.id.imageButton3)
        var button = findViewById<Button>(R.id.button4)


        imageButton3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        button.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }


    }
}
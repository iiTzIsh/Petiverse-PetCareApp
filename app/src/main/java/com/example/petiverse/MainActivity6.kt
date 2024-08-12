package com.example.petiverse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity6 : AppCompatActivity() {

    private lateinit var home: ImageButton
    private lateinit var profile: ImageButton
    private lateinit var vaccine: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        home = findViewById(R.id.home)
        vaccine = findViewById(R.id.vaccine)
        profile = findViewById(R.id.profile)


        home.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        profile.setOnClickListener{
            val intent = Intent(this, MainActivity6::class.java) // Assuming ProfileActivity is the correct destination
            startActivity(intent)
        }
        vaccine.setOnClickListener{
            val intent = Intent(this, MainActivity5::class.java) // Assuming VaccineActivity is the correct destination
            startActivity(intent)
        }
    }
}

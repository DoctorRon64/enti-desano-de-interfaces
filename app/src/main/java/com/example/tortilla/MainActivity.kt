package com.example.tortilla

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var CanbioEscena: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CanbioEscena = findViewById(R.id.button2);
        CanbioEscena.setOnClickListener {
            onClick();
        }
    }

    private fun onClick() {
        val intent = Intent(this, SecondActivity::class.java);
        val message = "fack kotlin it's sucks dick and we could have litterly useed any other program";

        intent.putExtra( "greetings", message);
        startActivity(intent);
    }
}
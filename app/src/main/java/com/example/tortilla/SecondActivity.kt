package com.example.tortilla

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    private lateinit var CanbioEscena: Button;
    private lateinit var Texter: TextView;

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

       CanbioEscena = findViewById(R.id.button);
       CanbioEscena.setOnClickListener {
           onButtonClick();
       }

       Texter = findViewById(R.id.textView5);
       val intent = Intent(this, MainActivity::class.java);
       val message = intent.getStringExtra("greetings");
       Texter.setText(message);
    }

    private fun onButtonClick() {
        startActivity(intent);
    }
}
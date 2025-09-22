package com.example.tortilla

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    private lateinit var Button: Button;
    //private lateinit var TextView: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Button = findViewById(R.id.button2);
        //textView.
        Button.setOnClickListener{ onButtonClick() }
    }

    private fun onButtonClick() {
        Button.text = "Vale me odio este"
        //setContentView(R.layout.activity_main);
        //finishAffinity()
    }
}
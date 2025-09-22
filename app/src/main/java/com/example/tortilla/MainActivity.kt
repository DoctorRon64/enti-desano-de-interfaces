package com.example.tortilla

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var ButtonP1: Button;
    private lateinit var ButtonP2: Button;
    private lateinit var ScoreTextScoreText: TextView;
    private var Score: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        ButtonP1 = findViewById(R.id.button7);
        ButtonP2 = findViewById(R.id.button5);
        ScoreTextScoreText = findViewById(R.id.textScore);
        ScoreTextScoreText.text = "Score: 0"

        ButtonP1.setOnClickListener {
            UpdateScoreText(1);
        }

        ButtonP2.setOnClickListener {
            UpdateScoreText(-1);
        }

    }

    fun UpdateScoreText(value: Int) {
        Score += value

        when {
            Score >= 10 -> {
                ScoreTextScoreText.text = "Player 1 wins"
            }
            Score <= 0 -> {               // use <= so a negative score also ends the game
                ScoreTextScoreText.text = "Player 2 wins"
            }
            else -> {
                ScoreTextScoreText.text = "Score: $Score"
            }
        }
    }
}
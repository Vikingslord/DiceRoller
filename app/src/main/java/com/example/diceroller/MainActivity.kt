package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        val countButton: Button = findViewById(R.id.countUp)

        rollButton.setOnClickListener {
            rollDice()
        }

        countButton.setOnClickListener {
            countUp()
        }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun countUp() {

        val resultText: TextView = findViewById(R.id.result_text)
        val value = 1

        if (resultText.text == "Hello World") {
            resultText.text = value.toString()
        } else {

            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()

                val toast = Toast.makeText(this, "Limits Reached!", Toast.LENGTH_SHORT)
                toast.show()
            }
        }
    }
}
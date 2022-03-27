package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        val resetButton: Button = findViewById(R.id.reset)

        rollButton.setOnClickListener {
            rollDice()
        }

        resetButton.setOnClickListener {
            reset()
        }
    }

    private fun rollDice() {

        val randomInt = (1..6).random()

        val diceImage: ImageView = findViewById(R.id.dice_image)

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource) //updating source of ImageView
    }

    private fun reset() {
        val diceImage: ImageView = findViewById(R.id.dice_image)

        diceImage.setImageResource(R.drawable.empty_dice)
    }
}

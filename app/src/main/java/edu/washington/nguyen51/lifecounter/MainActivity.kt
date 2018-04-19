package edu.washington.nguyen51.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        p1Add.setOnClickListener {
            val lifeUpdated = updateLife(p1Lives, plusOne)
            p1Lives.setText(lifeUpdated.lifeCount)
        }
        p1Minus.setOnClickListener{
            val lifeUpdated = updateLife(p1Lives, minusOne)
            p1Lives.setText(lifeUpdated.lifeCount)
            if (lifeUpdated.lost) {
                loseMessage("Player 1")
            }
        }
        p1Add5.setOnClickListener {
            val lifeUpdated = updateLife(p1Lives, plus5)
            p1Lives.setText(lifeUpdated.lifeCount)
        }
        p1Minus5.setOnClickListener{
            val lifeUpdated = updateLife(p1Lives, minus5)
            p1Lives.setText(lifeUpdated.lifeCount)
            if (lifeUpdated.lost) {
                loseMessage("Player 1")
            }
        }

        p2Add.setOnClickListener {
            val lifeUpdated = updateLife(p2Lives, plusOne)
            p2Lives.setText(lifeUpdated.lifeCount)
        }
        p2Minus.setOnClickListener{
            val lifeUpdated = updateLife(p2Lives, minusOne)
            p2Lives.setText(lifeUpdated.lifeCount)
            if (lifeUpdated.lost) {
                loseMessage("Player 2")
            }
        }
        p2Add5.setOnClickListener {
            val lifeUpdated = updateLife(p2Lives, plus5)
            p2Lives.setText(lifeUpdated.lifeCount)
        }
        p2Minus5.setOnClickListener{
            val lifeUpdated = updateLife(p2Lives, minus5)
            p2Lives.setText(lifeUpdated.lifeCount)
            if (lifeUpdated.lost) {
                loseMessage("Player 2")
            }
        }

        p3Add.setOnClickListener {
            val lifeUpdated = updateLife(p3Lives, plusOne)
            p3Lives.setText(lifeUpdated.lifeCount)
        }
        p3Minus.setOnClickListener{
            val lifeUpdated = updateLife(p3Lives, minusOne)
            p3Lives.setText(lifeUpdated.lifeCount)
            if (lifeUpdated.lost) {
                loseMessage("Player 3")
            }
        }
        p3Add5.setOnClickListener {
            val lifeUpdated = updateLife(p3Lives, plus5)
            p3Lives.setText(lifeUpdated.lifeCount)
        }
        p3Minus5.setOnClickListener{
            val lifeUpdated = updateLife(p3Lives, minus5)
            p3Lives.setText(lifeUpdated.lifeCount)
            if (lifeUpdated.lost) {
                loseMessage("Player 3")
            }
        }

        p4Add.setOnClickListener {
            val lifeUpdated = updateLife(p4Lives, plusOne)
            p4Lives.setText(lifeUpdated.lifeCount)
        }
        p4Minus.setOnClickListener{
            val lifeUpdated = updateLife(p4Lives, minusOne)
            p4Lives.setText(lifeUpdated.lifeCount)
            if (lifeUpdated.lost) {
                loseMessage("Player 4")
            }
        }
        p4Add5.setOnClickListener {
            val lifeUpdated = updateLife(p4Lives, plus5)
            p4Lives.setText(lifeUpdated.lifeCount)
        }
        p4Minus5.setOnClickListener{
            val lifeUpdated = updateLife(p4Lives, minus5)
            p4Lives.setText(lifeUpdated.lifeCount)
            if (lifeUpdated.lost) {
                loseMessage("Player 4")
            }
        }
    }

    fun loseMessage(player: String) {
        Toast.makeText(this, player + " LOSES!", Toast.LENGTH_LONG).show()
    }
}

package edu.washington.nguyen51.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setPlayer(p1Name, p1Lives, p1Add, p1Minus, p1Add5, p1Minus5)
        setPlayer(p2Name, p2Lives, p2Add, p2Minus, p2Add5, p2Minus5)
        setPlayer(p3Name, p3Lives, p3Add, p3Minus, p3Add5, p3Minus5)
        setPlayer(p4Name, p4Lives, p4Add, p4Minus, p4Add5, p4Minus5)
    }

    data class Player (
        val name: TextView,
        val lives: TextView
    )

    fun setPlayer(name: TextView, lives: TextView, add1: Button, minus1: Button, addFive: Button, minusFive: Button) {
        val p = Player(name, lives)
        setListeners(p, add1, plusOne)
        setListeners(p, minus1, minusOne)
        setListeners(p, addFive, plus5)
        setListeners(p, minusFive, minus5)
    }

    fun setListeners(p: Player, btn: Button, action: Int) {
        btn.setOnClickListener {
            val lifeUpdated = updateLife(p.lives, action)
            p.lives.setText(lifeUpdated.lifeCount)
            if (lifeUpdated.lost) {
                loseMessage(p.name.text.toString())
            }
        }
    }

    fun loseMessage(player: String) {
        Toast.makeText(this, player + " LOSES!", Toast.LENGTH_LONG).show()
    }
}

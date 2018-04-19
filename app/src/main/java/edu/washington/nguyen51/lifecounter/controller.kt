package edu.washington.nguyen51.lifecounter

import android.widget.TextView

data class LifeUpdate (
    val lifeCount: String,
    val lost: Boolean
)

fun updateLife(view: TextView, action: String): LifeUpdate {
    val currentLives = view.text.toString().toInt()
    val newLifeCount = calculateLifeCount(currentLives, action)
    val lost = calculateLost(newLifeCount)
    return LifeUpdate(newLifeCount.toString(), lost)
}
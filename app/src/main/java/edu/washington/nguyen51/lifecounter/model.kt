package edu.washington.nguyen51.lifecounter

fun calculateLifeCount(num: Int, action: String): Int {
    when (action) {
        plusOne -> return num + 1
        minusOne -> return accountForZero(num - 1)
        plus5 -> return num + 5
        minus5 -> return accountForZero(num - 5)
    }
    return num
}

fun calculateLost(num: Int): Boolean {
    if (num == 0) {
        return true
    }
    return false
}

fun accountForZero(num: Int): Int {
    if (num < 0) {
        return 0
    }
    return num
}
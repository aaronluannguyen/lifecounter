package edu.washington.nguyen51.lifecounter

fun calculateLifeCount(num: Int, action: Int): Int {
    return accountForZero(num + action)
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
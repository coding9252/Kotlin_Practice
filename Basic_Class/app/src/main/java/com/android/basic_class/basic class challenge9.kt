package com.android.basic_class

// [9]숫자를 입력받아 입력 받은 숫자 높이 만큼의 별(*)을 피라미드 모양으로 출력해 주세요.
// ❓❓❓


fun main() {
    val num = readLine()!!.toInt()

    for (space in 1..num) {
        for (i in num-space downTo 1) {
            print(" ")
        }
        for (i in 1 until 2 * space) {
            print('*')
        }
        println()
    }
}
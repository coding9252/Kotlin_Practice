package com.android.basic_class

// [21] 1~입력수 (특정 범위)의 숫자 안에서 짝수일 때는 더하고 홀수일 때 뺀 값을 출력(입력 : 1~20, 출력 : 10)  -1, +2, -3, +4, -5…..
// 🐥

fun main () {
    println("숫자를 입력해 주세요.")

    val num = readln().toInt()
    var sum = 0

    for (i in 1.. num) {
        if (i % 2 == 0) {
            sum += i
        } else sum -= i
    }
    println(sum)
}

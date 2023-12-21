package com.android.basic_class

// [24] 정수들이 담긴 배열 arr[5개] 에서 자연수 n(입력받음)보다 큰 수의 개수 출력하기 (arr: [23, 52, 13, 26, 10], n:20 / 출력: 3)
// 🐥
fun main() {
    val arr = arrayOf(23, 52, 13, 26, 10)

    println("자연수를 입력해 주세요.")
    var n = readln().toInt()
    var count = 0

    if (n > 0) {
        for (i in arr) {
            if (i > n) {
                count++
            }
        }
        println("입력한 수보다 큰 수의 개수는 ${count}개 입니다")
    }
}


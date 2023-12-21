package com.android.basic_class

// [1] 1~100까지 정수 중 홀수의 합을 출력해 주세요. [입력: X, 출력: 2500]
// 🐥
//fun main() {
//    var sum = 0
//
//    for (i in 1..100 step 2) {
//        sum += i
//    }
//    println("$sum")
//}


//fun main() {
//    var sum = 0
//
//    for (num1 in 1..100) {
//        if (num1 % 2 != 0) {
//            sum += num1
//        }
//    }
//    println("홀수들의 합은 $sum 입니다.")
//}


fun main() {
    val sum = (1..100 step 2).sum()
    println("1부터 100까지의 홀수합은 ${sum}입니다.")
}


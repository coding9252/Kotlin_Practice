package com.android.basic_class

// [30] 정수 3개를 입력하고 가장 큰 수를 출력 (입력 : 20, 1000, 400 / 출력 : 1000)
// 🐥❓왜 readLine()?.toInt() ?: 0 했는데 exception 오류?? -> 해결 : toInt()말고 toIntOrNull()를 썼어야 함!!
//fun main() {
//    println("3개의 정수를 입력해 주세요.")
//    val num1 = readLine()?.toIntOrNull() ?:0
//    val num2 = readLine()?.toIntOrNull() ?:0
//    val num3 = readLine()?.toIntOrNull() ?:0
//
//    val max = arrayOf(num1, num2, num3)
//
//    println("가장 큰 수 : ${max.max()}")
//}


// 💡
//fun main() {
//    println("세 개의 정수를 입력하세요: ")
//    val num1 = readLine()!!.toInt()
//    val num2 = readLine()!!.toInt()
//    val num3 = readLine()!!.toInt()
//
//    val max = maxOf(num1, num2, num3)
//    println("가장 큰 수는 $max 입니다.")
//}


// 💡
//fun main() {
//    println("숫자 a를 입력해 주세요")
//    var a = readLine()!!.toInt()
//    println("숫자 b를 입력해 주세요")
//    var b = readLine()!!.toInt()
//    println("숫자 c를 입력해 주세요")
//    var c = readLine()!!.toInt()
//
//    //a가 제일 클 때
//    if (a - b > 0 && a - c > 0) {
//        println("가장 큰 숫자는 a : $a")
//        //b가 제일 클 때
//    } else if (b - a > 0 && b - c > 0) {
//        println("가장 큰 숫자는 b : $b")
//    } else if (c - a > 0 && c - b > 0) {
//        println("가장 큰 숫자는 c : $c")
//    } else if (a == b && a > c) {
//        println("가장 큰 숫자는 a와 b 로 $a 입니다.")
//    } else if (a == c && a > b) {
//        println("가장 큰 숫자는 a와 c 로 $a 입니다.")
//    } else if (b == c && b > a) {
//        println("가장 큰 숫자는 b와 c 로 $b 입니다.")
//    }
//}


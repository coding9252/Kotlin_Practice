package com.android.basic_class

// [2] 입력받은 문자열을 뒤집어서 출력해 주세요. [입력: abcde, 출력: edcba]
// 🐥
//fun main() {
//    println("문자를 입력해 주세요.")
//    val inputString = readln()!!.toString()
//    var reversedString = ""
//
//    for (i in inputString.length-1 downTo 0) {
//        reversedString += inputString[i]
//    }
//    println("$reversedString")
//}


fun main() {
    val str = readLine()!!.toString()
    println("${str.reversed()}")
}



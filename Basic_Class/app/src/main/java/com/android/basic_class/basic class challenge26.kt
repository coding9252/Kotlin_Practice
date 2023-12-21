package com.android.basic_class

// [26] 사용자로부터 1~12월을 입력 받아 해당 숫자에 맞는 계절을 출력하시오(입력 : 10 / 출력 : 가을) (12~2:겨울, 3~5:봄, 6~8:여름,9~11:가을)
// 🐥

//fun main() {
//    println("계절을 출력하기 위해 1~12중 한개의 숫자를 입력해 주세요.")
//
//    while (true) {
//        val month = readln().toInt()
//
//        when (month) {
//            in 3..5 -> println("봄")
//            in 6..8 -> println("여름")
//            in 9..11 -> println("가을")
//            in 12..2 -> println("겨울")
//            else -> println("잘못 입력하셨습니다.")
//        }
//    }
//}


// ❓ 1~12월이 아닌 걸 입력하면 계속 입력하게 하기
//fun main() {
//    var month: Int
//
//    do {
//        print("1부터 12까지의 숫자 중 하나를 입력해주세요: ")
//        month = readLine()!!.toInt()
//
//        val season = when (month) {
//            in 1..2, 12 -> "겨울"
//            in 3..5 -> "봄"
//            in 6..8 -> "여름"
//            in 9..11 -> "가을"
//            else -> {
//                println("1부터 12까지의 유효한 숫자를 입력해주세요")
//                continue
//            }
//        }
//
//        println("$season ")
//        break // 올바른 입력이 있을 때 멈춥니다.
//    } while (true)
//}


// ❓fun 만들기
//fun main() {
//    var inputNum = readln()!!.toInt()
//    val Month = weather(inputNum)
//
//    println("$inputNum 월은 $Month 입니다.")
//
//}
//
//fun weather (month: Int): String {
//    return when (month) {
//        12, 1, 2 -> "겨울"
//        3, 4, 5 -> "봄"
//        6, 7, 8 -> "여름"
//        9, 10, 11 -> "가을"
//        else -> "1..12의 숫자를 입력"
//    }
//}
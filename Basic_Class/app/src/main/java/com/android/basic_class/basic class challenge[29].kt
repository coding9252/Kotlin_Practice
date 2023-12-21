package com.android.basic_class

// [29] 3과목의 점수를 입력 받아 평균을 구하고 90점에서 100점까지는 A, 80점에서 89점까지는 B, 70점에서 79점까지는 C, 그 이하는 D를 출력 (입력 : 80 / 출력 : B)
// 🐥
fun main() {
    println("국어 점수를 입력해 주세요.")
    val kor = readln().toInt()
    println("수학 점수를 입력해 주세요.")
    val math = readln().toInt()
    println("영어 점수를 입력해 주세요.")
    val eng = readln().toInt()

    val average = (kor + math + eng) / 3

    when (average) {
        in 90..100 -> println("성적 : A")
        in 80..89 -> println("성적 : B")
        in 70..79 -> println("성적 : C")
        else -> println("성적 : D")
    }
}


//fun main() {
//    println("국어 점수를 입력해주세요")
//    var num = readLine()?.toInt() ?: 0
//    println("영어 점수를 입력해주세요")
//    var num1 = readLine()?.toInt() ?: 0
//    println("수학 점수를 입력해주세요")
//    var num2 = readLine()?.toInt() ?: 0
//
//    var average = (num+num1+num2)/3
//    println("평균점수 : ${average}")
//
//    when(average) {
//        in 90..100 -> println("\n성적 : A")
//        in 80..89 ->println("\n성적 : B")
//        in 70..79 -> println("\n성적 : C")
//        in 0..69 -> println("\n성적 : D")
//        else -> println("\n숫자를 잘못 입력하였습니다.")
//    }
//
//}
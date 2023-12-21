package com.android.basic_class

// [20]  점수를 입력 받아 학점 만들기, 90점이상 "A" 70~89점 "B", 50~69점 "C", 이외 점수는 "D"를 출력 (입력 : 75, 출력 : B)
// 🐥readLine()?.toIntOrNull() 써서 보완해 봄!
fun main() {
    println("점수를 입력해 주세요.")

    val score = readLine()?.toIntOrNull()

    if (score != null) {
        when(score) {
            in 90..100 -> println("A")
            in 70..89 -> println("B")
            in 50..69 -> println("C")
            in 49..0 -> println("D")
            else -> println("올바른 범위의 점수가 아닙니다.")
        }
    }
}


//fun main() {
//    println("점수를 입력하세요")
//    val score = readLine()?.toIntOrNull()
//
//    if (score != null) {
//        val grade: String = when (score) {
//            in 0..49 -> "D"
//            in 50..69 -> "C"
//            in 70..89 -> "B"
//            in 90..100 -> "A"
//            else -> "올바른 범위의 점수가 아닙니다."
//        }
//
//        println("${grade}")
//    }
//}
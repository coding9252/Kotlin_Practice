package com.android.basic_class

// [15] 두개의 주사위(1~6)를 던져서 특정한 숫자의 조합을 출력해 주세요. (입력:10 출력 4+6=10), 12를 넘어가면 예외처리, 여러 조합 중 아무거나 하나만 출력.
//fun main() {
//    val dice1 = arrayOf("1, 2, 3, 4, 5, 6")
//    val dice2 = arrayOf("1, 2, 3, 4, 5, 6")
//
//    for (i in dice1) {
//        for (j in dice2) {
//            if (i + j == 10) {
//
//            }
//        }
//    }
//}

fun main() {
    while (true) {
        println("2~12사이 정수를 입력하세요")
        val num = readLine()?.toIntOrNull() ?: 0
        var pairList = mutableListOf<List<Int>>()

        if (num in 2..12) {
            for (i in 1..6) {
                if (num-i in 1..6) {
                    pairList.add(listOf(i, num-i))
                }
            }
            println(pairList.random())
        }else {
            println("잘못 입력")
        }
    }
}

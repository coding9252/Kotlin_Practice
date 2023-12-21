package com.android.basic_class

// [5] 성적에 따라 반을 결정하고자 한다. 0~24점은 E반, 25~49점은 D반, 50~74점은 C반, 75~99점은 B반, 100점은 A반이 출력되게 하시오. (입력: 87, 출력: B반)
//fun main() {
//    println("점수를 입력해주세요.")
//    var score = readLine()!!.toInt()
//
//    when (score) {
//        in 0..24 -> print("E반")
//        in 25..49 -> print("D반")
//        in 50..74 -> print("C반")
//        in 75..99 -> print("B반")
//        100 -> print("A반")
//    }
//}


//fun main(){
//    val score = readln().toInt()
//    if(score in 0..24) {
//        println("E반")
//    } else if (score in 25..49) {
//        println("D반")
//    } else if (score in 50..74) {
//        println("C반")
//    } else if (score in 75..99) {
//        println("B반")
//    } else {
//        println("A반")
//    }
//}


//fun main() {
//    while (true) {    // 무한루프
//        val score = readLine()?.toIntOrNull()
//        var group = ""
//        if (score != null && score >= 0 && score <= 100) {
//            when (score) {
//                100 -> group = "A"
//                in 75..99 -> group = "B"
//                in 50..74 -> group = "C"
//                in 25..49 -> group = "D"
//                in 0..24 -> group = "E"
//            }
//            println("${group}반")
//        }
//    }
//}

fun main() {
    println("점수를 입력하세요")
    val score = readLine()?.toIntOrNull()    // IntOrNull인데 null말고 문자나 .도 입력받아진다. 왜지??

    if (score != null) {
        val group = when (score) {
            in 0..24 -> "E반"
            in 25..49 -> "D반"
            in 50..74 -> "C반"
            in 75..99 -> "B반"
            100 -> "A반"
            else -> "올바른 범위의 점수가 아닙니다."
        }
        println(group)
    }
}
package com.android.basic_class

// [34] 계이름  "도" "레" "미" "파" "솔" "라" "시" 가 있다. InputNumber를 입력했을 때 (1 - 도, 2 -레, 3- 미, 4 -파 ,5- 솔, 6 -라, 7 - 시) 로 출력하게 하시오.
// 1~7 이외 의 숫자가 입력 되면 " " 을 출력하게 하시오.  (입력 : 1234, 출력:도레미파) , (입력 : 1239, 출력 : 도레미)
// 🐥
//fun main() {
//    while (true) {
//        println("1부터 7까지의 숫자 중 하나를 입력하세요.")
//        var num = readln().toInt()
//        when (num) {
//            1 -> println("도")
//            2 -> println("레")
//            3 -> println("미")
//            4 -> println("파")
//            5 -> println("솔")
//            6 -> println("라")
//            7 -> println("시")
//            else -> println("")
//        }
//    }
//}


// 💡result 변수에 저장해서 해당하는 숫자의 계이름을 result에 출력
//fun main() {
//    println("숫자를 입력해 주세요.")
//    val num = readLine()!!.toInt()
//
//    val result = when (num) {
//        1 -> "도"
//        2 -> "레"
//        3 -> "미"
//        4 -> "파"
//        5 -> "솔"
//        6 -> "라"
//        7 -> "시"
//        else -> " "
//    }
//    println("$result")
//}


// 숫자를 문자열해서 when으로 매칭?
fun main() {
    println("원하시는 숫자를 입력해주세요")
    var num = readLine()!!.toString()
    for (i in num) {
        when (i) {
            '1' -> print("도")
            '2' -> print("레")
            '3' -> print("미")
            '4' -> print("파")
            '5' -> print("솔")
            '6' -> print("라")
            '7' -> print("시")
            else -> print(" ")
        }
    }
}



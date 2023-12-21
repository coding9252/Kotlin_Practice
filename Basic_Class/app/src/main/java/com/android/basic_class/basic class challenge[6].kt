package com.android.basic_class

// [6] 사용자가 입력한 문자열에 '크리스마스'가 포함이면 '메리크리스마스, '새해'가 포함이면 '새해 복 많이 받으세요', 이외의 단어면 '모두 행복하세요'가 출력되도록 코딩하세요.
//fun main() {
//    println("축하 문구를 입력해 주세요.")
//
//    val str = readln()
//
//    if (str.contains("크리스마스")) {
//        println("메리크리스마스!")
//    } else if (str.contains("새해")) {
//        println("새해 복 많~이 받으세요.")
//    } else println("모두 행복하세요~")    // null이어도 프린트 된다?!
//}


//fun main() {
//    println("축하문구를 입력해주세요.")
//    val str = readLine()!!.toString()
//    if (str.contains("크리스마스")) {
//        println("메리크리스마스")
//    } else if (str.contains("새해")) {
//        println("새해 복 많이 받으세요")
//    } else {
//        println("모두 행복하세요")
//    }
//}


//fun main() {
//    println("문구를 입력해주세요")
//    val inputString = readln()!!.toString()
//
//    if (inputString.contains("크리스마스") && inputString.contains("새해")) {
//        println("행복한 연말 보내시고 열심히 공부해서 멋진 개발자가 됩시다!")
//    } else if (inputString.contains("크리스마스")) {
//        println("메리크리스마스")
//    } else if (inputString.contains("새해")) {
//        println("새해 복 많이 받으세요")
//    } else {
//        println("모두 행복하세요")
//    }
//}


fun main() {
    println("축하 문구를 입력해 주세요.")

    while (true) {
        val str = readLine()

        if (!str.isNullOrEmpty()) {
            if ("크리스마스" in str)
                println("메리크리스마스")
            else if ("새해" in str)
                println("새해 복 많이 받으세요.")
            else
                println("모두 행복하세요.")
        }
    }
}
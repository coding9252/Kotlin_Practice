package com.android.basic_class

// [33] 입력한 수만큼의 정사각형을 '*'을 이용해서 만드세요 (입력: 4 출력:4x4)
// 🐥
//fun main() {
//    println("정수를 입력해 주세요.")
//    val height = readln().toInt()        // 3
//
//    for (i in 1..height) {               // 1               2             3
//        for (i in 1..height) {           // 1,2,3           1,2,3         1,2,3
//            print("*  ")                 // ***             ***           ***
//        }
//        println()                        // 줄 바꿈
//    }
//}


// 💡💡
//꽉찬정사각형
//fun main() {
//    while (true) {
//        println("자연수를 입력하세요")
//        val height = readLine()?.toIntOrNull() ?: 0
//        for (i in 1..height) {
//            println("*  ".repeat(height))
//        }
//
//    }
//}

// 💡💡❓❓
//테두리 정사각형
fun main() {
    while (true) {
        println("한 변의 * 개수를 자연수로 입력하세요")
        val length = readLine()?.toIntOrNull() ?: 0
        for (i in 1..length) {
            if (i == 1 || i == length) {
                println("*  ".repeat(length - 1) + "*")
            } else {
                println("*" + " ".repeat(length * 3 - 4) + "*")
            }

        }

    }
}


// 💡
//fun main() {
//    println("숫자를 입력해주세요")
//    var num = readLine()?.toInt() ?: 0
//    solution(num)
//}
//
//fun solution(num : Int) {
//    for (i in 1..num) {
//        for(j in 1..num){
//            print("*")
//        }
//        println()
//    }
//}


// 💡❓buildString?
//fun main() {
//    var num = readLine()!!.toInt()
//    var starList = mutableListOf<String>()
//
//    for (i in 1..1) {
//        var star = buildString {
//            repeat(num) {
//                append("*")
//            }
//        }
//        starList.add(star)
//    }
//    repeat(num) {
//        starList.forEach {
//            println(it)
//        }
//    }
//}


// 💡repeat() 활용
//fun main() {
//    val inputNum1 = readLine()!!.toInt()
//    println(("* ".repeat(inputNum1)+"\n").repeat(inputNum1))
//}





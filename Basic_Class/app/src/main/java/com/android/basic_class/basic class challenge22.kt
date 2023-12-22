package com.android.basic_class

// [22] 1부터 100까지의 수 중 2의 배수이지만 3의 배수는 아닌 수 출력하기 (입력: 없음 / 출력 : 2, 4, 8, 10, 14 .. 94, 98, 100)
// 🐥❓joinToString()이 안 써진다?!
//fun main() {
//    for (i in 1..100) {
//        if (i % 2 == 0 && i % 3 != 0) {
//            print("$i ")
//        }
//    }
//}


// 🐥
//fun main() {
//    var list = mutableListOf<String>()
//
//    for (i in 1..100) {
//        if (i % 2 == 0 && i % 3 != 0) {
//            list.add("$i")
//        }
//    }
//    println(list)
//}


// 💡
fun main() {
    val result = (1..100).filter { it % 2 == 0 && it % 3 != 0}
    println(result)
}


//fun main() {
//    for (i in 1..100) {
//        if (i % 2 == 0 && i % 3 != 0) {
//            println(i)
//        }
//    }
//}






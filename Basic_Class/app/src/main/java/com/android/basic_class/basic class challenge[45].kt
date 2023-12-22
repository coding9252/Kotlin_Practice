package com.android.basic_class

// [45] 두개의 주사위를 던지고 합이 8이 나오는 모든 경우의 수 (출력 (2,6), (3,5),(4,4), (5,3), (6,2))
// 🐥
fun main() {
    val dice1 = arrayOf(1, 2, 3, 4, 5, 6)
    val dice2 = arrayOf(1, 2, 3, 4, 5, 6)

    for (i in dice1) {
        for (j in dice2) {
            if (i + j == 8) {
                println("($i, $j)")
            }
        }
    }
}


// 💡
//fun main() {
//
//    for (num1 in 1..6) {
//        for (num2 in 1..6) {
//            val sum = num1 + num2
//            if (sum == 8) {
//                println ("$num1, $num2")
//            }
//        }
//    }
//}


//fun main() {
//    println("합이 8이 되는 두 주사위 던지기 결과:")
//
//    for (dice1 in 1..6) {
//        for (dice2 in 1..6) {
//            if (dice1 + dice2 == 8) {
//                println("$dice1, $dice2")
//            }
//        }
//    }
//}
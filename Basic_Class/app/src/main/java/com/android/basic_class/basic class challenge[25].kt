package com.android.basic_class

// [25] 구구단을 2단부터 9단까지 출력하시오(입력 X / 출력: 2 * 1 = 2 ~ 9 * 9 = 81)
// 🐥
//fun main() {
//    for (i in 2..9) {
//        println("${i}단")
//        for (j in 1..9) {
//            println("$i x $j = ${i * j}")
//        }
//    }
//}


// 💡
fun main() {
    val list1 = listOf(2, 3, 4, 5, 6, 7, 8, 9)
    val list2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    for(i in list1[0]..list1[7]) {
        for(j in list2[0]..list2[8]){
            var ij = i * j
            println("$i * $j = $ij")
        }
    }
}



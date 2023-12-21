package com.android.basic_class

//[4] 1~1000까지 정수 중에, 3의 배수 "또는" 8의 배수에 속하는 값을 추출하고, 총합을 구하시오. (24의 배수는 제외)
//fun main() {
//    var answer = 0
//
//    for (i in 1..1000) {
//        if (i % 3 == 0 || i % 8 == 0) {
//            if (i % 24 != 0) {
//                print("$i ")
//                answer += i
//            }
//        }
//    }
//    println()
//    println(answer)
//}


//fun main() {
//    var answer = 0
//
//    for (i in 1..1000) {
//        if ((i % 3 == 0 || i % 8 == 0) && !(i % 3 == 0 && i % 8 == 0)) {
//            print("$i ")
//            answer += i
//        }
//    }
//    println()
//    println(answer)
//}

//fun main() {
//    var answer = 0
//    var ansList = mutableListOf<Int>()
//    for (i in 1..1000) {
//        if (i % 3 == 0 || i % 8 == 0) {
//            if (i % 24 != 0) {
//                ansList.add(i)
//            }
//        }
//    }
//    answer = ansList.sum()
//    println(ansList)
//    println(answer)
//}

//fun main() {
//    var answer = 0
//    var ansList = ArrayList<Int>()
//
//    for (i in 1..1000) {
//        if ((i % 3 == 0 || i % 8 == 0) && (i % 24 != 0)) {
//            ansList.add(i)
//            answer += i
//        }
//    }
//    println(ansList)
//    println(answer)
//}







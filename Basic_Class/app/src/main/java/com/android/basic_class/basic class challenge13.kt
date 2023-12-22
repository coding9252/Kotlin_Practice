package com.android.basic_class

// [13] 1에서 10중에 약수를 출력해주세요.(입력:9, 출력:1,3,9),  입력:10, 출력 : 1,2,5,10
// 🐥
//fun main() {
//    println("정수를 입력해 주세요.")
//    val num = readln().toInt()
//    var list = mutableListOf<String>()
//
//    for (i in 1..num) {
//        if (num % i == 0) {
//            list.add("$i")
//        }
//    }
//    println(list.joinToString(", "))
//}


//fun main() {
//    println("1에서 10까지의 숫자 중 하나를 입력해 주세요.")
//    var num = readLine()!!.toInt()
//    for (i in 1..num) {
//        if (num % i == 0) {
//            print("$i ")
//        }
//    }
//}


//❓ 15 입력하면 [1,3,5] 나옴
//fun main () {
//    val inputNumber = readLine()!!.toInt()
//    val number = (1..10).filter { inputNumber % it == 0 }
//    var mlb = mutableListOf<Int>()
//
//    for (num in number){
//        mlb.add(num)
//    }
//    println(mlb)
//}
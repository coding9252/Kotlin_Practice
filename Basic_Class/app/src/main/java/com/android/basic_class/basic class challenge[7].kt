package com.android.basic_class

// [7] 입력받은 숫자만큼 증가하는 코드를 작성해 주세요.(1~100까지) (입력 ex 3 / 출력 : 1 4 7 10 13 .. 94 97 100)
//fun main() {
//    println("숫자를 입력해 주세요.")
//
//    val step = readln().toInt()
//    var list = ArrayList<Int>()
//
//    for (i in 1..100 step step) {
//        list.add(i)
//    }
//    print(list)
//}


//fun main() {
//    println("단계를 입력해 주세요.")
//
//    val step = readLine()!!.toInt()
//
//    for (i in 1..100 step step) {
//        print("$i ")
//    }
//}


fun main() {   // 여기부터 다시
    val num = readLine()!!.toInt()
    var answer = 1

    while (answer <= 100){
        println("$answer")
        answer += num
    }
}
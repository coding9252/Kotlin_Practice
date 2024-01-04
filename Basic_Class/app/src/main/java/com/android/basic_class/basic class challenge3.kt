package com.android.basic_class

// [3] 입력 받은 정수의 홀짝을 구분하는 코드를 작성해 주세요.(0은 제외) [입력: 0, 출력: 다시 입력해 주세요.], [입력: 5, 출력: 홀수]
// 🐥
fun main() {
    println("정수를 입력해 주세요.")

    while (true) {
        val num = readln().toInt()

        if (num == 0) {
            println("다시 입력해 주세요.")
            continue
        } else if (num % 2 == 0) {
            println("짝수")
        } else println("홀수")
    }
}

// 🐥
//fun main() {
//    println("정수를 입력해 주세요.")
//
//    while (true) {
//        val num = readln().toInt()
//        if (num == 0) {
//            println("다시 입력해 주세요.")
//            continue
//        } else if (num % 2 == 0) {
//            println("짝수")
//        } else println("홀수")
//        break
//    }
//}
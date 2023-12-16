package com.android.basic_syntax

// [조건문, 반복문, 배열을 활용한 문제 5개 출제하기]

// 1. 1~100까지 정수 중 홀수의 합을 출력해 주세요. [입력: X, 출력: 2500]
//fun main() {
//    var sum = 0
//
//    for (number in 1..100 step 2) {
//        sum += number
//    }
//    println("$sum")
//}


// 2. downTo 를 활용하여 10이하의 짝수를 출력해 주세요. [입력: X, 출력: 10 8 6 4 2]
//fun main() {
//    for (num in 10 downTo 1 step 2) {
//        println(num)
//    }
//}


// 3. 32의 약수의 합을 출력해 주세요. [입력: X, 출력: 63]
//fun main() {
//    var count = 0
//
//    for (i in 1..32) {
//        if (32 % i == 0) {
//            count += i
//        }
//    }
//    println("$count")
//}


// 4. 입력받은 문자열을 뒤집어서 출력해 주세요. [입력: abcde, 출력: edcba]
//fun main() {
//    println("뒤집을 문자열을 입력해 주세요.")
//    val inputString = readln()!!.toString()
//    var reversedString = ""
//
//    for (i in inputString.length-1 downTo 0) {
//        reversedString += inputString[i]
//    }
//    println("$reversedString")
//}


// 5. 입력 받은 정수의 홀짝을 구분하는 코드를 작성해 주세요.(0은 제외) [입력: 0, 출력: 다시 입력해 주세요.], [입력: 5, 출력: 홀수]
fun main() {
    println("정수를 입력해 주세요.")

    while (true) {
        var num = readln().toInt()
        if (num == 0) {
            println("다시 입력해 주세요.")
            continue
        } else if (num % 2 == 0) {
            println("짝수")
        } else println("홀수")
        break
    }
}
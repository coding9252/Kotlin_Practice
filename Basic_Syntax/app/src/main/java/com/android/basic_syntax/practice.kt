package com.android.basic_syntax

// 1. 국어 점수가 84, 92, 95, 88점인 4명의 학생이 있습니다. 첫 번째부터 두 번째까지 각 학생의 영어 점수를 출력하세요. ex) 몇 번째 학생의 영어 점수는 몇 점입니다.
//fun main() {
//    val engs = arrayOf(84, 92, 95, 88)
//
//    for ((idx, eng) in engs.withIndex())
//        println("${idx + 1}번째 학생의 영어 점수는 ${eng}점 입니다. ")
//}


// 2. 1부터 1000까지의 정수 중 짝수들의 합을 출력하세요.
// 첫 번째 풀이
//fun main() {
//    var sum = 0
//
//    for (number in 1..1000) {
//        if (number % 2 == 0) {
//            sum += number
//        }
//    }
//    println("$sum")
//}

// 두 번째 풀이
//fun main() {
//    var sum = 0
//
//    for (number in 0..1000 step 2) {        // in 2..1000 step 2 해도 결과는 같음
//        sum += number
//    }
//    println("$sum")
//}

// 세 번째 풀이
//fun main() {
//    var sum = (0..1000 step 2).sum()
//
//    println("$sum")
//}


// 3. 주어진 정수 배열에서 최댓값을 찾아 출력하세요. O
// 첫 번째 풀이
//fun main() {
//    println("정수 배열을 입력해 주세요.")
//    val numbers = readln()!!.split(" ").map { it.toInt() }.toTypedArray()    // 콘솔에서 읽어들여서, 강제로 not null 해주고, 중간에 공백이 있게 쪼개주고, map컬렉션으로 만드는데 그 안에 있는 애들을 Int로 변환시키고, array로 저장하는 것
//
//    var maxValue = numbers[0]    // 초기값은 첫 번째 값 넣어 놓으면 된다.
//
//    for (number in numbers) {    // numbers 배열에 있는 값 다 돌리기
//        if (number > maxValue)   // number가 maxValue 보다 더 크면 number에 넣어주고 아니면 말고 for문을 돌림.
//            maxValue = number
//    }
//    println("최댓값 : $maxValue")
//}

// 두 번쨰 풀이
//fun main() {
//    println("정수 배열을 입력해 주세요.")
//
//    val numbers = readln()!!.split(" ").map { it.toInt() }.toTypedArray()
//
//    println("최댓값 : ${numbers.max()}")  // for문 안 돌려도 한 줄이면 된다. max()나 min()도 알아두기!
//}


// 4. 평균 이상의 숫자 개수 구하기 O
// 첫 번째 풀이
//fun main() {
//    println("정수 배열을 입력해 주세요.")
//
//    val numbers = readln()!!.split(" ").map { it.toInt() }.toTypedArray()
//    var sum = 0
//
//    for (number in numbers) {
//        sum += number
//    }
//
//    val average = sum / numbers.size
//    var count = 0
//
//    for (number in numbers) {
//        if (number > average) count++
//    }
//    println("$count")
//}

// 두 번째 풀이(모르겠다.)
//fun main() {
//    println("정수 배열을 입력해 주세요.")
//    val numbers = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
//    val average = numbers.average()    // average()로 평균 구하기
//    val countAboveAverage = numbers.count { it >= average }    // count{}
//    println("평균 이상인 숫자의 개수: $countAboveAverage")
//}


// 5. 문자열 뒤집기 O
//fun main() {
//    println("문자열을 입력하세요.")
//
//    val inputString = readln()!!
//    var reversedString = ""
//
//    for (i in inputString.length-1 downTo 0) {
//        reversedString += inputString[i]
//    }
//
//    println("뒤집힌 문자열 : $reversedString")
//}


// 6. 32의 약수를 출력하세요. O
//fun main() {
//    for (i in 1..32) {
//        if (32 % i == 0) {
//            println("$i")
//        }
//    }
//}


// 7. 각 자릿수의 합 구하기


// 8. 사용자에게 5개의 정수를 입력받아 오름차순으로 정렬 후 출력하세요.(선택정렬 알고리즘 사용, 배열 사용은 가능, 배열의 sort() 사용 금지)
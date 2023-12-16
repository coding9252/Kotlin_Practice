package com.android.basic_syntax

// [5. 반복문]

//fun main() {
//    for (i in 1 until 11) {                // i는 상수
//        println("${i}번째 : 내 이름은 쵸파")    // 1~10번째
//    }                                      // for문은 자동으로 1씩 증가하며 실행돼서 i++을 하지 않아도 됨(상수 i를 맘대로 바꿀 수 없음)
//}


//fun main() {
//    for (i in 1..10)
//        println("${i}번째 : 내 이름은 덕만")    // 1~10번째
//}


//fun main() {
//    var i = 1
//
//    while (i < 11) {                        // 1~10번째
//        println("${i}번째 : 내 이름은 딱지")
//        i++
//    }
//}


//fun main() {
//    var i = 0
//
//    while (i < 10) {                           // 1~10번째
//        println("${i + 1}번째 : 내 이름은 딱지")
//        i++
//    }
//}


//fun main() {
//    var count = 1
//
//    while (count <= 5) {
//        println("count : ${count}")
//        count++
//    }
//}


// 문자열 순회 예제
//fun main() {
//    val message = "Hello, Kotlin!"
//
//    for (char in message) {
//        println(char)
//    }
//}


//fun main() {
//    var infos =
//        arrayOf("가탄", "탁이", "쵸파", "덕만", "딱지")       // arrayOf는 리스트 묶음(infos 안에는 변수 5개가 들어있는 것)
//
//    for (info in infos) {           // infos 안에서 1개씩 꺼내서 info에 넣음. 5개의 변수가 차례대로 하나씩 info에 들어감.
//
//        if (info == "쵸파") {
//            println("찾았다 쵸파!")
//            break                   // break는 가장 가까운 반복문에서 탈출하고 다음 블록으로 넘어감.
//        } else {
//            continue                // continue는 이후의 코드를 실행하지 않고 다시 반복문 처음으로 돌아가서 다음 info를 가져옴.
//        }
//    }
//}


//fun main() {
//    var duckmanStatus = false
//    println("덕만이는 매우 배가 고픕니다..")
//    println("사료를 10번 먹여주세요!")
//
//    // 덕만이가 배고플 때만(false일 떄만) 밥을 줄 수 있음
//    if (duckmanStatus == false) {
//        for (idx in 1..10) {
//            println("${idx}번째:냠냠")
//        }
//    }
//
//    // 밥을 10번 준 이후의 상태 변화
//    duckmanStatus = true
//    if (duckmanStatus == true) {
//        println("배부른 덕만입니다!")
//    }
//}


// 이중 for문(중첩 반복문을 사용한 구구단)
fun main() {
    for (i in 1..9) {
        for (j in 1..9) {
            val result = i * j
            println("$i x $j = $result")
        }
    }
}
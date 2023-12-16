package com.android.basic_syntax

// [2. 변수와 상수]

fun main() {
    // 변수는 var(variable)
    // 1. 숫자를 나타내는 변수
    // var 변수 이름: 자료형(생략 가능) = 값
    // 값을 특정 자료형을 저장할 수 있는 변수 이름에 대입한다.
    // var num1: Int = 1

//    var num1 = 1
//    println("내 첫 변수 num1에는 ${num1}이 들어있다.")
//    num1 = 100
//    println("변수 num1을 ${num1}로 변경했다.")


    // 2. 문자를 나타내는 변수
    // var 변수 이름: 자료형(생략 가능) = ''
    // var one1: Char = ''

//    var one1 = '쵸'
//    println("첫 번째 문자는 ${one1}야.")
//    one1 = '파'
//    println("변경한 문자는 ${one1}야.")


    // 3. 문자열을 나타내는 변수
    // var 변수 이름: 자료형(생략 가능) = ""
    // var name: String = "ㅇㅇ"

//    var name = "참새"
//    println("새의 종류를 저장하는 name 변수 안에는 ${name}가 들어있다.")
//    name = "조롱박이"
//    println("변경한 name 변수 안에는 ${name}가 들어있다.")


    // 상수는 val(value)
    // 4. 상수
    val num1 = 1
    println("내 첫 변수 num1에는 ${num1}이 들어있다.")
    // num1 = 100  --> Val cannot be reassigned 에러 발생!
    // val num1은 변수가 아닌 상수이므로 값을 재할당 못 함
}
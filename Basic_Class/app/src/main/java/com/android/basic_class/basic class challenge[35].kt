package com.android.basic_class

// [35] 2024년도는 용띠의 해이다. 2012년도, 2000년도 처럼 용띠의 해를 입력하면 "용띠의 해입니다.", 아니면 "false"를 출력하시오.
// 입력 : 1988 출력 : "1988년도는 용띠의 해입니다" / 입력 : 2001 출력 : "false"
// 🐥
fun main() {
    println("원하시는 연도를 입력해 주세요.")
    val year = readln().toInt()

    if (year % 12 == 8) {
        print("${year}년도는 용띠의 해입니다.")
    } else print("false")
}
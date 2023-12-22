package com.android.basic_class

// [43] 1~100의 숫자중 2의 배수이면서 3의배수(and조건)인 숫자 출력해 주세요.
// 🐥
fun main() {
    for (i in 1..100) {
        if (i % 2 == 0 && i % 3 == 0) {
            println(i)
        }
    }
}






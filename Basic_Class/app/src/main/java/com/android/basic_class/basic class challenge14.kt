package com.android.basic_class

// [14] 1부터 100까지의 수 중에서 3과 5의 배수(and 조건)인 수들의 합을 출력해 주세요. (입력: 없음, 출력: 315),  15, 30,,
// 🐥
//fun main() {
//    var sum = 0
//
//    for (i in 1..100) {
//        if (i % 3 == 0 && i % 5 == 0) {
//            sum += i
//        }
//    }
//    println(sum)
//}


//fun main() {
//    var ans = 0
//
//    for (i in 15..100 step 15) {
//        ans += i
//    }
//    println(ans)
//}


// ❓
fun main () {
    val number = (1..100).filter { it % 3 == 0 && it % 5 == 0}
    var total = 0

    for (num in number) {
        total += num
    }
    println(total)
}

package com.android.basic_class

// [10] 알파벳'a'의 개수 세기(입력:"apple", 출력:1), 대소문자 구분함.
//fun main() {
//    println("원하시는 단어를 입력해 주세요.")
//    val str = readln().toString()
//    var count = 0
//
//    for (i in str) {
//        if (i == 'a') {
//            count++
//        }
//    }
//    println(count)
//}


// ❓
fun main() {
    val str = readLine()!!.toString()
    var answer = 0

    str.map {
        if (it == 'a') {
            answer++
        }
    }
    println("$answer")
}


// 💡
//fun main(){
//    while(true){
//        val str=readLine()
//        if(!str.isNullOrEmpty()){
//            println(str.count{it=='a'})
//        }
//    }
//}


//fun main() {
//    while (true) {
//        val str = readLine() ?: ""
//        var strList = str.toMutableList()
//        var ans = 0
//
//        if ("a" in str) {
//            while ('a' in strList) {
//                strList.remove('a')
//                ans++
//            }
//            println(ans)
//        } else {
//            println(ans)
//        }
//
//    }
//}

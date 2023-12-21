package com.android.basic_class

// [12] 단어별로 단어 뒤집기(입력: "Hello World", 출력: "olleH dlroW") 띄어쓰기 필수

// ❓
fun main() {
    println("뒤집을 단어를 입력해 주세요.")

    val str = readln()

    println(str.reversed().split(' ').reversed().joinToString(" "))

}


// ❓
//fun main(){
//    while(true){
//        val str=readLine()
//        if(!str.isNullOrEmpty() && (" " in str)){   //null이 아니고, 비어있지 않고, 띄어쓰기 필수 포함
//            val split=str.split(" ")    //띄어쓰기 기준으로 잘라 리스트로 반환
//            for(i in split){
//                val reverse=i.reversed()
//                print("$reverse ")
//            }
//        }
//    }
//}
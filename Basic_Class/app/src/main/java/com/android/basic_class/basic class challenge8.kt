package com.android.basic_class

// [8] 3과목 점수를 입력받아 평균 점수를 출력하고, 평균 점수가 70점 이상이면 합격입니다를, 아니면 불합격입니다를 출력해주세요.
// 🐥
//fun main() {
//    println("3과목 점수를 입력해 주세요.")
//
//    var score1 = readln().toInt()
//    var score2 = readln().toInt()
//    var score3 = readln().toInt()
//
//    var average = (score1 + score2 + score3) / 3
//
//    println("평균 점수: $average")
//
//    if (average >= 70) {
//        println("합격입니다.")
//    } else println("불합격입니다.")
//}


// 💡
//fun main() {
//    println("국어점수를 입력해주세요")
//    var num = readLine()?.toInt() ?: 0
//    println("수학점수를 입력해주세요")
//    var num1 = readLine()?.toInt() ?: 0
//    println("영어점수를 입력해주세요")
//    var num2 = readLine()?.toInt() ?: 0
//    println(solution(num, num1, num2))
//}
//
//fun solution(num: Int, num1: Int, num2: Int): String {
//
//    var average = (num + num1 + num2) / 3
//
//    return if (average >= 70) "합격입니다." else "불학겹니다."
//}



// ❓
fun main() {
    while (true) {
        println("첫번째 과목 점수 입력")
        val score1 = readLine()?.toIntOrNull() ?: -1
        println("두번째 과목 점수 입력")
        val score2 = readLine()?.toIntOrNull() ?: -1
        println("세번째 과목 점수 입력")
        val score3 = readLine()?.toIntOrNull() ?: -1

        if (score1 in 0..100 && score2 in 0..100 && score3 in 0..100) {
            val average = mutableListOf<Int>(score1, score2, score3).average()
            println("평균점수는 ${average}점")
            if (average >= 70) {
                println("합격입니다")
            } else {
                println("불합격입니다")
            }
        } else {
            println("0~100사이의 점수를 입력해주세요")
            continue
        }
    }
}


//fun main(){
//    while(true){
//        val grade1=readLine()?.toIntOrNull()
//        val grade2=readLine()?.toIntOrNull()
//        val grade3=readLine()?.toIntOrNull()
//        if(grade1!=null && grade1>=0 && grade1<=100 && grade2!=null && grade2>=0 && grade2<=100 && grade3!=null && grade3>=0 && grade3<=100){
//            val avg=(grade1+grade2+grade3)/3
//            print("평균:${avg} / ")
//            if(avg>=70)
//                println("합격입니다.")
//            else
//                println("불합격입니다.")
//        }
//    }
//}

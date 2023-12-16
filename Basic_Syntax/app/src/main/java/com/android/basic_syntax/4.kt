package com.android.basic_syntax

// [4. 조건문]

//fun main() {
//    var eventname = "덕만"
//    var myname = "덕만"
//
//    if (eventname == myname) {
//        println("축하드립니다! ${myname}님! 이벤트에 당첨되셨습니다!!")
//    } else {
//        println("${myname}님! 환영합니다!")
//    }
//}

//fun main() {
//    var curretTicketCounts = 0
//
//    if (curretTicketCounts == 3) {
//        println("죄송합니다. 현재 티켓이 메진되었습니다.")
//    } else {
//        println("티켓 구매에 성공하셨습니다.")
//        curretTicketCounts--
//    }
//}

//fun main() {
//    var koreanScore = 90
//    var englishScore = 95
//    var mathScore = 95
//    var average = (koreanScore + englishScore + mathScore) / 3
//
//    if (average >= 90) {
//        println("당신의 등급은 A입니다.")
//    } else if (average >= 80) {        // 80점~89점
//        println("당신의 등급은 B입니다.")
//    } else if (average >= 70) {
//        println("당신의 등급은 C입니다.")
//    } else {
//        println("당신의 등급은 F입니다.")
//    }
//}

//fun main() {
//    var koreanScore = readln()!!.toInt()
//    var englishScore = readln()!!.toInt()
//    var mathScore = readln()!!.toInt()
//    var average = (koreanScore + englishScore + mathScore) / 3
//
//    if (average >= 90) {
//        println("당신의 등급은 A입니다.")
//    } else if (average >= 80) {        // 80점~89점
//        println("당신의 등급은 B입니다.")
//    } else if (average >= 70) {
//        println("당신의 등급은 C입니다.")
//    } else {
//        println("당신의 등급은 F입니다.")
//    }
//}

fun main() {
    var todayNumber = readln()!!.toInt()

    when(todayNumber) {    // 나중에 랜덤성을 부여하는 것도 시도해 보자.
        1 -> {
            println("재물이 들어올 확률이 높습니다.")
        }
        2 -> {
            println("오늘의 행운의 색은 보라색입니다.")
        }
        3 -> {
            println("지인과의 관계가 발전될 것입니다.")
        }
        else -> {
            println("원하는 결과를 이루실 수 있을 것 입니다.")
        }
    }
}
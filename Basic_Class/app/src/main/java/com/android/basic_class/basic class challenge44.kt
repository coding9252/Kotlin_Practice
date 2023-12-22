package com.android.basic_class

// [44] 주민등록번호를 뒷자리를 입력받아 남자인지 여자인지 구분하는 프로그램을 작성하세요. 첫자리 홀수(1,3): 남자, 짝수(2,4):여자
// 🐥❓
//fun main() {
//    println("주민등록번호 뒷자리 7자리를 입력해 주세요.")
//
//    while (true) {
//        val identity = readLine()  // null도 고려해보기(toStringOrNull은 없나?), 숫자가 아닌 문자가 입력됐을 때는?
//        // readln을 사용할 때는 뒤에 to~~() 자료형을 안 넣어도 잘 작동하고, toString 붙이면 안 쓰이는 걸로(흑백) 나옴.
//        // readLine()?.toString() 하면 toString 흑백.. 지우면 에러.
//        // readLine 쓸 때는 toString 안 넣으면 에러남. 차이가 뭘까?
//        if (identity != null && identity.length == 7) {
//            when (identity[0]) {
//                '1', '3' -> println("남자")
//                '2', '4' -> println("여자")
//                else -> println("잘못 입력하셨습니다.")
//            }
//            break
//        } else println("7자리를 입력해 주세요.")
//    }
//}


//fun main() {
//    var num = readLine()!!.toString()
//    while (num.length != 7) {
//        println("주민 번호 뒷자리 7자리를 입력해주시기 바랍니다")
//        num = readLine()!!.toString()
//    }
//    when (num[0]) {
//        '1', '3' -> println("남자")
//        '2', '4' -> println("여자")
//        else -> println("당신은 사람입니까?")
//    }
//}


// 💡
//fun main() {
//    var num: String
//
//    while (true) {
//        println("주민등록번호 뒷자리 7자리를 입력하세요: ")
//        num = readLine().toString()
//
//        if (num.length == 7) {
//            when (num[0]) {
//                '1', '3' -> println("남자")
//                '2', '4' -> println("여자")
//                else -> println("사람이 아닌 것 같아요.")
//            }
//            break
//        } else {
//            println("주민등록번호 뒷자리는 반드시 7자리여야 합니다. 다시 입력해주세요.")
//        }
//    }
//}


// 💡❓
fun main() {
    val inputNumber = readLine()!!.toString()
    val charList = mutableListOf<Int>()

    if (inputNumber.length == 7) {
        for (char in inputNumber) {
            val chart = char.toString().toInt()
            charList.add(chart)
        }
        if (charList[0].toString().toInt() in 1..4) {
            if (charList[0] == 1 || charList[0] == 3) {
                println("남자")
            } else {
                println("여자")
            }
        } else {
            println("첫 숫자는 1~4까지의 숫자만 입력 가능합니다.")
        }
    } else {
        println("주민번호 뒷자리는 7자리 입니다.")
    }
}

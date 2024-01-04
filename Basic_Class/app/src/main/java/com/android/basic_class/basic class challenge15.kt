package com.android.basic_class

// [15] 두개의 주사위(1~6)를 던져서 특정한 숫자의 조합을 출력해 주세요. (입력:10 출력 4+6=10), 12를 넘어가면 예외처리, 여러 조합 중 아무거나 하나만 출력.
// 🐥 ❓다시보기..
fun main() {
    while (true) {
        println("2~12 사이의 정수를 입력하세요.")
        val sum = readln().toInt()
        var list = mutableListOf<List<Int>>()

        if (sum in 2..12) {
            for (i in 1..6) {
                for (j in 1..6) {
                    if (i + j == sum) {
                        list.add(listOf(i, j))
                    }
                }
            }
            println(list.random())
        } else println("잘못 입력하셨습니다.")
    }
}


// 💡💡
//fun main() {
//    while (true) {
//        println("2~12사이 정수를 입력하세요")
//        val num = readLine()?.toIntOrNull() ?: 0
//        var pairList = mutableListOf<List<Int>>()
//
//        if (num in 2..12) {
//            for (i in 1..6) {
//                if (num-i in 1..6) {
//                    pairList.add(listOf(i, num-i))
//                }
//            }
//            println(pairList.random())
//        }else {
//            println("잘못 입력")
//        }
//    }
//}


// ❌(랜덤이 아니고 계속 같은 값 나옴)
//fun main() {
//    val num = readLine()!!.toInt()
//    val range = 1..6
//
//    while (num < 13) {
//        val dice1 = range.random()
//        val dice2 = range.random()
//
//        while (num == dice1 + dice2) {
//            return println("${dice1} + ${dice2} = ${num}")
//        }
//        // 입력 값이 1일 때도 예외
//        if (num == 1) {
//            return println("2 ~ 12 숫자를 입력해 주세요")
//        }
//    }
//    // 입력값이 12 초과일 때
//    if (num > 12) {
//        println("2 ~ 12 숫자를 입력해 주세요")
//    }
//}


// ❓
//fun main(){
//    while(true){
//        val num=readLine()?.toIntOrNull()
//        val list1= mutableListOf<Int>()
//        val list2= mutableListOf<Int>()
//        if(num!=null && num>1 && num<=12){      //null이 아니고 합이 1<num<=12
//            var count=0
//            for(i in 0 until 6){
//                for(j in 0 until 6) {
//                    var dice1 = i + 1
//                    var dice2 = j + 1
//                    if (dice1 + dice2 == num) {
//                        count += 1          //합이 num일 경우 카운트
//                        list1.add(dice1)
//                        list2.add(dice2)
//                    }
//                }
//            }
//            val index=(0 until count).random()      //총 count 범위 내에서 랜덤추첨
//            println("${list1[index]} + ${list2[index]} = ${num}")
//        }
//    }
//}

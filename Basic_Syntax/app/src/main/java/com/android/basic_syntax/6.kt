package com.android.basic_syntax

import java.util.Arrays                  // 외부 패키지에 있는 class를 import 해온 것. arrayOf는 java.util.Arrays라는 클래스 안에 있는 메소드이기 때문에 다른 패키지에 있는 거라 불러와야 함.

//[6. 배열]
// 일반적으로 변수를 선언하면 코틀린은 메모리에 랜덤으로 띄엄띄엄 생성한다. 변수의 위치 정보가 연속적이지 않기 때문에 순서가 없다.
// 배열을 통해 변수에 순서를 매겨 연속적으로 활용할 수 있다.
// 코틀린은 배열을 사용하기 위해 arrayOf 메소드(키워드)를 제공한다.(코틀린 내장 메소드)
// arrayOf 메소드를 호출하면 배열을 리턴해준다.

// 1, 2, 3, 4, 5 이 5개의 변수를 배열 형태로 arr에 저장해보자.

//fun main() {
//    var arr = arrayOf(1, 2, 3, 4, 5)     // arrayOf 메소드 안에 파라미터로 5개를 넣어줬다.
//
//    println(Arrays.toString(arr))        // Arrays 부분이 에러가 난다면 import해주자. Arrays 안에 toString이라는 메소드가 있는데, 이 메소드는 파라미터로 arr를 받는다.
//                                         // 결과는 []로 출력된다.
//    println(arr[0])                      // 변수명[인덱스]로 해당하는 변수를 출력. 인덱스는 방 번호 같은 것.(여기서 인덱스는 0~4)
//}

// var num1 = 1 과 여기서의 arr[0]은 같은 값이다.
// 변수들을 각각 선언하면 반복적으로 변수에 접근하는 행위를 할 수 없다.
// 배열이 없다면 변수를 여러 개 선언해야 한다. 배열을 사용하여 묶어 선언하면 효율적인 코드를 작성할 수 있다.


// 배열 순회
//fun main() {
//    val numbers = arrayOf(1, 2, 3, 4, 5)
//
//    for (num in numbers) {
//        println("${num}")
//    }
//}


fun main() {

    var kors = arrayOf(94, 97, 85)

    for ((idx, kor) in kors.withIndex()) {                  // withIndex()라는 메소드를 호출하면 '인덱스 값'(위치 정보)과 '실제 값' 이 2개의 값을 하나로 묶어서 리턴해준다.
        println("${idx}번째 학생의 국어 점수는 ${kor}점 입니다.")
    }
}
package com.android.basic_class

// [17] 식료품 목록(당근(1000원), 양파(1200원), 피망(1500원), 파(2000원), 감자(2500원), 돼지고기(8000원), 소고기(12000원))에서
// 식료품을 골라 총 개수가 6개가 넘거나 가격이 10000원 이상이면 종료하고 선택한 식료품과 총 가격을 출력해 주세요.
// (입력 : 당근, 양파, 양파, 감자, 파, 파  출력 : 선택 개수를 초과했습니다.)

// ❓❓❓
//fun main() {
//    var chooseFood = readLine()!!.toString()
//    var total = 0
//
//    for (i in 1..7) {
//        if (i == 7){
//            println("선택 개수를 초과 했습니다")
//            break
//        } else {
//            when (chooseFood) {
//                "당근" -> {
//                    total += 1000
//                    if (total >= 10000){
//                        println("현재 가격 ${total} / 한도 초과")
//                        break
//                    }
//                    println("당근을 선택하셨습니다 / 현재 가격 ${total} / 선택개수 : ${i}")
//                }
//                "양파" -> {
//                    total += 1200
//                    if (total >= 10000){
//                        println("현재 가격 ${total} / 한도 초과")
//                        break
//                    }
//                    println("양파를 선택하셨습니다 / 현재 가격 ${total} / 선택개수 : ${i}")
//                }
//                "피망" -> {
//                    total += 1500
//                    if (total >= 10000){
//                        println("현재 가격 ${total} / 한도 초과")
//                        break
//                    }
//                    println("피망을 선택하셨습니다 / 현재 가격 ${total} / 선택개수 : ${i}")
//                }
//                "파" -> {
//                    total += 2000
//                    if (total >= 10000){
//                        println("현재 가격 ${total} / 한도 초과")
//                        break
//                    }
//                    println("파를 선택하셨습니다 / 현재 가격 ${total} / 선택개수 : ${i}")
//                }
//                "감자" -> {
//                    total += 2500
//                    if (total >= 10000){
//                        println("현재 가격 ${total} / 한도 초과")
//                        break
//                    }
//                    println("감자를 선택하셨습니다 / 현재 가격 ${total} / 선택개수 : ${i}")
//                }
//                "돼지고기" -> {
//                    total += 8000
//                    if (total >= 10000){
//                        println("현재 가격 ${total} / 한도 초과")
//                        break
//                    }
//                    println("돼지고기를 선택하셨습니다 / 현재 가격 ${total} / 선택개수 : ${i}")
//                }
//                "소고기" -> {
//                    total += 12000
//                    if (total >= 10000){
//                        println("현재 가격 ${total} / 한도 초과")
//                        break
//                    }
//                }
//                else -> return
//            }
//            chooseFood = readLine().toString()
//        }
//    }
//}


// ❓코드 이상한듯?
//fun main(){
//    while(true){
//        var price=0
//        var count=0
//        val str= readLine()             //입력Ex: "당근, 양파, 피망, 파, 감자, 돼지고기"
//        if(!str.isNullOrEmpty()){                   //null이 아니고, 비어있지 않을때
//            val list=str.split(", ")
//            if(list.size>6){                        //입력 식료품이 6개를 넘으면 출력 후 종료
//                print("선택개수를 초과했습니다. ")
//                break
//            }
//            //식료품개수가 6개이하일때
//            else{
//                for(i in list){
//                    if(price<10000){    //금액이 10000원을 넘지 않는 동안
//                        when(i){
//                            "당근"->price+=1000
//                            "양파"->price+=1200
//                            "피망"->price+=1500
//                            "파"->price+=2000
//                            "감자"->price+=2500
//                            "돼지고기"->price+=8000
//                            "소고기"->price+=12000
//                        }
//                        print("$i ")
//                        count+=1
//                    }
//                }
//                if(list.size==count) {      //선택(입력)한 식료품과 구매한 식료품이 같을때만 금액 출력후 종료
//                    println("/ 총금액:$price")
//                    break
//                }
//                else{
//                    println("까지 구매가능 / 다시 선택해주세요.")     //다르면 다시 선택
//                }
//            }
//        }
//    }
//}


fun main() {
    var grocMap = mutableMapOf<String, Int>()  //음식이랑 가격 쌍으로 Map만들어두기
    grocMap.put("당근", 1000)
    grocMap.put("양파", 1200)
    grocMap.put("피망", 1500)
    grocMap.put("파", 2000)
    grocMap.put("감자", 2500)
    grocMap.put("돼지고기", 8000)
    grocMap.put("소고기", 12000)

    var selectedList = mutableListOf<String>()
    var price = 0

    println("식료품 목록 : 당근(1000원), 양파(1200원), 피망(1500원), 파(2000원), 감자(2500원), 돼지고기(8000원), 소고기(12000원)")

    while (true) {
        println("구매할 식료품 이름을 입력하세요.")
        var selectG = readlnOrNull() ?: ""
        if (selectG in listOf("당근", "양파", "피망", "파", "감자", "돼지고기", "소고기")) {
            selectedList.add(selectG)
            price += grocMap.get(selectG)!!
            println("현재 선택된 물건 목록은 ${selectedList}, 합산 가격은 ${price}원")

            if (selectedList.size > 6) {
                println("선택한 물건 개수가 6개 초과입니다")
                break
            } else if (price > 10000) {
                println("선택한 물건 총 가격이 10000원 초과입니다")
                break
            }
        } else {
            println("목록에 있는 상품만 입력하세요")
        }
    }
}
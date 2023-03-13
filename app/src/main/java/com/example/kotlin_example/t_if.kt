package com.example.kotlin_example

fun main(){
    // if else 는 다 똑같네 역시
//    var data = 10
//    if(data > 0){
//        println("seokho")
//    }else{
//        println("kim")
//    }

    // kt 에서 처음 보는 when
    var data = "seok"
    when(data){
        "seokho" -> println("he is seokho")
        "seokhu" -> println("??? hwo is that")
    }

    // 데이터 타입 범위 등 다양하게 조건 넣을 수 있다.
    var data_2 : Any = 7
    when(data_2){
        is String -> println("data is String")
        in 1..10 -> println("data is 1..10") // 1부터 10사이의 값
        else -> println("예외 예외")
    }

    // 조건만 명시할 수도 있다.
    var data_3 = 10
    when{
        data_3 <= 0 -> println("data 는 0보다 작다")
        data_3 > 100 -> println("data 는 100보다 크다")
        else -> println("예외다 예외")
    }


}
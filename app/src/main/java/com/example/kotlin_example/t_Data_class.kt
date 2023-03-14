package com.example.kotlin_example

// 데이터 클래스
// 데이터를 객체로 묶어준다.

//class nonDataClass (val name : String, val email : String, val age : Int) // 일반 클래스
//
//data class DataClass (val name : String, val email : String, val age: Int) // 데이터 클래스
//
//fun main(){
//    val non1 = nonDataClass("seokho", "rkwhr3256@naver.com", 27)
//    val non2 = nonDataClass("seokho", "rkwhr3256@naver.com", 27)
//    val data1 = DataClass("seokho", "rkwhr3256@naver.com", 27)
//    val data2 = DataClass("seokho", "rkwhr3256@naver.com", 27)
//
//    println("non data class : ${non1.equals(non2)}") // 틀리다고 나오고
//    println("data class : ${data1.equals(data2)}") // 같다고 나온다
//    // equals 함수가 객체 자체가 아니라 데이터를 비교하는 함수이다 (VO class)
//    // 조심해야 할게 주생성자의 멤버 변수가 같은지만 판단한다. 혹시나 construtor 로 만든 부생성자도 대상이 되는 줄 알고 쓰면 잘못 쓸 수 있다.
//}

// ------------------------------------------------------------------------------

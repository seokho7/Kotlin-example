package com.example.kotlin_example


// 변수 기본이 var, val 밖에 없어 편하네
// 타입을 지정하는 습관을 기르자, 추론 너무 많으면 나중에 까다롭겠다.
// val : const , var : let, var

// lateinit 으로 타입 초기 선언 생략 가능 대신 var 로만 가능 val 은 상수 개념 이니까
// Int, Long, Short, double, Float, Boolean, Byte 타입에는 사용 불가 => 뭐야 문자열만 가능하겠네
// by lazy 로 변수가 사용되는 순간에 실행되게 가능 => 이거 언제 쓸지 고민해보기
lateinit var param : String

val param2 : String by lazy {
    println("seokho boom")
    "lazy seokho"
}

fun main(){
    println("name : ${param2}")
}
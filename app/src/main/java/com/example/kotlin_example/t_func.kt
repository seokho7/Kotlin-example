package com.example.kotlin_example

// 함수 매개 변수 타입, 리턴 타입 선언 해주고, 초기값도 지정 가능
fun main(){
    fun some(data1 : Int, data2 : Int = 100) : Int{
        return data1 + data2
    }
    println(some(100))
    println(some(100,20))
}
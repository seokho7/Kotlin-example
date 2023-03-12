package com.example.kotlin_example

val any : Any = 10

val data_1 : Char = 'a'
val data_2 : String = "seokho"

val data_3 : Int = 999999999
val data_4 : Short = 9999
val data_5 : Long = 99999999999999999
val data_6 : Double = 10.1
val data_7 : Float = 10.9f

val data_8 : Byte = 0b01010101
val data_9 : Boolean = true

fun unit() : Unit{
    println("console.log(seokho 더하기 seokho)")
}

fun not() : Nothing{
    throw Exception()
    // Noting : 데이터로서 의미가 없다 에러로 써야겠다
    // Noting? : ? 붙으면 널 허용이라 null 도 가능
}
var nul : Int? = null // 널도 허용

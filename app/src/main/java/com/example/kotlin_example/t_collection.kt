package com.example.kotlin_example


fun main(){
    // Array<T> 인데 arr만 찍으면 컬렉션이 나오네 배열 전체가 안보이고
    val arr : Array<Int> = Array(3,{0})
    arr[0] = 10
    arr[1] = 20
    arr[2] = 30
    //  arr.set(2,500)
    //    println(arr[0] + 20)
    //    println(arr.get(0))

    // 기초 타입 으로도 나타낼 수도 있다 쭉쭉쭉
    val arr_2 : IntArray = IntArray(3,{0})
    val arr_3 : BooleanArray = BooleanArray(3,{true})

    // arrayOf 로 배열 선언과 동시에 지정 가능
    val arr_4 = arrayOf<String>("seokho" , "pig" , "boom")
    val arr_5 = booleanArrayOf(true, false , true)




    // List : 순서가 있는 데이터 집합, 중복 허용
    // Set : 순서가 없는 데이터 집합, 중복 불허
    // Map : 키와 값으로 이루어진 데이터 집합, 키 중복은 허용 x
    // 만드는 건 위에 어레이 처럼 만들면 된다.
    // 뭐야 js 랑 비슷하네?

    var map = mapOf<String, Int>(Pair("one", 20), "seokho" to 27)


}
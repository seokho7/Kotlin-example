package com.example.kotlin_example

fun main(){
    // for 와 while 이 있다
    var sum : Int = 0
    for(i in 1..10){
        sum += i
    }
    println(sum)

    // 조건이 js 랑 다르게 좀 어려운 것 같다.
    // for (i in 1..10) -> 1부터 10까지 1씩 증가 (10이하)
    // for (i in 1 until 10) -> 1부터 9까지 1씩 증가 (10미만)
    // for (i in 2..10 step 2) -> 2부터 10까지 2씩 증가
    // for (i in 10 downTo 1) -> 10부터 1까지 1씩 감소

    // 데이터 개수 만큼 가능 arr.length 비슷한거 같다
    var data = arrayOf<Int>(10, 100 , 200)
    for(i in data.indices){
        print(data[i])
        if(i !== data.size -1) print(',')
    }

    // index 와 실제 데이터를 가져오는 withIndex 도 있다. js의 구조분해 할당과 비슷하다
    var data_2 = arrayOf<Int>(10,20,30)
    for((index,value) in data_2.withIndex()){
        print(value)
        if(index !== data_2.size -1) print(',')
    }

    // while 문도 js 랑 동일하다
    var x : Int = 0
    var sum1 : Int = 0
    while(x < 10){
        sum1 += x++
    }
    println(sum1)
}
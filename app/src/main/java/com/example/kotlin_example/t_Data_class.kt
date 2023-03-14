package com.example.kotlin_example

// 데이터 클래스
// equals

//class NonDataClass (val name : String, val email : String, val age : Int) // 일반 클래스
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
// toString
//
//fun main(){
//    class NonDataClass (val name : String, val email : String, val age : Int)
//    data class DataClass (val name : String, val email : String, val age: Int)
//
//    val non = NonDataClass("seokho" , "rkwhr3256@naver.com", 27)
//    val data = DataClass("seokho" , "rkwhr3256@naver.com", 27)
//
//    println("non data class ${non.toString()}") // 큰 의미가 없다 주소 나오는거 같다.
//    println("data class ${data.toString()}")    // 객체가 포함하는 멤버 변수의 데이터가 출력 된다.
//    // toString 역시 주 생성자의 매개변수만 체크한다.
//}

// ------------------------------------------------------------------------------
// object

//val obj = object { // 이런 선언 자체가 에러
//    var data = 10
//    fun some(){
//        println("data $data")
//    }
//}
//
//fun main(){
//    obj.data = 20 // 에러
//    obj.some()    // 에러
//}

//open class Super(){
//    open var data = 10
//    open fun some(){
//        println("data is $data")
//    }
//}
//
//val obj = object : Super(){
//    override var data = 20
//    override fun some() {
//        println("reData is $data")
//    }
//}
//
//fun main(){
//    obj.data = 30
//    obj.some()
//}

// ------------------------------------------------------------------------------
// companion
// 내가 선호하는 방식은 아니지만 클래스 이름 자체를 가지고 멤버에 접근하려면 사용하느 키워드이다 (자바 static을 대체)s
//class MyClass {
//    var data = 10
//    fun some(){
//        println(data)
//    }
//}
//
//fun main(){
//    val obj = MyClass()
//    obj.data = 20
//    obj.some()
//    MyClass.data = 20 // 에러
//    MyClass.some()    // 에러
//}

//class Myclass{
//    companion object{
//        var data = 10
//        fun some(){
//            println(data)
//        }
//    }
//}
//fun main(){
//    Myclass.data = 20 // 성공
//    Myclass.some()    // 성공
//}
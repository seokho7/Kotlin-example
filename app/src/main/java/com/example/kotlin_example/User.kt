package com.example.kotlin_example

// class 선언 후 뽑아 쓰는 js랑 비슷한 것 같다.
//class User {
//    var name : String
//    constructor(name : String){
//        this.name = name
//    }
//
//    fun someFun(){
//        println("name : $name")
//    }
//    class SomeClass {}
//}
//
//val user = User("seokho kim")
//
//fun main(){
//    user.someFun()
//}

//class User (name : String , age : Int){
//    // 객체 생성 시 자동으로 시작 본문 구현 시 쓰인다고 한다.
//    init {
//        println("loading...")
//    }
//}
//fun main(){
//    val user = User("seokho", 27)
//}

//class User(name : String, age : Int){
//    // 생성자의 매개변수 즉 위에 두 놈은 생성자에서만 사용할 수 있으므로 기본적으로는 멤버 변수로 쓸 수 없다.
//    init {
//        println("name : $name 이며 , 나이는 $age" ) // 동작가능
//    }
//
//    fun welcome (){
//       println("name : $name 이며, 나이는 $age 입니다") // 못쓴다고 바로 에러
//    }
//}

// 매개변수를 받아서 안에서 사용하려면 Class 안에서 선언을 먼저 해주고 init (생성자의 본문) 에서 지정하면 가능하다.
//class User (name : String , age : Int){
//    var name : String
//    var age : Int
//    init{
//        this.name = name
//        this.age = age
//    }
//    fun welcome(){
//        println("이름은 $name 이며, 나이는 $age 입니다.")
//    }
//}
//fun main(){
//    var user = User("seokho", 27)
//    user.welcome()
//}

// class 안에 constructor가 보조 생성자 이다.
// 매개변수를 받아 즉시 실행할 수 있지만 class 멤버는 아니고 constructor 안에서 자동 호출된다.
//class User {
//    constructor(name : String){
//        println("name 하나만 들어왔네요 $name")
//    }
//    constructor(name : String, age : Int){
//        println("name 과 age 두개가 들어왔네요")
//    }
//}
//
//fun main(){
//    var user = User("seokho")
//    var user_2 = User("seokho", 27)
//}

// 보조 생성자에 주 생성자를 연결해서 사용하려면 constructor 리턴 타입 비스무리하게 this(매개변수) 로 이용하면 된다
// 왜 이렇게 복잡하게 할까? -> 주 생성자와 보조 생성자로 객체를 생성할 때는 반드시 주 생성자가 실행되어야 한다는 규칙 떄문에
//class User(name : String){
//    constructor(name : String , age : Int) : this(name){
//        println(name)
//    }
//}
//fun main(){
//    var user = User("seokho",29)
//}
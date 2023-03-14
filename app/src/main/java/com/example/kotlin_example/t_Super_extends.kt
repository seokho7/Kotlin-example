package com.example.kotlin_example

// 기본적으로 코틀린은 다른 클래스를 상속할 수 없다.
// 하지만 방법은 다 있다.
// open 키워드 사용하면 된다
// open으로 열고 : 뒤에 상위 클래스를 입력하고 생성자도 호출해줘야 한다.
// 하위 클래스의 보조 생성자에서 호출 할 수도 있다.

//open class Super (name : String){
//}

//class sub(name : String) : Super(name){
//
//}

//class sub : Super {
//    constructor(name: String) : super(name){
//
//    }
//}

// ------------------------------------------------------------------------------

// 오버라이딩
// 변수도 오버라이딩 쓸 수는 있지만 내가 봤을 때 아직까지는 중요성을 모르겠다 실제로 로직을 구현해보면서 겪어봐야 할 것 같다.
// 상속하려는 변수에는 open 키워드 다시 재정의하는 변수쪽에서 override 키워드를 붙여줘야 한다.

//open class Super {
//    var superData = 10
//    fun superFun(){
//        println("seokho seokho $superData")
//    }
//}
//
//class Sub : Super()
//
//fun main(){
//    val obj = Sub()
//    obj.superData = 20 // 와 sub 클래스로 초기화했는데 상위 클래스 super 에서 변수를 재정의 했다!
//    obj.superFun()
//}
// ------------------------------------------------------------------------------

// 접근 제한자
// public , internal, protected, private
// 접근 제한 없음, 같은 모듈 안에서만 사용 가능, 상속 관계의 하위 클래스에서만 사용 가능, 클래스 내부에서만 사용 가능 순
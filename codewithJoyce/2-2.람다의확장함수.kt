package com.lkwoung.kotlinpractice

// 람다식 확장함수
//                 String 함수 확장 (입력파라미터 없음)
val pizzaIsGreat : String.() -> String = {
    //this는 호출할 객체
    this + "Pizza is the best!"
}

fun main(){
    // 이런 식으로 String 클래스에 무언가를 추가 가능
    val a = "lkwoung said"
    val b = "Joyce said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    //
    println(extendString("lkwoung", 28))
}

fun extendString(name : String, age : Int) : String{
    // 파라미터가 하나일 때 it이라는 예약어를 사용할 수 있다.
    //                 String 함수 확장 (입력파라미터 int)
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}



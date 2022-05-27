package com.lkwoung.kotlinpractice

// 주석
// 영역드래그 + ctrl + / -> 해당영역 주석처리
/*
*
*
* */

fun main(){
    helloworld()
    println(add(4,5))

    //3. String Template
    val name = "lkwoung"
    val lastName = "Lee"
    println("my name is lkwoung")
    println("my name is $name I'm 26")
    println("my name is ${name + lastName}I'm 26")
    println("\$")

}

//1.1 함수
// return 형이 없을 때 Unit이라고 작성해줌 (없어도 무방 Redundant -> 회색으로 표시)
fun helloworld() : Unit {
    println("Hello World")
}

//1.2 리턴+파라미터 포함 함수
// 변수 뒤에 자료형, 파라미터 뒤에 반환형
fun add(a : Int, b : Int) : Int {
    return a+b
}

//2. val vs var
//val = value (변하지 않는 값)
//var = variable (변할수 있는 값)

fun hi(){
    val a : Int = 10
    val c = 100

    var b : Int = 9
    var d = 100

    var name = "lkwoung"
    var name2 : String = "lkwoung"

    val e : Int
    //val e (X)

}




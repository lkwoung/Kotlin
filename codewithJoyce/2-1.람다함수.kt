package com.lkwoung.kotlinpractice

// 람다함수
// 람다식은 우리가 마치 value처럼 다룰 수 있는 익명 함수이다.
// value처럼?
// 1. 메소드의 파라미터로 넘어갈 수 있다.
// 2. 람다로 function을 리턴할 수 있다.

// 람다의 기본 정의
// val lamdaName : Type = {argumentList -> codeBody}

// 제곱해서 주는 함수
//         { 입력  ->  출력(리턴) }-> number를 Int로 타입 추론
val square : (Int) -> (Int) ={ number ->number*number}
val square2 ={ number : Int ->number*number}

val nameAge = {name : String, age : Int ->
    "my name is ${name} I'm ${age}"
}

fun main(){
    println(square(12))
    println(nameAge("lkwoung", 26))
}

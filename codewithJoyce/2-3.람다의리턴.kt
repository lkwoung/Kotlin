package com.lkwoung.kotlinpractice

// 람다의 리턴
// 마지막 표현식이 리턴의 value type을 지정한다.
// * 람다의 입력 파라미터는 소괄호를 꼭 써야함 -> 여러개가 올 수 있기때문
// * 리턴하는 값은 항상 하나기 때문에 안써도 됨
val calculateGrade : (Int) -> String = {
    when(it){ // 항상 String 값을 리턴해줘야하는 함수이기 때문에 아래의 범위 외에도 처리를 해주어야 한다.
        in 0..40 -> "fail"
        in 41 .. 70 -> "pass"
        in 71 .. 100 -> "perfect"
        else -> "Error!"
    }
}

fun main(){
    println(calculateGrade(98))
    println(calculateGrade(987))
}

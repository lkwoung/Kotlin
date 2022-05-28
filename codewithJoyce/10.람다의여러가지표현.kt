package com.lkwoung.kotlinpractice

// 람다의 여러가지 표현방법 -> 4가지
// 여기서는 2가지만 소개

// invokeLamda식은 Boolean을 리턴하는데,
// lamda : (Double) -> Boolean 을 사용해서 리턴한다.
// 위 람다 함수에 5.2343을 넣어서 리턴이되는 Boolean값을 invokeLamda의 리턴으로 쓴다.
fun invokeLamda(lamda : (Double) -> Boolean) : Boolean{
    return lamda(5.2343)
}

fun main(){
    val lamda = {number : Double ->
        number == 4.3213 //같으면 true 다르면 false 반환
    }

    println(invokeLamda(lamda))

    //람다 리터럴럴
    //위에 처럼 람다를 선언하지 않고 바로 중괄호로 람다식을 넣는 방식
    println(invokeLamda({ true }))
    println(invokeLamda({it > 3.22})) // 이 때 it은 5.2343 (it은 하나들어가는 람다 함수의 파라미터)

    //위 코드와 같은 표현
    //**마지막 파라미터가 람다식일 때 소괄호 생략 가능
    invokeLamda { it > 3.22 }
    invokeLamda( ){it > 3.22}
}

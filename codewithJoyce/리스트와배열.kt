package com.lkwoung.kotlinpractice

fun main(){

}
/*
* 5.배열과 리스트
* 배열을 크기가 정적임
* 리스트는 두가지로 나눌수 있음 1.immutable list 2.mutable list
* immutable list는 수정이 불가능 mutable list는 수정이 가능
* array는 기본적으노 mutable함 (사이즈 제외)
*/

fun array(){
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    //ctrl+click -> 해당 클래스 참고 가능능
   val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3
    var result = list.get(0)
    // list[0] = 2 (X)
    // 리스트는 배열과 달리 기본적으로 인터페이스 직접적인 수정은 불가함 get만 존재

    //mutable list
    //var arrayList = arrayListOf<Int>(1, 2, 3) var로 선언해도 동작
    val arrayList = arrayListOf<Int>() //arrayList의 참조값 자체는 변하지 않기 때문에 val를 추천해준다
    arrayList.add(10)
    arrayList.add(20)

    // arrayList = arrayListOf() 참조값이 바뀌게 됨

}
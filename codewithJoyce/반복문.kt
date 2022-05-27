package com.lkwoung.kotlinpractice

fun main(){
    forAndWhile()
}

//6.for / while
fun forAndWhile(){
    val students = arrayListOf("joyce", "james", "jenny", "jennifer")
    for(name in students){
        println("${name}")
    }

    for((index, name) in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

    var sum = 0
    for(i in 1..10){
        sum += i
    }
    println("${sum}")
    println(sum)
    /*
    for(i in 1..10 step 2){ //2씩 증가
        sum += i
    }
     */
    /*
    for(i in 10 downTo 1){ //10에서 거꾸로
        sum += i
    }
     */
    /*
    for(i in 1 until 10){ //10미포함
        sum += i
    }
     */

    var index = 0
    while(index < 10){
        println("current index : ${index}")
        index++
    }


}
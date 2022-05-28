package com.lkwoung.kotlinpractice

                        //같이 변수를 선언할 수 있음 (20=디폴트)
                        //주생성자
open class Human constructor(val age : Int = 20 ) {

    //부 생성자는 주생성자의 상속을 받아야함
    //B.주 생성자 다음에 실행
   constructor(name : String, age : Int) : this(age){
        println("my name is ${name}, ${age}-years old.")
    }

    init{
        //처음 인스턴스 생성시 동작 (생성자의 코드블럭)
        //주 생성자 코드영역
        //A.먼저 실행
        println("Now human has been born!")
    }

    val name = "lkwoung"
    //val age : Int = age

    fun eatingCake() {
        println("This is so YUMMMMYYY~~~~")
    }

    open fun singASong() {
        println("lalala")

    }
}

//코틀린 클래스는 기본적으로 final class 그래서 같은 파일이라도 접근이 불가
//그래서 상속하려는 클래스에 open 키워드를 추가해야함
//자바처럼 클래스 상속은 하나밖에 못함
class Korean : Human() {

    //마찬가지로 오버라이딩할 때도 open 키워드를 추가해야 가능
    override fun singASong() {
        super.singASong() //부모의 함수도 사용
        println("라라라")
        println("thank you my name is : ${name}")
    }

}


fun main() {
    val human = Human(26)
    human.eatingCake()
    println("this human's name is ${human.name}")

    println(" ")

    val man = Human("lee", 50)

    println(" ")

    val korean = Korean()
    korean.singASong()
}


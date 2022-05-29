package com.lkwoung.kotlinpractice

// pojo 클래스 : 모델이 되는 클래스, 메소드가 작동하는 클래스가 아닌 비어있는 틀 역할(자바)
// Kotlin -> 데이타 클래스 : 데이터를 다루는 클래스
// 여러개의 데이터 클래스를 한 파일에서 관리할 수 있음 (자바에서는 어려움)
data class Ticket(val companyName : String, val name : String, var date : String,
val seatNumber : Int)
//각각의 변수는 class의 property처럼 사용이 가능,
//컴파일 시 constructor도 만들어짐, toString(), hashCode(), equals(), copy() 메소드들이 자동으로 만들어짐
//자바에서는 바디 변수선언 생성자 생성 등등....

//그냥 클래스
class TicketNormal(val companyName : String, val name : String, var date : String,
                  val seatNumber : Int)

fun main(){
    //클래스 객체 생성
    val ticketA = Ticket("KoreanAir", "lkwoung", "2020-02-16", 14)
    val ticketB = TicketNormal("KoreanAir", "lkwoung", "2020-02-16", 14)

    println(ticketA) // 변수의 내용들이 출력
    println(ticketB) // 주소값이 나옴
}

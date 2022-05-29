package com.lkwoung.kotlinpractice

// Object Class

// Object는 다른 클래스들과는 달리 싱글턴 패턴으로 작동함.
// 클래스를 읽어올 떄 딱 한번 객체생성
object CarFactory{
    val cars = mutableListOf<Car>()

    fun makeCar(horsePower: Int) : Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower : Int)

fun main() {
    //CarFactory객체 생성 불필요
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car) //데이터 클래스라서 내용이 나옴
    println(car2)
    println(CarFactory.cars.size.toString())
}


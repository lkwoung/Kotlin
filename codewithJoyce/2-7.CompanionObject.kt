package com.lkwoung.kotlinpractice

//  companion object
// 자바의 static 대신에 사용 -> 정적인 메소드, 변수를 만들기 위해 사용

//private constructor : 다른 곳에서는 객체를 생성하지 못함
class Book private constructor(val id : Int, val name : String){

    //companion object는 private property, method를 읽어 올 수 있게 해주는 역할을 해줌
                    //이름을 줄 수 있음, 상속도 받을 수 있음
    companion object BookFactory : IdProvider{
        val myBook = "new book"
        fun create() = Book(getId(), myBook)
        //fun create() = Book(0, "animal farm")
        //fun create() = Book(0, mybook)

        override fun getId(): Int {
            return 444
        }
    }
}

interface IdProvider{
    fun getId() : Int
}

fun main(){
    // val book = Book.Companion.create() //companion 클래스에 이름이 없을 때만 사용가능
    val bookId = Book.BookFactory.getId()
    val bookName = Book.BookFactory.myBook
    println("${bookId} ${bookName}")
}

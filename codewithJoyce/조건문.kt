package com.lkwoung.kotlinpractice

fun main(){
    checkNum(1)
}

//4. 조건식
fun maxBy(a : Int, b : Int) : Int {
    if(a > b){
        return a;
    }else{
        return b;
    }
}

//return (a>b) ? a : b
fun maxBy2(a : Int, b : Int) : Int = if(a>b) a else b

fun checkNum(score : Int){
    //when - switch
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2or3")
        else -> println("It's more than 3")
    }

    //when을 사용해 유동적으로 변수 초기화
    //위의 예는 else가 생략이 가능하지만 아래의 예는 생략이 불가하다.
    var b : Int = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("A+")
        in 10..80 -> println("B+")
        else -> println("C+")
    }
}

/*Expression vs Statement
*Expression : 무언가 연산을 통해 값이 나오는 것 (식)
*  var b : Int = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }

* *Statement : 실행을 하도록 하는 문장
* when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2or3")
        else -> println("It's more than 3")
    }
* 위에 when은 Expression 아래는 Statement
* 코틀린의 모든 함수는 Expression으로 사용된다. Unit을 암묵적으로 반환함.
* 자바의 void 리턴값은 Statement로 사용이 됨.
* 코틀린의 if, when 문은 Expression으로도 사용될 수 있다.
 */
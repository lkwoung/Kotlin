package com.lkwoung.kotlinpractice

fun main(){
    nullcheck()
}
//7. Nullable / NonNull
fun nullable(){
    //NPE : NullPointerException : JAVA에서는 런타임시점에서 잡힘
    //코틀린은 컴파일 시점에서 잡기위해 ?을 사용함
    //null값을 넣고 싶으면 타입뒤에 ?를 붙임

    var name : String = "joyce"
    //var nullName : String = null (X)
    var nullName : String? = null //?가 붙을 때는 타입을 생략하지 못함

    var nameInUpperCase = name.uppercase() //name = nonnull

    //var nullNameInUpperCase = nullName.uppercase() (X)
    var nullNameInUpperCase = nullName?.uppercase() //만약 nullName이 null이 아니면 실행하고, null이면 그냥 null을 반환

    // ?: 앨비스 프레슬리
    // ?은 바로 null을 반환하는 데 반해 ?:은 default 값을 지정해서 사용
    // val lastName : String? = null
    val lastName : String? = "Hong"
    val fullName = name + " " + (lastName?: "No lastName")
    println(fullName)

    // !!
    // 컴파일러한테 nullable 타입이지만 null이 아님을 알려줌

}

fun ignoreNulls(str : String?){
    //val mNotNull : String = str // 이러면 오류 str은 nullable이기 때문에 String으로 타입을 지정할 수 없음
    val mNotNull : String = str!! // str은 절대 null이 들어올 일이 없을 때 컴파일러에게 알려줌
    val upper = mNotNull.uppercase() // !!을 사용하고 나서는 nullable이 아닌것 처럼 사용 가능
    // 정말로 확실하지 않은 이상은 !! 사용 지양
}

fun nullcheck(){
    //null check
    //val email : String? = "helloworld@nnnnn.com"
    val email : String? = null
    email?.let {
        //email이 null이 아니면 다음을 실행하라
        //let함수는 자신의 리시버객체를 람다식 내부로 옮겨줌
        //null이 아니면 이 내부로 email을 옮겨줌
        println("my email is ${it}")
    }
}
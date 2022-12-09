package com.cheng.student

import java.util.*

fun main() {

    //extracted()
    val stu = Student1("cheng",40, 90)
    stu.print()
    //stu.namecheack()
    println("hight scorse:${stu.hightest()}")
}

private fun extracted() {
    val scanner = Scanner(System.`in`)
//        print("please enter student's name")
//        var name =scanner.next()
    val name = null
    print("please enter student's english")
    var english = scanner.nextInt()
    print("please enter student's math")
    var math = scanner.nextInt()
    val stu = Student1(name, english, math)
    stu.print()
    stu.namecheack()
}


class Student1(var name:String?,var english:Int,var math:Int){
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t" +
                "${grading()}\t${passorfailed()}\t${hightest()}")
    }
    fun grading()=when(getAverage()){
        in 90..100 ->'A'
        in 80..89 ->'B'
        in 70..79 ->'C'
        in 60..69 ->'D'
        else -> 'F'
    }

    fun passorfailed() = if (getAverage()>=60){
        "PASS"
    }else{
        "FAILED"
    }

    fun getAverage() =(english+math)/2

    fun hightest() = if (english > math){
        english
    }else{
        math
    }

    fun namecheack(){
        println(name?.length)
    }
}
package com.cheng

fun main() {
    println("java")
//    Human().hellow()
    var s:String?="abcde"
    s = null
    println(s?.length)
    println(s?.get(2))
    println(s?.substring(2))
    val h = Human(66.5f,1.7f)
    println(h.bmi())
    val sorce =61;
    println(sorce >60);
    val c:Char='A';
    println(c.toInt() > 60)

    /*
        var age =19;
        age = 20;
        var weight = 66.5;
        val name:String;
        name="Cheng";*/

}

class Human(var weight:Float,var height:Float) {
    fun bmi():Float{
        val bmi = weight/(height*height)
        return bmi
    }

}
fun hellow(){
    println("hello kotlin")
}


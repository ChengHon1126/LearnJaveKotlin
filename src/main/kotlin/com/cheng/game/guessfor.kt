package com.cheng.game

import java.util.*
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)
    val rander = Random.nextInt(10)+1
    val secret = rander
    println(secret)
    for (i in 1..4){
        print("第${i}次:")
        var number = scanner.nextInt()
        if (number > secret){
            println("lower")
        }else if (number < secret){
            println("higher")
        }else{
            println("true")
            break
        }
    }
}
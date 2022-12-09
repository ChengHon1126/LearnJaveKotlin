package com.cheng.game

import kotlin.random.Random

fun main(array: Array<String>) {
    var secret = Random.nextInt(10)+1;
    println(secret)
    //var scanner = Scanner(System.`in`)
    var number = 0

    while (number != secret){
        number = readln().toInt()
        //number = scanner.nextInt();
        if (number > secret){
            println("lower")
        }else if(number < secret){
            println("higher")
        }else{
            println("ture")

        }
    }

}
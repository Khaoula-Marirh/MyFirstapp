package com.example.myfirstapp

fun main(){
    fun String.remouveFirstAndLastChar(): String {
        var last:Int = this.length
        var first:Int = 0
        return this.substring(first+1,last-1)
    }

    val inputString = "Khaoula,Houda"
    val outputString =inputString.remouveFirstAndLastChar()
    println(outputString)



    }
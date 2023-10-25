package com.example.myfirstapp

data class Circle(val radius: Double) {
    val diameter: Double get() = radius * 2
    val circumference: Double get() = diameter * Math.PI
}

fun Circle.addCalcul() {
    this.apply {
        var diameter = radius * 2
        var circumference = diameter * Math.PI
    }
}
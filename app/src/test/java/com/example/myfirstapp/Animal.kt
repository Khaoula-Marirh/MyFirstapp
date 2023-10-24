package com.example.myfirstapp

class Animal(val nom:String,val age:Int){
    fun afficherDetails(){
        println("Nom de l'animal :$nom")
        println("Age de l'animal :$age")
    }
}

fun main(){
    val animal1 = Animal("Dog",2)
    val animal2 = Animal("Cat",1)
    println("Details du peremier animal")
    animal1.afficherDetails()

    println("Details du deuxieme animal")
    animal2.afficherDetails()

}
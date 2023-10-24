package com.example.myfirstapp
import java.util.Scanner
class Moyenne {
}
fun main(){
    val scanner = Scanner(System.`in`)
    println("Enterz le Nomber des nomberes que vous deje saisir :")
    var n = scanner.nextInt()
    var somme = 0
    for(i in 1..n){
        println("Entrer le nombre $i :")
        val nomber =scanner.nextInt()
        somme += nomber
    }
    val moyenne = somme/n
    println("La moyenne des ${n} nomberes est : ${moyenne}")


}
package com.example.myfirstapp

open class Forme (val couleur:String){
    open fun affichereCouleur(){
        println("Couleur : $couleur")
    }
}
class Cercle(couleur:String, val rayon:Double): Forme(couleur){
    override fun affichereCouleur() {
        super.affichereCouleur()
        println("Rayon : $rayon")
    }
    fun  aire():Double{
        return Math.PI * rayon * rayon
    }
}
class Rectangle(couleur: String,val largeur:Double,val hauteur:Double):Forme(couleur){
    override fun affichereCouleur() {
        super.affichereCouleur()
        println("Largeur : $largeur")
        println("Hauteur : $hauteur")
    }
    fun aire():Double{
        return largeur * hauteur
    }
}
fun main(){
    val cercle = Cercle("Black",4.0)
    cercle.affichereCouleur()
    println("Aire du cercle : ${cercle.aire()}")

    val rectangle = Rectangle("Orange",2.0,4.0)
    rectangle.affichereCouleur()
    println("Aire du rectangle : ${rectangle.aire()}")
}
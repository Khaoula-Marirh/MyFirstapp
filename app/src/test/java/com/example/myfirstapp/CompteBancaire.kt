package com.example.myfirstapp

class CompteBancaire(var titulaire:String,var solde:Double) {
    fun depot(mt:Double){
        solde += mt
    }
    fun retirait(mt:Double){
        if (mt <= solde){
            solde -= mt
        }else println("Le solde insuffisant")
    }
    fun afficherSolde(){
        println("Le solde actuel est : $solde")
    }
}
fun main(){
    val compte = CompteBancaire("KHAOAUAA",500.0)
    compte.depot(200.0)
    compte.afficherSolde()   // Affiche "Solde actuel "

    compte.retirait(400.0)
    compte.afficherSolde()    // Affiche "Solde actuel "

    compte.retirait(400.0)
    compte.afficherSolde()    // Affiche "Solde insuffisant

}
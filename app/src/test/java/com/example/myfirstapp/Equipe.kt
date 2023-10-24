//package com.example.myfirstapp
//
//enum class Equipe{OCS,OCK,RCA,WAC}
//enum class Pays{MAROC,TUNISIE,EGYPTE,MAURITANIE, ALGERIE }
//
//data class Joueur(val numero: Int, val nom: String, val equipe: Equipe, var pointsComp: Int) {
//
//}
//
//class Equipe(val pays: Pays, val sigle: String){
//    val joueurs = mutableListOf<Joueur>()
//
//    fun ajout(j: Joueur): Boolean{
//        if (joueurs.any(){it.nom == j.nom})
//            return false
//        else(joueurs.add(j))
//            return true
//    }
//
//    fun recherche(j: Joueur): Int{
//        return joueurs.indexOfFirst {it.nom == j.nom }
//    }
//
//    fun suppression(j: Joueur): Boolean{
//        return joueurs.removeIf { it.nom == j.nom }
//    }
//
//    fun setPoints(j: Joueur,points: Int){
//        val index = recherche(j)
//        if (index != -1){
//            joueurs[index] = j
//        }
//    }
//
//    fun afficher(){
//        println("Équipe de ${pays.name} ($sigle):")
//        for (joueur in joueurs) {
//            println("${joueur.nom} (Numéro ${joueur.numero}): ${joueur.pointsComp} points")
//        }
//    }
//
//
//
//}
//
//
//
//
//    fun main(){
//        val equipe1 = equipe(Pays.MAROC, "OCS")
//        val equipe2 = equipe(Pays.TUNISIE, "OCK")
//        val equipe3 = equipe(Pays.EGYPTE, "RCA")
//        val equipe4 = equipe(Pays.ALGERIE, "WAC")
//
//
//        val joueurs = listOf(
//            Joueur(1, "Adam", Equipe.OCS, 10),
//            Joueur(2, "Ilyass", Equipe.OCK, 8),
//            Joueur(3, "ABDERRAHMANE", Equipe.OCS, 12),
//            Joueur(4, "Salmane", Equipe.WAC, 15)
//        )
//
//
//
//        for (joueur in joueurs) {
//            when (joueur.equipe) {
//                Equipe.OCS -> equipe1.ajout(joueur)
//                Equipe.OCK -> equipe2.ajout(joueur)
//                Equipe.WAC -> equipe3.ajout(joueur)
//                Equipe.RCA -> equipe4.ajout(joueur)
//
//            }
//        }
//
//        equipe1.afficher()
//        equipe2.afficher()
//
//
//}
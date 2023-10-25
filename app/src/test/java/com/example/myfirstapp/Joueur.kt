package com.example.myfirstapp

enum class Equipe { OCS, OCK }
enum class Pays { MAROC, TUNISIE, EGYPTE, ALGERIE, MAURITANIE }

data class Joueur(val numero: Int, val nom: String, val equipe: Equipe, var pointsCompetition: Int = 0)

class equipe(val pays: Pays, val sigle: String) {
    private val joueurs = mutableListOf<Joueur>()

    fun ajout(j: Joueur): Boolean {
        if (!joueurs.any { it.nom == j.nom }) {
            joueurs.add(j)
            return true
        }
        return false
    }

    fun recherche(j: Joueur): Int {
        return joueurs.indexOfFirst { it.nom == j.nom }
    }

    fun suppression(j: Joueur): Boolean {
        val index = recherche(j)
        if (index != -1) {
            joueurs.removeAt(index)
            return true
        }
        return false
    }

    fun miseAJour(j: Joueur) {
        val index = recherche(j)
        if (index != -1) {
            joueurs[index] = j
        }
    }

    fun affichage() {
        println("Équipe de ${pays.name} ($sigle):")
        for (joueur in joueurs) {
            println("${joueur.nom} (Numéro ${joueur.numero}): ${joueur.pointsCompetition} points")
        }
    }
}

fun main() {
    val equipe1 = equipe(Pays.MAROC, "OCS")
    val equipe2 = equipe(Pays.TUNISIE, "OCK")
    val equipe3 = equipe(Pays.EGYPTE, "RCA")
    val equipe4 = equipe(Pays.ALGERIE, "WAC")

    val joueurs = mutableListOf<Joueur>()
        joueurs.add(Joueur(1, "Joueur1", Equipe.OCS, 10))
        joueurs.add(Joueur(2, "Joueur2", Equipe.OCK, 8))
        joueurs.add(Joueur(3, "Joueur3", Equipe.OCS, 12))
        joueurs.add(Joueur(4, "Joueur4", Equipe.OCK, 15))


    for (joueur in joueurs) {
        when (joueur.equipe) {
            Equipe.OCS -> equipe1.ajout(joueur)
            Equipe.OCK -> equipe2.ajout(joueur)
        }
    }

    equipe1.affichage()
    equipe2.affichage()
}

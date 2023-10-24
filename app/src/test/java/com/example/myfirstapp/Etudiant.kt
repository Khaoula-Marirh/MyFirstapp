package com.example.myfirstapp

data class Etudaint (
    var name:String,
    var code:String,
    var sexe:String,
    var adresse:String,
    var age:Int

)
fun main(){
    //2
    val etudaints = mutableListOf<Etudaint>()
    etudaints.add(Etudaint("Ihssane","2001","Femme","Safi",21))
    etudaints.add(Etudaint("Khaoula","2002","Femme","Rabat",21))
    etudaints.add(Etudaint("Saad","2003","Homme","Casa",23))
    etudaints.add(Etudaint("Othmane","2004","Homme","Fes",20))
    etudaints.add(Etudaint("Ihssane","2005","Femme","Salé",23))
    etudaints.add(Etudaint("El Aziza","2006","Femme","Safi",24))
    etudaints.add(Etudaint("Bilal","2007","Homme","Oujda",23))
    etudaints.add(Etudaint("Amine","2008","Homme","Tanger",21))
    etudaints.add(Etudaint("Salma","2009","Femme","Casa",17))
    etudaints.add(Etudaint("Houda","2010","Femme","Safi",21))
    println("Q2")
    println(etudaints)

    //3
    etudaints.sortBy { it.age }
    println("Q3")
    println(etudaints)

    //4
    val groupBySexe = etudaints.groupBy { it.sexe }
    println("Q4")
    println(groupBySexe)

    //5
    val groupFemmes = etudaints.groupBy { it.sexe }.get("Femme")
    val groupHommes = etudaints.groupBy { it.sexe }.get("Homme")
    println("Q5")
    println(groupFemmes)
    println(groupHommes)

    //6
    println("Q6")
    println(etudaints.first{it.sexe == "Homme"}.name)

    //7
    println("Q7")
    println(etudaints.first{it.sexe == "Homme"}.name)

    //8
    etudaints.removeIf{it.sexe == "Homme"}
    println("Q8")
    println(etudaints)

    //9
    println("Q9")
    println(etudaints.reversed())

    //10
    etudaints.clear()
    println("Q10")
    println(etudaints)




}
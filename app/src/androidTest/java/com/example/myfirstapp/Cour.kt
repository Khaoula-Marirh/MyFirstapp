package com.example.myfirstapp

//functions
fun isLong(poids: Int):Boolean{
    return poids<=85
}
fun dscPerson(name: String, age:Byte,poids:Int ,details:String="pas details"){
    var canPlay = when(isLong(poids)){
        true -> "peut play"
        false -> "Visit a doctor"
    }
    println("$name a $age ans $poids KG ($details)")
}
fun main(){
    var name:String="Khaoula"
    var age:Byte=34
    var poids:Int=55
    println("Name:${name} a ${age} ans et ${poids} KG")
    println("Les informations"+"\nNom:${name}" +"\nAge:${age}" +"\nPoid:${poids}")

    //nulltable
    var nom:String?="Khaoula"
    nom=null
    if(nom!=null)
        println("${nom}.Length")

    //if & else
    if(age<17){
        println("${name}  is child")
    }
    else{
        println("${name} Admi")
    }
    //else if
    if (name=="Khaoula"){
        println("${name} is a girl")
    }
    else if (name=="Adam"){
        println("${name} is a boy")
    }
    else{
        println("Aucun")
    }
    //type
    var type=if(name=="Khaoula") "Girl" else "Boy"
    println(type)

    //when

    when(poids){
        in 40..49 -> println("${poids}KG Taill S")
        in 50..65 -> println("${poids}KG Taill M")
        in 65..85 -> println("${poids}KG Taill L")

        else -> println("${poids}KG Please visit a doctor")
    }
    var canPlay=when(poids){
        in 49..75 ->true
        else->false
    }
    when(poids){
        is Int -> println("C'est entier")
//        is Byte -> println("C'est byte")
//        is Float -> println("C'est float ")
    }


   isLong(poids)
   dscPerson("Salma",16,48)
    dscPerson("Salma",16,48,"Sport")


    //while

    while (age<30)
        println("$age very old for this chalange")






}
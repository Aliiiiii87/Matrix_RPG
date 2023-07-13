 open class Agenten(name : String, health : Int , save : Int , attack : Int , exp :Int): Feind (name , health, save, attack, exp ) {





     // todo Diese Methode habe ich fertig geschrieben aber nicht emplementiert !
     // todo Die idee ist ab einem bestimmten level diese Fähigkeit zu emplementieren
     // todo Hat leider auch nicht zu meiner jetzigen Spiel logik gepasst


    open fun asimilieren(helden: Helden){
        println("$name : Du wirst einer von uns Mrs Anderson")
        name = helden.name
        health = helden.health
        save = helden.save
        attack = helden.attack
        exp = helden.exp



    }
}
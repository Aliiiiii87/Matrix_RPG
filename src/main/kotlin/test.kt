fun main() {


 println("----------------Funktion/ Methoden test----------------------------")



    //  auswahlCharekter()

   // starteSpiel(heldenTeam)

    // beendeSpiel(heldenTeam)


    println("-----------------Registrierung testen---------------------------")


    var regestrierterBenutzer = mutableListOf<Pair<String, String>>()
    benutzerRegestrieren(regestrierterBenutzer)
    println("Registrierter Benutzer:")
    regestrierterBenutzer.withIndex().forEach { (index, benutzer) ->
        println("Player ${index + 1}: ${benutzer.first}")
        anmeldung(regestrierterBenutzer)
    }



}
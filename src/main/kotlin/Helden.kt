import kotlin.random.Random

open class Helden(name: String, health: Int, attack : Int, exp: Int, save: Int) :
    Charektere(name, health, attack, exp, save) {


   open fun kaempfen(feind: Feind) {
       var text25 = "$name greift ${feind.name} mit einem ApaCut an"
       var verzögert25 = 30L
       printStatments(text25,verzögert25)
       println()
       // Berchne den Schaden des Helden basierend auf seinem Angriffswert und Level
        var heldenSchaden = attack * exp +30
       feind.health -= heldenSchaden
       if(feind.health < 0){
           feind.health = 0
       }
       val text1 = String.format("%-15s %s", "Schaden:", heldenSchaden, "DM")
       val text2 = String.format("%-15s %s", "Lebenspunkte:", feind.health, "LP")
       println(text1)
       println(text2)





       if (feind.health <= 0) {
            println("${feind.name} wurde besiegt")
        } else {
            println()
        }
    }


    fun schießen(feind: Feind) {


        // Hier wird durch das Berechenen attacke mal das level +10 ergibt durchs schießen der Schaden
        var schaden = attack * exp + 10

        var text13 = "$name schießt auf ${feind.name} : $schaden DM "
        var verzögert13 = 20L
        printStatments(text13,verzögert13)
        println()
        feind.health -= schaden
        if (feind.health < 0){
            feind.health = 0
        }
        if (feind.health <= 0) {
            println("${feind.name} wurde besiegt")
        } else {
            var text14 = String.format("%-20s %s %s\n%-20s %s", feind.name, "verlorene LP:","$schaden LP","Aktuelle LP ${feind.name}:", "${feind.health} LP\n")
            var verzögert14 = 20L
            printStatments(text14,verzögert14)

        }
    }


    fun ultimateAttack(feind: Feind) {
        var ausweichen = Random.nextBoolean()

        if (ausweichen){
            feind.health += 10
            var text15 = String.format("%30s", "${feind.name} ist der Ultimativen Attacke ausgewichen\n")
            var verzögert15 = 20L
            printStatments(text15,verzögert15)
            var text16 ="Durch das auswichen hat der ${feind.name} 10 LP bekommen\nNeue Lp : ${feind.health} LP\n"
            var verzögert16 = 20L
            printStatments(text16, verzögert16)

        }else {

            var schaden = attack * exp + 50
            feind.health -= schaden
            if (feind.health < 0){
                feind.health = 0
            }
            if (feind.health <= 0) {
                println("${feind.name} wurde besiegt")
            } else {
                println("${feind.name} verliert: $schaden DM aktuelle Lebensbunkte : \n ${feind.health} LP")
            }


        }



    }

}


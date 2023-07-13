import kotlin.random.Random

class `Neo (Auserwählter)`(name: String, health: Int, save: Int, attack: Int, exp: Int) :
    Helden(name, health, save, attack, exp) {


    var fliegen = false

    private var angriffszähler: Int = 0
    private var maxAttacke: Int = 5

    fun fliegen() {

        if (this.health <= 100) {
            println("Unbesiegbar Modus ist bereit/ Drücke Enter")
            readln()
            this.health = 100
            println("$name ist jetzt für 2 sekunden Unverwundbar")
            fliegen = true

            var unbesiegbarMod = 2
            while (unbesiegbarMod > 0) {
                Thread.sleep(1000)
                unbesiegbarMod--
                println("Verbleibende Zeit : $unbesiegbarMod sekunden")
            }
            this.health = 100

        } else {
            println("Keine Energie mehr")

        }

    }



    fun schockwelle(feind: Feind) {
        var ausgewichen = Random.nextBoolean()
        if (ausgewichen) {
            feind.health += 10
            var text9= "${feind.name} ist der Schockwelle ausgewichen\n"
            var verzögern9 = 30L
            printStatments(text9,verzögern9)
            println("Durch das ausweichen hat ${feind.name} 10 LP bekommen\nNeue LP: ${feind.health} LP")
        } else {
            if (angriffszähler < maxAttacke) {
                var schockWelle = attack * exp + 70
                feind.health -= schockWelle
                 feind.save -=schockWelle
                if (feind.health < 0 && feind.save < 0){
                    feind.health = 0
                    feind.save = 0
                }
                angriffszähler++
                println("$name hat den Gegner mit einer Schockwelle angegriffen:\n${boldText}Schaden :$schockWelle DM$reset")
                Thread.sleep(2000)
                println()
                println("$boldText${feind.name}1" +
                        "\nLebenspunkte : ${feind.health} LP$reset\nDEF : ${feind.save}")
                Thread.sleep(1000)
            } else {
                println("deine energie ist verbraucht ")
            }
        }
    }



    fun waffenWahl(feind: Feind): Helden? {
        var text20 = "Wähle eine Waffe aus"
        var verzögert20 = 30L
        printStatments(text20,verzögert20)
        println()
        Thread.sleep(2000)
        println(
            """
          #######################################
          
          #  [1]  fliegen                       #        
          #  [2]  schockwelle                   #
          #  [3]  kämpfen                       #
          #                                     #
          #######################################  
        """.trimIndent()
        )
        var auswahlWaffe = readln().toInt()
        return when (auswahlWaffe) {

            1 -> {
                this.fliegen()
                null
            }

            2 -> {
                this.schockwelle(feind)
                null
            }


            3 -> {
                this.kaempfen(feind)
                null
            }

            else -> {
                println("Ungültige Auswahl , versuchen sie es erneut")
                waffenWahl(feind)
            }
        }
    }

}














import kotlin.math.exp

// Todo hier habe ich bewusst das Atrribut save mitgegebn
// Todo hier wollte ich noch die save punkte also die DEF Punkte noch als Panzerung miteinbauen


open class Charektere(
    open var name: String,
    open var health: Int,
    open var save: Int,
    open var attack: Int,
    open var exp: Int = 0
) {


    fun attack() {
        //  von Luca
        while (true) {
            var randomIndex = (0 until heldenTeam.size).random()
            var getroffenerHeld = heldenTeam[randomIndex]
            if (getroffenerHeld.health <= 0) {
                getroffenerHeld.health = 0
                println("$getroffenerHeld ist nicht mehr im Spiel")

            } else {


                // von Julian
                if (getroffenerHeld is `Neo (Auserwählter)`)
                    if ((getroffenerHeld as `Neo (Auserwählter)`).fliegen) {
                        (getroffenerHeld as `Neo (Auserwählter)`).fliegen = false
                        return
                    }
                if (getroffenerHeld is `Neo (Auserwählter)` && neo.health < 50) {
                    orakel(neo)
                }
                if (getroffenerHeld is Morpheus && neo.health < 50) {
                    orakel(morpheus)
                }

                if (getroffenerHeld is Trinity && neo.health < 50) {
                    orakel(trinity)
                }


                println("-----------------------------------------")
                Thread.sleep(2000)
                println()
                println("$boldText$fläche$rot$name greift ${getroffenerHeld.name} an$reset")
                println()
                Thread.sleep(2000)
                var schaden = (0..5).random() * 10 + 10

                getroffenerHeld.health -= schaden
                if (getroffenerHeld.health < 0) {
                    getroffenerHeld.health = 0

                }


                var text1 =
                    String.format("%-25s %s %s", "Held ${getroffenerHeld.name} hat ein Schaden von:", schaden, "DM")
                var text2 =
                    String.format("%-30s %s %s", "${getroffenerHeld.name} hat noch:", getroffenerHeld.health, "LP")
                println(text1)
                Thread.sleep(1000)
                println(text2)

                if (getroffenerHeld.health == 0) {
                    println("Der Held ist besiegt")

                }
                Thread.sleep(1000)
                lebenspunkteHelden(heldenTeam)
                break
            }

        }
    }

    fun lebenspunkteHelden(heldenTeam: MutableList<Helden>) {
        println()
        println("$boldText$fläche${green}Aktuelle Lebenspunkte der Helden$reset\n")
        Thread.sleep(1000)
        for (held in heldenTeam) {
            var aktuelleLp =
                String.format("$boldText$green%-20s %s LP  $reset", held.name + ":", held.health) // Chat GPT
            println(aktuelleLp)
        }

    }


}












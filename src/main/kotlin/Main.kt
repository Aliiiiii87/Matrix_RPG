import java.lang.reflect.Executable

var heldenTeam = mutableListOf<Helden>(
    `Neo (Auserwählter)`("Neo", 100, 50, 50, 0),
    Morpheus("Morpheus", 100, 50, 50, 0),
    Trinity("Trinity", 100, 50, 50, 0)

)

val neo = heldenTeam[0]
val morpheus = heldenTeam[1]
val trinity = heldenTeam[2]
var level: Int = 1

val green = "\u001B[32m"
val reset = "\u001B[0m"
val rot = "\u001B[31m"
val blau = "\u001B[34m"
val fläche = "\u001B[7m"
val boldText = "\u001b[1m"
val white = "\u001b[37m"

fun main() {
    willKommenScreen()
    println()
    Thread.sleep(2000)
    var regestrierterBenutzer = mutableListOf<Pair<String, String>>()
    benutzerRegestrieren(regestrierterBenutzer)
    anmeldung(regestrierterBenutzer)
    starteSpiel(heldenTeam)
    println("Loading.............")
    Thread.sleep(3000)

    val level1Agenten = Agenten("Agent Smith", 50, 20, 20, 0)
    level(heldenTeam, level1Agenten)
    var leve2Agent = Agenten("Agent", 50, 20, 20, 1)
    level(heldenTeam, leve2Agent)
    var level3agent = Agenten("Agent Smith", 50, 20, 30, 2)
    level(heldenTeam, level3agent)
    var wächter = Wächter("Wächter", 150, 100, 1, 100)
    level(heldenTeam, wächter)


}

// Hier ist eine urze Einleitung zum Spiel

fun willKommenScreen (){
   // Diese FunktioprintStament habe ich selber geschreiben um den Film Touch zu bekommen
    var text = "${fläche}${green}01010101001010101010101001010101010100101010101\n01010101001010101010101001010101010100101010101\n01010101001010101010101001010101010100101010101\n01010101001010101010101001010101010100101010101\n$reset${boldText}\n${fläche}${white}Orakel🔮:${reset}\n\nWillkommen in dem RPG Game Matrix. Es ist Zeit den Maschienen einhalt zu gewähren\nkämpfe dich in alle 4 Levels durch und besiege den End Boss den Wächter\nWähle deine angriffe bedacht der Gegner kann manchen Angriffen ausweichen\nIm von Level 1-3 kämpfst du gegen Agent Smith\nSei Vorsichtig er wird jede Runde stärker\nDu kämpst mit allen 3 Helden und kannst innerhalb der Runden die Helden Wechseln\nDer Endboss ist der Wächter. Wenn der Wächter unter 100 LP fällt macht er einen mächtigen Flächen Angriff\nZeige was du kannst\nNach der registrierung kann es los gehen"
    var verzögert = 40L
    printStatments(text,verzögert)

}

// Hier muss sich der User Registrieren

fun benutzerRegestrieren(
    regestrierterBenutzer: MutableList<Pair<String, String>>
) {
    var text8 = "\n$boldText$fläche${green}Willkommen im Spiel Matrix gebe deine Daten ein um dich zu registrieren$reset"
    var verzögert8 = 20L
    printStatments(text8, verzögert8)
    println("\n")
    var text2 = "Bitte geben Sie einen namen ein um sich zu Registrieren"
    var verzögert2 = 30L
    printStatments(text2, verzögert2)
    println()
    var benutzername = readln()
    var text3 = "Bitte geben Sie ein Passwort ein um sich zu Registrieren"
    var verzögert3 = 30L
    printStatments(text3, verzögert3)
    println()
    var passwortReg = readln()
    regestrierterBenutzer.add(benutzername to passwortReg)
    println("${boldText}${fläche}${green}Erfolgreich registriert$reset")


}

// Mit den Daten der Registration meldet sich der User An

fun anmeldung(regestrierterBenutzer: MutableList<Pair<String, String>>) {
    println()
    var text4 = "Willkommen im Login der Matrix, gib deine Login Daten ein"
    var verzögert4 = 30L
    printStatments(text4, verzögert4)
    println("\n")
    println("$fläche${green}${boldText}Benutzername Login :      $reset")
    var benutzerName = readln()
    println()
    println("$fläche${green}${boldText}Passwort Login :    $reset")
    var passWort = readln()

    var benutzer = regestrierterBenutzer.find { it.first == benutzerName && it.second == passWort }
    if (benutzer != null) {
        println()
        println("${boldText}${green}${fläche}Login erfolgreich$reset")
        var text6 =
            "${green}0101010101010100101010101010101010100101010101001010101010101001001010101001010101010101010101010101010101\n0101010010101010101001010101001001010101010010101001010101010101010101010101010101010101010101010101010101\n0101001010101010010101010010100101010010101010010101010101010101010010101010010101010101010101010101010101\n0101001010101010100101001010101010010101001010101010101010101010101010101010010101010101010101010101010101$reset"
        var verzögert6 = 20L
        printStatments(text6, verzögert6)
        println("\n")
        var text5 =
            "$fläche${white}${boldText}Hallo $benutzerName ich bin das ${green}${fläche}Orakel🔮$reset Die Gefahr ist groß die Maschienen Stadt mobilisiert$reset\n" +
                    "$fläche${white}${boldText}um einen endgültigenAngriff gegen Zion zu führen ! Du bist unsere letzte Hoffnung$reset"
        var verzögert5 = 30L
        printStatments(text5, verzögert5)
        println()
        Thread.sleep(2000)


    } else {
        println("$fläche${rot}${boldText}Login fehlgeschlagen. Bitte überprüfen Sie ihre Eingabe$reset")
        anmeldung(regestrierterBenutzer)
    }


}


fun starteSpiel(helden: MutableList<Helden>) {
    println()
    println("---------------------------------------------------------------------------------")
    try {
        var text7 =
            "$green${fläche}Morpheus🥷🏿$reset : ${boldText}Du suchst mich schon lange ? Ich suche dich mein ganzes Leben\n" +
                    "Du hast die Wahl Auserwählter.......... $reset"
        var verzögert7 = 30L
        printStatments(text7, verzögert7)
        println("\n")
        println(
            """
     ###########################################################################################      
                                                                                               
       $fläche$blau$boldText  [1] Wählst du die blaue 💊 schläfst du ein und wachst in deinem Zimmer auf$reset
        
       $fläche$rot$boldText   [2] Wählst du die rote 💊 gehts auf in den Kampf für Zion$reset
        
    ############################################################################################    
    """.trimIndent()
        )


        var pille = readln().toInt()
        when (pille) {
            1 -> {
                println("Du hast die blaue 💊 gewählt schlaf in ruhe und bleibe in der Traumwelt")
                beendeSpiel(heldenTeam)
            }

            2 -> {
                println("${rot}Du hast die rote 💊 gewählt : Auf in den Kampf$reset")
                println()
                var text =
                    "${green}Willkommen in der Matrix , wähle dein Helden aus und stürze dich in den Kampf gegen die Agenten" +
                            "\nSei vorsichtig und wähle bedacht ! Zion vertraut Dir, viel Glück$reset "
                var verzögert = 50L
                printStatments(text, verzögert)
            }

            else -> {
                println("Ungültige Auswahl ! Bitte gebe die richtige Auswahl ein ")
                starteSpiel(helden)

            }


        }
    } catch (e: Exception) {
        println("Ungültige Eingabe, versuche es erneut")
        starteSpiel(helden)
    }


}


fun beendeSpiel(helden: MutableList<Helden>) {
    if (helden.all { it.health <= 0 }) {


    }
    try {
        println(
            """
        [1] Spiel beenden
        [2] Weiter
    """.trimIndent()
        )

        var eingabe = readln().toInt()
        when (eingabe) {
            1 -> {
                println("Spiel wird beendet")
                var text = "01010101001010101010010101010100101010101010010101010100101010101001010101001\n01010101001010101010010101010100101010101010010101010100101010101001010101001\n01010101001010101010010101010100101010101010010101010100101010101001010101001\n01010101001010101010010101010100101010101010010101010100101010101001010101001"
                var verzögert = 30L
                printStatments(text,verzögert)
            }

            2 -> {
                println("Spiel geht weiter")
                var text2 = "01010101001010101010010101010100101010101010010101010100101010101001010101001\n01010101001010101010010101010100101010101010010101010100101010101001010101001\n01010101001010101010010101010100101010101010010101010100101010101001010101001\n01010101001010101010010101010100101010101010010101010100101010101001010101001"
                var verzögert2 = 30L
                printStatments(text2,verzögert2)
                starteSpiel(helden)
            }

            else -> {
                println("Ungültige eingabe")
                beendeSpiel(helden)
            }

        }
    } catch (e: Exception) {
        println("Ungültige Eingabe, versuchen Sie es nochmal")
        beendeSpiel(helden)
    }


}

// Hier wird nach jeder auswahl des Helden die aktuellen Werte angezeigt

fun showAtributs(helden: Helden) {
    println("\t\t\t${rot}Du hast ${helden.name} gewählt$reset")
    println(
        """
         
                $boldText${white}${fläche}Lebenspunkte     :    $boldText${helden.health} LP  $reset
                $boldText${white}${fläche}Angriffspunkte   :    $boldText${helden.attack}  DM  $reset
                $boldText${white}${fläche}Verteidigung     :    $boldText${helden.save}  DEF $reset
                $boldText${white}${fläche}Erfahrungspunkte :    $boldText${helden.exp}   EXP $reset
        
                
                
            """.trimIndent()

    )
    Thread.sleep(1000)
}


fun auswahlCharekter(feind: Feind): Helden? {
    println()
    var text1 = "Wähle deinen Helden"
    var verzögert1 = 100L
    printStatments(text1, verzögert1)
    println()
    println("..............")
    Thread.sleep(2000)

    println(
        """
            
      ##############################  
      #                            #
      #   [1] Neo                  #
      #   [2] Morpheus             #
      #   [3] Trinity              #
      #                            #
      ##############################
    """.trimIndent()
    )
    try {
        val auswahl = readln().toInt()
        when (auswahl) {
            1 -> {
                if (heldenTeam[0].health != 0) {
                    Thread.sleep(2000)
                    showAtributs(heldenTeam[0])
                    (heldenTeam[0] as `Neo (Auserwählter)`).waffenWahl(feind)
                    heldenTeam[0]


                } else {
                    throw Exception("Held ist nicht mehr verfügbar")

                }
            }

            2 -> {
                if (heldenTeam[1].health != 0) {
                    Thread.sleep(2000)
                    showAtributs(heldenTeam[1])
                    (heldenTeam[1] as Morpheus).waffenAuswahl(feind)
                    heldenTeam[1]

                } else {
                    throw Exception("Held ist nicht mehr Verfügbar")
                }
            }

            3 -> {
                if (heldenTeam[2].health != 0) {
                    Thread.sleep(2000)
                    showAtributs(heldenTeam[2])
                    (heldenTeam[2] as Trinity).waffenAuswahl(feind)
                    heldenTeam[2]

                } else {
                    throw Exception("Held ist nicht mehr Verfügbar")
                }

            }


            else -> throw Exception("${rot}Auswahl ungültig / Es gibt nur 3 Helden . Versuche es erneut$reset!")


        }


    } catch (e: Exception) {
        println(e.message)
        auswahlCharekter(feind)

    }; return null
}

// Darauf bin ich sehr stolz habe es selber geschreiben

fun printStatments(text: String, verzögert: Long) {
    for (char in text) {
        print("$char")
        Thread.sleep(verzögert)
    }

}


fun level(heldenTeam: MutableList<Helden>, agenten: Feind) {

    println("$boldText$fläche${rot}Willkomen in Level :$level$reset")

    var level4: Boolean = false
    var wächter = agenten as? Wächter

    while (heldenTeam.any { it.health > 0 } && agenten.health > 0) {
        auswahlCharekter(agenten)
        if (wächter is Wächter && (wächter.health < 100)) {
            wächter.bombe(heldenTeam)
            level4 = true
        }

        if (heldenTeam.all { it.health <= 0 }) {
            println("\nGame Over")
            beendeSpiel(heldenTeam)
            break


        } else if (agenten.health <= 0) {
            agenten.health = 0
            println("\n${fläche}${green}${boldText}Du hast das Level erfolgreich beendet ! Auf ins nächste Level$reset")
            level++
            println()
            println("${fläche}${green}Loading...........$reset\n")
            Thread.sleep(4000)



            break
        }
        agenten.attack()


    }

    if (level4) {
        println("Ende")
        beendeSpiel(heldenTeam)

    }


}

// Das Orakel ist eine Power Up funktion für die LP der Helden
fun orakel(held: Helden) {
    if (held.health < 50) {
        var text26 =
            "$fläche${white}Orakel\uD83D\uDD2E$reset:$rot${held.name} iss den keks\uD83C\uDF6A du hast nicht mehr genug Energie$reset\n"
        var verzögert26 = 30L
        printStatments(text26, verzögert26)
        println("----------------------------------------------------")
        var eingabe = readln()
        held.health += 50
        println("${fläche}${white}Orakel🔮${reset}Powerup  :Neue LP :${held.health} LP")

    }


}







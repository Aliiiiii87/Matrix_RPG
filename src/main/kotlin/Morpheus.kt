import kotlin.random.Random

open class Morpheus(name: String, health: Int, save: Int, attack: Int, exp: Int) :
    Helden(name, health, save, attack, exp) {

    var angriffZaehler: Int = 0
    var maxAngriff: Int = 2


    fun ninjaSchwert(feind: Feind) {
        var ausgewichen = Random.nextBoolean()


        if (ausgewichen) {
            feind.health += 10
            println("${feind.name} ist dem Ninjaschwert ausgewichen")
        } else {

            if (angriffZaehler < maxAngriff) {
                var schwertHieb = attack * exp + 50
                feind.health -= schwertHieb
                if (feind.health<0){
                    feind.health = 0
                }
                angriffZaehler++
                println("$name hat ${feind.name} mit dem Ninjaschwert angegriffen")
                println("${feind.name} Lebenspunkte : ${feind.health} LP")

            } else {
                println("$name hat die maximale Anzahl der Waffe erericht")
            }
        }
    }


    fun jujutsu(feind: Feind) {
        var juJutsu = attack * exp + 30
        feind.health -= juJutsu
        if (feind.health<0){
            feind.health = 0
        }
        var text11 = "Kick kick , faust , flipkick"
        var verzögert11 = 30L
        printStatments(text11,verzögert11)
        println()
        Thread.sleep(2000)
        println("${this.name} hat ${feind.name} mit Jijutsu angeriffen\nSchaden : $juJutsu DM")
        Thread.sleep(2000)
        println("${feind.name} Lebenspunkte : ${feind.health} LP")
        Thread.sleep(2000)


    }


    fun waffenAuswahl(feind: Feind) {
        var text19 = "Wähle eine Waffe aus"
        var verzögert19 = 30L
        printStatments(text19,verzögert19)
        println()
        Thread.sleep(1000)
        println(
            """
            
            [1] Ninjaschwert
            [2] Jijutsu  
            [3] schießen
            [4] kämpfen         
            
        """.trimIndent()
        )
        var auswahlWaffe = readln().toInt()
        when (auswahlWaffe) {

            1 -> {
                this.ninjaSchwert(feind)


            }

            2 -> {
                this.jujutsu(feind)

            }

            3 -> {
                this.schießen(feind)
                Thread.sleep(2000)

            }

            4 -> {
                this.kaempfen(feind)
            }


            else -> {
                println("Ungültige eingabe versuche es wieder ")
                waffenAuswahl(feind)
            }
        }
    }
}








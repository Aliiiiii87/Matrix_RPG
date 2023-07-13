import kotlin.random.Random

class Trinity(name: String, health: Int, save: Int, attack: Int, exp: Int) :
    Helden(name, health, save, attack, exp) {


   private var angriffZäehler: Int = 0
   private var maxAttack: Int = 2


    fun twoGuns(feind: Feind) {
        if (angriffZäehler < maxAttack) {
            var twoGuns = attack * exp + 30
            feind.health -= twoGuns
            if (feind.health<0){
                feind.health = 0
            }
            angriffZäehler++
            var text17 = "$name hat mit TwoGuns angegriffen"
            var verzögert17 = 20L
            printStatments(text17,verzögert17)
            println()
            var text18 = "${feind.name} schaden : $twoGuns DM"
            var verzögert18 = 50L
            printStatments(text18,verzögert18)
            println()

            println("${feind.name} Lebenspunkte : ${feind.health} LP")
            Thread.sleep(2000)
        }else {
            println("Deine Energie ist aufgebraucht")
        }


    }


    fun slowMotion(feind: Feind){
        var ausweichen = Random.nextBoolean()

        if (ausweichen){
            feind.health += 10
            println("Durch das ausweichen hat ${feind.name} 10 LP bekommen\nNeue LP: ${feind.health} LP")
            var text22 = "${feind.name} ist dem SlowMotion Kick ausgewichen"
            var verzögert22= 30L
            printStatments(text22,verzögert22)
            println()
        }else {
            var slowMotionkick = attack *exp + 100
            feind.health -= slowMotionkick
            if (feind.health<0){
                feind.health =0
            }
            var text23 = "$name hat mit SlowMotion Kick angergriffen"
            var verzögert23 = 30L
            printStatments(text23,verzögert23)
            println()
            Thread.sleep(1000)
            println("Schaden : $slowMotionkick DM")
            Thread.sleep(1000)
            println("${feind.name} Lebenspunkte : ${feind.health}")
            Thread.sleep(1000)
        }

    }


    fun waffenAuswahl(feind: Feind) {
        var text21 = "Wähle eine Waffe aus\n"
        var verzögert21 = 30L
        printStatments(text21,verzögert21)
        println()
        Thread.sleep(2000)

        println(
            """
            [1]  twoGuns
            [2]  SlowMotion kick
            [3]  Ultimative Attacke
        """.trimIndent()
        )
        var auswahl = readln().toInt()
        when (auswahl) {

            1 -> {
                this.twoGuns(feind)

            }

            2->{
                this.slowMotion(feind)

            }

            3->{
                this.ultimateAttack(feind)

            }

            else -> {
                println("Ungültige eingabe ! ")
                waffenAuswahl(feind)
            }
        }


    }
}
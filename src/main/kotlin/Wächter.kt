class Wächter(name: String, health: Int, attack: Int, exp: Int, save: Int) : Feind(name, health, attack, exp, save) {

    private var angriffsZaehler: Int = 0
    private var maxAngriffe: Int = 1


    fun bombe(helden: List<Helden>) {
        var output =
            "${fläche}${white}Wächter🤖:${reset}I\n${rot}hr Armeisen, ich aktieviere meine SuperBombe 💣💣💣💣💣💣💣💣💣💣$reset"
        var verzögertOutput = 30L
        printStatments(output, verzögertOutput)
        println()
        Thread.sleep(2000)
        var explosion = attack * exp + 50
        for (held in heldenTeam) {
            held.health -= explosion

            println()
            var output = String.format("%-20s %s LP", held.name + ":", held.health)
            print(output)
            Thread.sleep(2000)
        }
        for (held in helden) {
            if (held.health <= 0) {
                held.health = 0
                var output1 = "\n${held.name} ist besiegt"
                var verzögertOutput1 = 30L
                printStatments(output1, verzögertOutput1)
            } else {
                println("$name haaa so einfach mache ich es euch nicht  ")
                if (angriffsZaehler < maxAngriffe) {
                    println(" $name greift mit der EMP Bombe an  ")

                }
            }
        }


    }
}
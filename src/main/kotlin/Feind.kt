import kotlin.random.Random

 open class Feind(name: String, health: Int, save: Int, attack: Int, exp: Int) :
    Charektere(name, health, save, attack, exp) {



    open fun ausweichen() : Boolean {

        // Hier wird zufällig bestiimt ob der Gegner ausweichen kann oder nicht
        var ausgewichen = Random.nextBoolean()
        if (ausgewichen ) {

            println("$name ist der Attacke ausgewichen")
            return true

        } else {
            println("$name konnte der attacke nicht ausweichen")


           return false
        }
    }


}
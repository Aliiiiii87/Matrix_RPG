# Matrix RPG

---
Willkommen bei Matrix RPG ! Tauche ein in die Welt der Matrix und erlebe ein spannendes Rollenspiel über 4 Level.
Im finalen Level wartet der gefährliche Endboss Wächter auf dich

---
## Spielregeln

* Das Spiel besteht aus 4 aufeinanderfolgenden Leveln
* Du hast 3 Heldencharaktere zur Auswahl:
* Charaktere
  * Neo
  * Trinity
  * Morpheus

+ Der Hauptgegner ist Agent Smith und der Endboss Wächter
+ Jeder Held verfügt über verschiedene Fähigkeiten und Angriffstechniken
+ Das Orakel kann Power Ups zur Verfügung stellen, um die Lebenspunkte deiner Helden wiederherzustellen
+ Du kannst innerhalb der Runden die Helden wechseln und verschiedene Strategien anwenden

---
## Steuerung

* Während des Spieles wird das Menü angezeigt, das dir die verfügbaren Option anzeigt
* Verwende die Tasten 1,2,3,4 um die jeweiligen Aktionen des ausgewählten Helden ausführen
* Drücke die "Enter" um die Auswahl zu bestätigen

---
## Spielablauf

1. Das Spiel beginnt mit einer Einführung in die Regeln und das Hintergrundszenario der Matrix Welt
2. Registriere dich mit deinen Daten, um das Spiel zu starten.
3. Melde dich mit den registrieren Daten an.
4. Wähle zwischen der blauen und roten Pille. Die rote Pille lässt das Spiel beginnen, während die blaue Pille keinen Zugang zum Spiel gewährt
5. Du startest auf Level1 und kämpfst gegen Agent Smith. Verwende die Fähigkeiten deiner Helden, um den Feind zu besiegen
6. Fortsetzung der Level bis zum finalen Boss-Level, in dem du gegen den mächtigen Wächter antreten musst
7. Nutze Startegie und Geschicklichkeit, um den Wächter zu besiegen und das Spiel erfolgreich abzuschließen

---
## Heldenfähigkeit

### Neo

####  - fliegen  
  - ( ist für 2 sek Unverwundbar)
---
#####  - schockwelle 
  - (verursacht einen großen schaden der Gegner kann aber dem Angriff ausweichen)

---

####  - kämpfen
  - (verursacht ein schaden beim helden)

---
### Trinity

####  - twoGuns
  - (verursacht ein Schaden)

#### - SlowMotion kick

  - (Verursacht einen Schaden , der Gegner kann aber dieser Attacke ausweichen)


####  - Ultimative Attacke

  - (Verursacht einen großen Schaden der Gegner kann aber dieser Attacke ausweichen

---
####  Morpheus

####  - ninjaschwert

  - (verursacht einen Schaden der Gegner kann dieser Attacke ausweichen)

#### - Jujutsu

  - (verursacht einen Schaden beim Gegner)

####  - kämpfen

  - (verursacht einen Schaden beim Gegner)

---

##  Feindfähigkeiten

### Agent Smith

####  - attacke

  - ( Verursacht einen zufälligen schaden)

---

### Wächter

####  - Bombe

  - (Verursacht einen Flächenschaden wenn die LP des Wächter sinkt)

---

### Das Orakel

####  - Power Up für die Helden LP gibt den helden eine bestimmte LP wieder

---
### Geplante Funktionen

  - Attribute ist ein save dabei das die DEF punkte darstellen soll
  - Sie sind mit daebi aber noch nicht implementiert
  - Asimilieren ist eine Fähigkeit des Agenten und nimmt ein Heldencharakter und zieht ihn auf die seite der Gegner


---

### Eigene Funktion

```Kotlin
fun printStatments(text: String, verzögert: Long) {
  for (char in text) {
    print("$char")
    Thread.sleep(verzögert)
  }

}
```
  - Diese Funktion habe ich sleber geschrieben um dem Spiel ein Touch vom Film zu geben

---
### Hilfestellung


####  - Chat GPT

```Kotlin
String.format("%-25s %s %s", "Held ${getroffenerHeld.name} hat ein Schaden von:", schaden, "DM")
    
```
  - Hier habe ich den Code zum formatieren von Chat GPT geholt
  - Ebenfalss habe ich hilfe über Kotlinlong
  - Google
  - Toutoren der Batch 9 

---
###  Projekt Matrix RPG 

  - Projektname: Matrix RPG
  - Projektdauer : 2 Wochen
  - Projektmotivation : Das Matrix RPG-Projekt wurde aus meiner Leidenschaft und Begeisterung für den Film Matrix geboren. Als absoluter Fan des Films und seiner fesselnden Handlung wollte ich ein eigenes Spiel erschaffen, das die Fans wie mich begeistert und ihnen ein unvergessliches Spielerlebnis bietet.
  - Inspirationsquelle: Als Teil meiner Vorbereitung für das Projekt habe ich das PS2-Spiel Matrix gespielt und den Film erneut angeschaut. Dies ermöglichte es mir, mich tiefer in die Welt von Matrix einzutauchen und die Charaktere, Handlungselemente und die allgemeine Ästhetik besser zu verstehen. Diese Inspiration floss in das Design und die Entwicklung des Matrix RPG-Spiels ein.








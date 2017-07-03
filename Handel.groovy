class Handel {

  static waren = ['Honig', 'Salz', 'Tran', 'Pelze']
  static marktplaetze = ["Lübeck","Malmö","Riga","Kopenhagen","Bergen"]

  static main(args) {

    println "Handel"
    println "Waren: " + waren
    println "Märkte: " + marktplaetze
    // 30 tage handeln
    30.times { number ->
      println "Tag " + (number + 1)
    }

    println "Fertig!"
  }
}


## Modell der Wirtschaftssimulation

Bevor wir jetzt voreilig weiter in die Programmierung einsteigen, wollen wir erstmal nochmal einen Schritt zurückgehen und definieren, was wir eigentlich erreichen wollen. Wir beschreiben zunächst formlos was wir erreichen wollen, machen uns anschließen ein Modell davon und setzen es dann mit den Werkzeugen der Programmierung um.

[![Modell der Wirtschaftssimulation Video](https://img.youtube.com/vi/vLI5kN-_654/maxresdefault.jpg)](https://youtu.be/vLI5kN-_654)

### Ziel des Spiels

In n Tagen so viel Geld wie möglich verdienen.

```
Axels-MBP-2:handel axelklinger$ groovy Handel.groovy
Handel
Waren: [Honig, Salz, Tran, Pelze]
Märkte: [Lübeck, Malmö, Riga, Kopenhagen, Bergen]
Tag 1
Tag 2
Tag 3
Tag 4
Tag 5
...
Tag 29
Tag 30
Fertig!
```

### Marktplatz

Der Marktplatz zeigt die Produkte mit Anzahl und Preis, wie sie gekauft werden können.

```
Marktplatz 1
------------
1. Ware 1 - 20 Stk. - 13 EUR
2. Ware 2 - 40 Stk. - 27 EUR
3. Ware 3 - 10 Stk. - 17 EUR
```

### Tasche

In der Tasche befinden sich deine gekauften Waren. Die Tasche kann maximal X Waren aufnehmen.

### Waren

Die Waren sollten am Ende konfigurierbar sein, so dass man mit verschiedenen Konfigurationen mit anderen Waren handeln kann. Waren können hier zum Beispiel auch Aktien sein - und wer mehr lernen will, kann das ganze noch um eine Echtzeit-Abfrage von Werten aus dem Netz erweitern.

Beispiel für eine Konfiguration, wie sie aufgebaut sein könnte
```
[Marktplätze]
Frankfurt
London
New York
Tokio

[Waren]
Orangen 3-6 EUR
Äpfel   2-4 EUR
Pfeffer 10-20 EUR
```


Hanse
======

5 Städte
5 Waren

Start:
- 100 Taler
- Platz für 100 Einheiten

Waren mit Durchschnittspreisen
- Pelz 200
- Wolle 140
- Tran 80
- Honig 40
- Salz 20

Preisschwankung +/- 50%

Dauer 30 Tage

Platz
- Menge von Waren mit Anzahl und Durchschnittspreis

Vorgehen und Git Commits
=========================
a) Activities erstellen
  - Einstiegsseite mit "Neues Spiel" und "Highscore"
  - Liste der Städte
  - Liste der Waren mit Anzahl gekaufte, Name, aktueller Preis
  - Kaufen/Verkaufen Dialog
b) Navigation Neu-> Städte<->Waren, move bis Tag 30
c) Kaufen/Verkaufen mit "Kontostand" und "Warenkorb"

Commits
--------
- Projekt anlegen und teilen
- Startseite
- Liste der Städte + Inhalt der Liste
- Navigation Neu->Städte
- Liste der Waren + Inhalt der Liste
- Navigation Stadt->Waren
- 3-spaltige Liste + Inhalt
- Tageszähler bis 30
- Dialog Kaufen/Verkaufen
- Navigation Ware->kaufen/verkaufen
- Update Koto und Warenkorb
- Spielabbruch
- Highscoreliste speichern
...
- Grafik verfeinern
- Werbung einbinden
- in Playstore veröffentlichen

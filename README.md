# Blog Backend Projekt
> Dieses **README** wird im laufe des Faches `Vertielte Systeme` kontinuirlich ergänzt

Das Backend für ein Blog wird mit dem Full-Stack Framework [Quarkus](https://quarkus.io/) erstellt. 

---
## Folgende Dependencys wurden Quarkus hinzugefügt
| artifactId                      |
| ------------------------------- |
| quarkus-resteasy-reactive-jsonb |
---
>Alle Befehle unterhalb dieser Quote müssen in einem Terminal das sich im Aktuellen Programm Verzeichnis befindet ausgeführt werden. In **Windows** wäre dies die `CMD, PowerShell`, in **Linux** die `Bash, Shell, ZSH` oder in **MacOS** die `ZSH, BASH`. 

## Starten der Java Applikation im Developer modus
um in denn Developer modus starten zu können muss im Terminal folgender Befehl ausgeführt werden.
```Bash
./mvnw quarkus:dev
```
In diesem Modus ist es Möglich das [Dev UI](https://quarkus.io/guides/dev-ui) aufzurufen mit http://localhost:8080/q/dev/
>**Hinweis** das [Dev UI](https://quarkus.io/guides/dev-ui) ist nur im **Developer Modus** zugänglich

Nach dem ausführen des Dev Modus kann man mit der Adresse http://localhost:8080/blog auf die API Zugreiffen.

>Um denn Dev Modus zu beenden im terminal die Taste `q` drücken.

---
## Ausführen des Testing
Um die Applikation zu Testen gibt es Verschiedene arten.
1.  **Das Testen ohne denn Dev Modus**
    *   ```Bash
        ./mvnw verify
        ```
        Mit Diesem befehl wird mit denn Geschriebenen Tests (`Junit`) überprüft ob die Applikation alle Tests Besteht.

2.  **Das Testen mit dem Dev Modus**
    *   Wenn man sich im **Dev Modus** werden die Test standart mässig nicht durchgeführt sie sind Pausiert. Mit der Taste `r` können die tests durchgeführt werden. 
    *   Nach dem ausführen des befehls für denn Dev Modus ![Quarkus Test Paused](/github/assets/quarkus-testPaused.png)
    *   Nach dem drücken der Taste `r` ![Quarkus Test Runs](/github/assets/quarkus-testRuned.png)

---
## Eine Ausführbare jar erstellen
Um die Applikation in eine Ausführbare jar zu Komprimieren kann Folgender befehl im Terminal ausgeführt werden:
```Bash
./mvnw package
```
Damit werden alle noch Nötigen Dependency's Heruntergeladen anschliesssen werden die Tests durchgeführt und um ordener `target` abgelegt als `.jar` datei.
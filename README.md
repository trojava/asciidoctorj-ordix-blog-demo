## Demo für die Verwendung von AsciidoctorJ

Dieses Projekt erzeugt die Dokumentation mit AsciidoctorJ.


### PDF generieren
Zu Generierung der Doku in PDF-From genügt der Befehl

```
mvn
```

Die PDF-Dokumente findet man anschließend unter `target/generated-docs`.

In dem `1_main.pdf` sind alle anderen Dokumente aggregiert enthalten. Dies stellt damit also die gesamte Doku in einem PDF-Dokument dar.


### Graphviz installieren
Da in der Doku auch Diagramme mit PlantUML erstellt werden, ist die Installation von Graphviz erforderlich. Leider ist das ein in C geschriebenes Binärprogramm, welches das Binary "dot" beinhaltet. Dieses wird von PlantUML zur Erzeugung der Diagramme benötigt (außer bei Sequenzdiagrammen). Daher ist dies neben Java und Maven eine weitere Abhängigkeit, die für die Erzeugung der Dokumention erforderlich ist.

```
 sudo apt update
 sudo apt install graphviz
```

Das Programm "dot" wird unter Ubuntu im Pfad `/usr/bin/dot` installiert. AsciidoctorJ findet es über den Eintrag von `/usr/bin` in der `PATH`-Variable automatisch. Sollte das aus irgendeinem Grund nicht funktionieren oder ein anderes Binary genutzt werden, kann der Pfad in der `pom.xml` beim asciidoctor-maven-plugin im `configuration`-Block in den `attributes` definiert werden:


```xml
<configuration>
    <attributes>
        <graphvizdot>/usr/bin/dot</graphvizdot>
    </attributes>
</configuration>
```

**Ohne die Installation von Graphviz können leider nicht alle Diagramme erzeugt werden.**

#### Bindestrich in Boxen in ditaa-Grafiken
Da ein Bindestrich/Minuszeichen in ditaa-Grafiken für das Zeichnen von Linien verwendet wird, führt es in Texten (z. B. bei Demo-Projekt) zu Darstellungsfehlern. Es gibt einen halbwegs guten Workaround. Man kann das Zeichen 'Figure Dash' verwenden: '‒' (U+2012)



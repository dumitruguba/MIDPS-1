## Lucrare de laborator #2

### Makefile

Dosarul HelloWorldPrograms conţine un fişier makefile care compilează şi rulează programe Hello World în diferite limbaje.
Pentru a realiza aceste lucruri se execută instrucţiunea dată cu parametrii:

    $ [make] [parametru]

unde `make` este numele executabilului ce prelucrează fişiere makefile.

#### Parametri:

**all**
> Compilează toate codurile sursă, rulează fişierele executabile obţinute şi lansează interpretoare pentru limbaje ce necesită interpretate, după care şterge fişierele create de compilatoare.

**c**
> Compilează codul limbajului C şi rulează executabilul obţinut.

**cpp**
> Compilează codul limbajului C++ şi rulează executabilul obţinut.

**java**
> Compilează codul limbajului Java şi execută programul cu maşina virtuală Java.
    
**python**
> Lansează interpretorul pentru codul limbajului Python.
    
**ruby**
> Lansează interpretorul pentru codul limbajului Ruby.
    
**clean**
> Şterge fişierele create în urma compilării.


### Script Bash

În dosarul HelloWorldPrograms mai este un script bash care de asemenea compilează şi rulează programele.
Pentru a folosi scriptul, acesta trebuie lansat dintr-un shell Unix astfel:

	$ ./compile.sh [parametru1] [parametru1]

unde `compile.sh` este numele fişierului script. Parametrul 1 este adresa relativă sau absolută a unui fişier cu cod sursă, sau unu din flagurile de mai jos, în caz că script-ul se află în dosarul HelloWorldPrograms. Al doilea parametru poate fi flagul `-rm`.

#### Parametri:

**&lt;fişier&gt;**
> Reprezintă adresa relativă faţă de adresa unde se află script-ul, sau o adresă absolută a unui fişier, cu extensia: *.c, *.cpp, *.java, *.py sau *.rb.

**-c**
> Compilează fişierul în limbajul C, din dosarul \c\, şi rulează executabilul obţinut.

**-cpp**
> Compilează fişierul în limbajul C++, din dosarul \cpp\, şi rulează executabilul obţinut.

**-java**
> Compilează fişierul în limbajul Java, din dosarul \java\, şi execută programul cu maşina virtuală Java.

**-py**
> Lansează interpretorul pentru fişierul în limbajul Python, din dosarul \python\.
 
**-rb**
> Lansează interpretorul pentru fişierul în limbajul Ruby, din dosarul \ruby\.

**-rm**
> Dacă acest flag este primul parametru, se şterg toate fişierele create în urma compilării. Acest flag poate fi setat ca al doilea parametru, ce va duce la ştergerea imediată a fişierelor create în urma compilării.
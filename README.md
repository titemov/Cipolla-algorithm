# Cipolla-algorithm
Cipolla algorithm made on Java.

## TODO:
- [ ] Add Miller–Rabin primality test

## System requirements
Java version 23.0.1  

## Compilation

### Windows

1. Download latest [JDK](https://download.oracle.com/java/24/latest/jdk-24_windows-x64_bin.exe) and install it (adding variables to PATH).

2. Make sure you have javac.exe compiler `C:\Users\USER\.jdks\jdk-{version}\bin\javac.exe`

3. Download latest [JavaFx](https://gluonhq.com/products/javafx/) library and extract contents whereever it is reachable.

4. To compile, open command line in __source code directory__ and write  
   `javac.exe  Main.java`
   
    - If you have problems with javac.exe, try to write __absolute path__ to javac.exe (see p.2)
      

6. After compilation run `Main` file:
   `java Main`

### Linux (Debian/Ubuntu)

1. Run `sudo apt update` and `sudo apt upgrade`

2. Download latest [JDK](https://www.oracle.com/java/technologies/downloads/) for your Linux system and install it.

3. To compile, open command line in __source code directory__ and write  
   `javac Main.java`

4. After compilation run `Main` file:  
   `java Main`


# Sources:
- [Cipolla's Algorithm](https://en.wikipedia.org/wiki/Cipolla%27s_algorithm)
- [Legendre symbol](https://en.wikipedia.org/wiki/Legendre_symbol)
- Big thanks to [SeroviICAI](https://github.com/SeroviICAI/Modular_Arithmetic_Python/tree/master) project

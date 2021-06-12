## Networking
### Miguel Ángel Rodríguez Siachoque
### 11 de Junio de 2021

## Ejecución de programas
- Los programas HttpServer, URLScanner y URLReader no necesitan ejecutar un ___EchoServer___ para su funcionamiento.
- Todos los programas exceptuando los anteriores nombrados, neseitan ejecutarse:
  1. Ejecutar ___EchoServer___ que quiere ejecutar.
  2. Ejecutar ___EchoCliente___ para poder ingresar entradas.
  3. Escribir entradas segun correspondan (Se explica a continuación).

### Descripción de URLScanner.java
Este programa lee una URL a la cual se podra extraer y mostrar los protocolos de esta, en total 8 protocolos ()
#### Ejecución
> 1. Ejecución del programa.
> 2. La entrada debe ser una URL.
> 3. La salida serán los 8 protocolos de la URL.

### Descripción de URLReader.java
Este programa lee el contenido de la URL y lo extrae archivando la información en un archivo con extensión .html .
#### Ejecución
> 1. Ejecución del programa.
> 2. La entrada debe ser una URL.
> 3. La salida será un mensaje que explicará si el proceso a terminado.
> 4. El archivo resultado.html se guardará en la carpeta principal del proyecto.

### Descripción de HttpServer.java
Este es un programa que ejecuta un servidor HTTP en el cual se podran ejecutar diferentes archivos dentro de este.
#### Ejecución
> 1. Ejecución del programa.
> 2. Ingresará en su buscador preferido y pondrá la dirección: http://127.0.0.1:35000/ + El archivo que quiere visualizar.

### Descripción de EchoServerSquare.java
Este es un programa en el cual se da el resultado del cuadrado del número asigando.
#### Ejecución
> 1. Ejecución del programa.
> 2. Ejecución de ___EchoClient____.
> 3. La entrada puede ser un número ó terminar ___EchoServer___ con "Bye.".
> 4. La salida será el número cuadrado ó la despedida del servidor.

### Descripción de EchoServerTrigonometric.java
Este es un programa en el cual se ejecuta una calculadora triginometrica con las funciones de Seno, Coseno y Tangente.
#### Ejecución
> 1. Ejecución del programa.
> 2. Ejecución de ___EchoClient____.
> 3. La entrada puede ser un número, el cambio de la función___(fun:cos, fun:sin, fun:tan)___, terminar ___EchoServer___ con "Bye.".
> 4. La salida será el resultado del número ó la despedida del servidor.

## Diagrama de Clases
### Diagrama URLScanner.java
![Diagrama Clases](Image/DiagramaClase1.jpg)
### Diagrama URLReader.java
![Diagrama Clases](Image/DiagramaClase2.jpg)
### Diagrama HttpServer.java
![Diagrama Clases](Image/DiagramaClase3.jpg)
### Diagrama EchoServerSquare.java
![Diagrama Clases](Image/DiagramaClase4.jpg)
### Diagrama EchoServerTrigonometric.java
![Diagrama Clases](Image/DiagramaClase5.jpg)

## Test
![Test App](Image/Test.PNG)
Se realizarón cuatro pruebas con mediante al comando: mvn test.<br>
> - Se realizaron 3 Pruebas por programa.
> - Las pruebas de HttpServer se verifican entrando en http://127.0.0.1:35000/TestHttpServer1.html, http://127.0.0.1:35000/TestHttpServer2.html ó http://127.0.0.1:35000/TestHttpServer3.html .

## JavaDoc:
[JavaDoc - Networking](JavaDocs/index.html)

## Tiempo de Lineas LOC: 
El archvivo URLScanner.java:<br>
52 + 15(Test) = 67 lineasLOC.<br>
El archvivo URLReader.java:<br>
102 + 15(Test) = 117 lineasLOC.<br>
El archvivo HttpServer.java:<br>
33 + 36(Test) = 99 lineasLOC.<br>
El archvivo EchoServerSquare.java:<br>
54 + 25(Test) = 79 lineasLOC.<br>
El archvivo EchoServerTrigonometric.java:<br>
77 + 26(Test) = 103 lineasLOC.

### Tiempo total:
<p>
465/14 = 33.21 lineasLOC/hora.
</p>

# Readme.md
En este repositorio se encuentra la tercera funcionalidad solicitada en la evaluación. (convertir a números romanos.)

### Requerimientos
JDK8 o superior
	
	
## Instalación sin IDE
- Descargue el proyecto en formato comprimido *ZIP*, luego descomprimir en algún sitio cuya ruta  se nombrá aquí como `pathproject`por motivos genéricos.

- Inicie la consola de comandos y U
ubiquese dentro de la carpeta del proyecto *Evaljav*.
 ```bash
    > cd pathproject\Evaljav 
```
 - Compile las clases del proyecto y el Main:
```bash
	Evaljav > javac -d  bin pathproject\Evaljav\src\clasesausar\Conversor.java
	Evaljav > javac -d bin -cp pathproject\Evaljav\bin\ pathproject\Evaljav\src\Main.java
```

- Ejecute el Main:
```bash
Evaljav > cd bin
Evaljav\bin > java Main -r <num>
```
O también:
```bash
Evaljav\bin > java Main -ri <num>
```
Donde *\<num>* es un entero en notación decimal a convertir a romano.\
`-ri`: La salida es en minúsculas.\
`-r`: La salida es en mayúsculas.



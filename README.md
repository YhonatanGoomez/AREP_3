# SparkWeb Server
Este proyecto consiste en la implementación de un servidor web utilizando el microframework SparkWeb, el cual permite construir aplicaciones web de manera sencilla utilizando funciones lambda en Java. Este servidor web es capaz de gestionar servicios GET y POST, servir archivos estáticos, configurar el directorio de los archivos estáticos y cambiar el tipo de respuesta a "application/json".

## Arquitectura:
El servidor web se construye utilizando el API básico de Java sin utilizar frameworks como Spark o Spring. Se utiliza el concepto de programación orientada a objetos para crear un servidor que gestiona las solicitudes HTTP entrantes y las procesa según las rutas definidas por el usuario.
UTILIZAREMOS COMO BASE EL LABORATORIO ANTERIOR REVISADO Y ENTREGADO (Taller 2)
## Cómo correr el proyecto:

1. Clone el repositorio desde GitHub:

```
https://github.com/YhonatanGoomez/AREP_3.git
```

2. Compilar el codigo fuente:
```
cd AREP_3
javac src/main/java/arep2/taller2/*.java
```
3. Ejectar el servidor:

```
java -cp src/main/java arep2.taller2.Taller2
```
4. Una vez que el servidor esté en funcionamiento, puede enviar solicitudes HTTP al servidor.:

```
localhost:35000
```



### Construcción:
- Java
- Maven
- Git

### Autor:
Este servidor web fue creado por Yhonatan Gómez.
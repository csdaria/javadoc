# Proyecto Java: Programación Orientada a Objetos

Se desarrollan tres clases de una aplicacion orientada a la difusión de temas musicales entre profesionales de la industria para su posterior comercialización y distribución. En concreto, las clases cancion, reproductor y playlist les permitirá tener acceso a los temas que serán potenciales objetos de compra por parte de los usuarios. 

## Uso 

Se trata de un servicio de pago en el cual los suscriptores tendrán acceso a una base de datos de temas que aún no han sido comercializados y que están disponibles para su venta y distribución de derechos. Estos serán subidos por compositores que harán grabaciones de los mismos y que se subirá a la plataforma; el resto de usuarios, por su parte, tendrán acceso y podrán escucharlos, pudiendo contactar a los compositores en el caso de estar interesados en la compra. 


## Diagrama de clases de la aplicación web

Después de numerosas modificaciones, en este diagrama de clases se han introducido los siguientes cambios principales: 

* Se perfecciona la herencia: ahora la clase persona se divide en suscriptores, por un lado, y empleados. De entre los suscriptores, habrá dos tipos: suscriptor y compositor; de entre los empleados contaremos con administradores y analistas. 

* Se crea la clase reproductor que tomará elementos de la clase canción, ya que parece más adecuado tratar los métodos en los que se reproducirán las canciones desde un objeto reproductor para crear instancias de la propia clase canción y añadirlas al reproductor. 

* Muchos de los elementos tipo Imagen, Documentos, Condiciones, etc., que eran clases que iban a ser referenciadas por otras clases pasan a ser de tipo File, que es la que proporciona una variedad de métodos útiles para trabajar con archivos y directorios.

* En el sistema se incluyen la suscripción con los añadidos de pago y tarjeta de crédito. En este sentido, los temas negociados y comprados serán considerados como un tipo de datos que actualizará el estatus de las canciones en la propia BD; no obstante, el tema de la negociación para la adquisición de derechos de explotación comercial se realizará entre humanos y la aplicación solo conocerá el resultado final de dicha negociación cuando esta requiera de la modificación de su base de datos.

![](https://i.imgur.com/XVNDm0e.png)


## Desarrollo de algunas clases en Java

Se desarrollan las clases canción, reproductor y playlist, necesarias para escuchar los temas y poder listar aquellos que sean de interés del usuario. En concreto, se han desarrollado las siguientes clases:

* **Canción**: contiene todos los atributos relativos a los temas guardados en las bases de datos con sus correspondientes getters y setters para facilitar la información y los datos que necesitan las clases Reproductor y Playlist para poder funcionar correctamente.


* **Reproductor**: permite reproducir las canciones, además de pausarlas, adelantarlas, retrocederlas, pasar al anterior o siguiente tema o, simplemente saltarlo. Para la mayoría de estos métodos se comprueba, en primer lugar, si la lista de canciones existe verificando que hay temas en el arraylist de listaCanciones y, en caso afirmativo, se procede a realizar la función. 

Así, en el caso de saltarTema se busca la posición de la canción en la lista mediante el método indexOf y se llama al método reproducir, seleccionando el tema a escuchar como parámetro para hacerlo. 

```java 
 public void saltarTema(Cancion cancion) {
        if (listaCanciones != null) {
            int posicion = listaCanciones.indexOf(cancion);
            if (posicion != -1) { // Si la cancion se encuentra en la lista
                tema = listaCanciones.get(posicion);
                System.out.println("Saltando a la cancion: " + tema.getTitulo());
                reproducir(tema);
            } else {
                System.out.println("La cancion no esta en la lista de reproduccion.");
            }
        }

```

El método siguiente, por otro lado, sirve para avanzar al tema inmediatamente posterior de la canción seleccionada; para ello se incrementa la variable cancionActual y en el caso de que cancionActual sea mayor o igual que el tamaño de la listaCanciones, volvemos al principio del listado, asignando a cancionActual la variable 0.

```java 
    public void siguiente() {
        if (listaCanciones != null) {
            cancionActual++;
            if (cancionActual >= listaCanciones.size()) {
                cancionActual = 0;
            }
            reproducir(listaCanciones.get(cancionActual)); 
        }
    }

```
En el caso anterior, el método es igual pero con las variable cancionActual decrementada y la condición establecida de tal modo que si se intenta ir al tema inmediatamente anterior cuando la variable cancionActual está establecida a 0 se reproducirá el último tema que conforma el ArrayList de listaCanciones. 

```java 
   public void anterior() {
        if (listaCanciones != null) {
            cancionActual--;
            if (cancionActual < 0) {
                cancionActual = listaCanciones.size() - 1; 
            }
            reproducir(listaCanciones.get(cancionActual));
        }
    }

```

A su vez, se puede importar una playlist desde la clase reproductor con el método importar playlist que llama al ArrayList de listaCanciones y reproduce dicho listado: 

```java 
     public void importarPlayList(Playlist playlist) {
        listaCanciones=playlist.getCanciones();
        cancionActual=0;
        reproducir(listaCanciones.get(cancionActual));

    }

```

* **Playlist**: con ella, el usuario puede elaborar sus propias listas de temas, darles nombres propios, agregar y eliminar temas a gusto, además de ver los detalles de la canción reproducida e información básica sobre la playlist: duración total, número de temas que la componen, etc.

Al igual que con la clase reproductor, la playlist también usa un arrayList para agregar temas. Los métodos de esta clase son muy simples, ya que se aprovecha de varios métodos que nos aportan los propios ArrayList para agregar y eliminar temas y se suma o se resta, según corresponda, la duración del tema a la duración total de la Playlist: 

```java 
        public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
        duracion += cancion.getDuracion();
        numCanciones++;
    }
```
```java 
         public void eliminarCancion(Cancion cancion) {
        canciones.remove(cancion);
        duracion -= cancion.getDuracion();
        numCanciones--;

    }
```

* **Clase principal**: se desarrolla una simple clase main donde se prueban algunos de los métodos más importantes para comprobar que todo funciona correctamente.

## Subida del proyecto a GitHub

![](https://i.imgur.com/7jcZxWe.png)

Después de numerosos intentos frustrados de crear un GitHubPages del JavaDoc de mis proyectos haciéndolo desde la rama main y luego seleccionando el directorio docs para configurar el Pages, decidí tomar docs como rama principal, ya que vi que todos los elementos incluidos en el directorio docs (incluido el index.html) estaban presentes. Así, a la desesperada, procedí a agregar docs para crear la página de su contenido y luego subí el resto del proyecto, ya que ha sido lo único que ha funcionado para poner el JavaDoc como el contenido de GH-Pages. 

El link de dicha página se encuentra en la siguiente sección de este documento.

## Soporte

Consultar documentación en https://csdaria.github.io/javadoc/allclasses-index.html. 
Para obtener más ayuda, contactar a cs.daria@proton.me 

## Autor

@CristinaSantana

## Licencia 

Uso comercial

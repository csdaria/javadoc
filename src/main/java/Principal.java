import java.util.ArrayList;

/**
 * clase Principal de prueba de las clases cancion, reproductor y playlist
 * con la inicializacion de tres temas
 * @author cris
 */
public class Principal {
    /**
     * se prueban las clases cancion, reproductor y playlist con algunos de sus metodos mas importantes
     * @param args recibe argumentos
     */
    public static void main(String[] args) {

         //Creacion de canciones

        // Creamos algunas canciones
        Cancion c1 = new Cancion("Cancion 1", 101, 2020, "static", "Techno", "longnode", "CC", "Ana Litica", "loquesea Records");
        Cancion c2 = new Cancion("Cancion 2", 102, 2021, "void", "Technics", "host", "CM", "El Datafono", "locosea Records");
        Cancion c3 = new Cancion("Cancion 3", 103, 2022, "main", "Tekken", "dataserver", "CCC", "Main Mike", "lodoteca Records");

        /**
         *  Creacion del reproductor y configuracion de algunos temas
         */

        Reproductor reproductor = new Reproductor();
        reproductor.setTema(c1);
        int cancionActual = 0; // Empezamos con la cancion del reproductor en la posicion 0
        /**
         * Declaracion e inicializacion de las canciones a reproducir
         */

        ArrayList<Cancion> listaCanciones = new ArrayList<>();
        listaCanciones.add(c1);
        listaCanciones.add(c2);
        listaCanciones.add(c3);

        /**
         * Comprobacion de metodos del reproductor
         */

        reproductor.reproducir(c1);
        reproductor.pausar(c1);
        reproductor.adelantar(30);
        reproductor.retroceder(60);
        reproductor.siguiente();
        reproductor.anterior();
        reproductor.saltarTema(c2);

        /**
         * Creacion de una playlist
         */

        Playlist lista = new Playlist(1, "Mi playlist");
        lista.agregarCancion(c1);
        lista.agregarCancion(c2);
        lista.agregarCancion(c3);

        /**
         * Se muestra el listado de la playlist
         */

        lista.mostrarCanciones();

        /**
         * Se elimina un tema de la playlist y se vuelve a mostrar el listado de temas
         */

        lista.eliminarCancion(c2);
        lista.mostrarCanciones();
    }
}


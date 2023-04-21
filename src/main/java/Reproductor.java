import java.util.ArrayList;

/**
 * clase reproductor para poder escuchar los temas
 * de la clase cancion
 * @author cris
 */
public class Reproductor {
    private Cancion tema;
    private ArrayList<Cancion> listaCanciones;
    private int cancionActual;


    /**
     * Constructor por defecto
     */
    public Reproductor() {
        tema = null;
    }

    // Getters y Setters

    /**
     * devuelve el tema del que se trata
     * @return cancion
     */
    public Cancion getTema() {
        return tema;
    }

    /**
     * se establece el tema a agregar
     * @param tema recoge el tema que se agrega
     */

    public void setTema(Cancion tema) {
        this.tema = tema;
    }


    //Listado de metodos

    /**
     * Recibe los temas que estan listos para reproducir
     * de la lista disponible de temas para que el usuario
     * pueda seleccionar el que sea de su interes
     * @param listaCanciones conjunto de canciones que el usuario puede seleccionar
     */
    public void reproducir(Cancion listaCanciones) {
        if (tema != null) {
            System.out.println("Reproduciendo la cancion " + tema.getTitulo());
        } else {
            System.out.println("No hay ninguna cancion seleccionada");
        }
    }

    /**
     * Paula la cancion que esta siendo reproducida
     * en caso de haber alguna
     * @param listaCanciones conjunto de canciones que el usuario puede seleccionar
     */


    public void pausar(Cancion listaCanciones) {
        if (tema != null) {
            System.out.println("Pausando la cancion " + tema.getTitulo());
        } else {
            System.out.println("No hay ninguna cancion seleccionada");
        }
    }

    /**
     * Calcula la nueva duracion del tema
     * despues de haber sido adelantado: asi, se resta
     * la cantidad de segundos a la duracion actual del tema
     * y se guarda en la variable nuevaDuracion para actualizarla
     * mediante el metodo setDuracion y que asi se reproduzca hasta
     * la nuevaDuracion del tema despues de haber sido adelantada
     * @param segundos numero de segundos a recalcular para adoptar la duracion hasta el final de la cancion en escucha
     */

    public void adelantar(int segundos) {
        if (tema != null) {
            int nuevaDuracion = tema.getDuracion() - segundos;
            tema.setDuracion(nuevaDuracion);
            System.out.println("Adelantando " + segundos + " segundos en la cancion " + tema.getTitulo());
        } else {
            System.out.println("No hay ninguna cancion seleccionada");
        }
    }

    /**
     * Calcula la nueva duracion del tema despues de haber sido retrocedido:
     * asi, se agrega la cantidad de segundos que ha sido retrocedido
     * y se guarda en la variable nuevaDuracion para actualizar la duracion restante
     * del tema hasta su fin, tras haber sido actualizada con el metodo set
     * @param segundos numero de segundos a recalcular para adoptar la duracion hasta el final de la cancion en escucha
     */

    public void retroceder(int segundos) {
        if (tema != null) {
            int nuevaDuracion = tema.getDuracion() + segundos;
            tema.setDuracion(nuevaDuracion);
            System.out.println("Retrocediendo " + segundos + " segundos en la cancion " + tema.getTitulo());
        } else {
            System.out.println("No hay ninguna cancion seleccionada");
        }
    }


    /**
     * pasa al siguiente tema en un listado de temas
     * siempre y cuando haya algun tema seleccionado
     */
    public void siguiente() {
        if (listaCanciones != null) {
            cancionActual++;
            if (cancionActual >= listaCanciones.size()) {
                cancionActual = 0; // se vuelve al inicio de la lista cuando la lista de canciones llega al final
            }
            reproducir(listaCanciones.get(cancionActual)); // se reproduce la siguiente cancion
        }
    }

    /**
     * retrocede a la cancion anterior de una serie de temas
     * siempre y cuando haya algun tema seleccionado
     */

    public void anterior() {
        if (listaCanciones != null) {
            cancionActual--;
            if (cancionActual < 0) {
                cancionActual = listaCanciones.size() - 1; // vuelta al final de la lista cuando llega al inicio
            }
            reproducir(listaCanciones.get(cancionActual)); // reproduccion de la cancion anterior
        }
    }


    /**
     *
     * se declara la variable posicion a partir del indice numerico
     * de los temas seleccionados para acceder al numero de cancion
     * que desea escuchar el usuario, el cual la identificara seleccionando
     * titulo de la misma
     *
     * @param cancion recibe la cancion a la que se va a saltar
     */

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
    }

    /**
     * Se importa la playlist con el listado de canciones seleccionadas
     * empezando por el primer tema agregado a la playlist
     * @param playlist selecciona la Playlist que se quiere importar
     */
    public void importarPlayList(Playlist playlist) {
        listaCanciones=playlist.getCanciones();
        cancionActual=0;
        reproducir(listaCanciones.get(cancionActual));

    }

    /**
     *
     * @return devuelve los detalles esenciales del tema en escucha
     */
    @Override
    public String toString() {
        String str = "Reproductor\n";
        str += "Tema actual: " + tema.getTitulo() + " - " + tema.getInterprete() + "\n";
        return str;
    }
}
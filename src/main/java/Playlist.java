import java.util.ArrayList;

/**
 * creacion de playlist para poder personalizar
 * la experiencia musical de los profesionales
 * @author cris
 */
public class Playlist {
    private int idLista;
    private String nombre;
    private int duracion;
    private int numCanciones;
    private ArrayList<Cancion> canciones;

    /**
     * Constructor de inicializacion que recibe
     * el identificador y el nombre de la Playlist
     * (que sera un ArrayList por ser dinamico)
     * al momento de ser creada
     * @param idLista identificador
     * @param nombre nombre propio a elegir por el usuario
     */

    // Constructor de inicializacion

    /**
     * parametros a recibir de Playlist
     * @param idLista identificador de playlist
     * @param nombre nombre de la playlist
     */
    public Playlist(int idLista, String nombre) {
        this.idLista = idLista;
        this.nombre = nombre;
        this.duracion = 0;
        this.numCanciones = 0;
        this.canciones = new ArrayList<Cancion>();

    }

    // Getters y Setters

    /**
     * se obtiene el id unico de playlist
     * @return identificador de playlist
     */
    public int getIdLista() {
        return idLista;
    }

    /**
     * establecimiento de identificador
     * @param idLista identificador unico de playlist
     */

    public void setIdLista(int idLista) {
        this.idLista = idLista;
    }

    /**
     * se obtiene el nombre de lista
     * @return nombre de lista
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * denominacion de playlist
     * @param nombre establece un nombre a la playlist
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * devuelve la duracion total de la playlist
     * @return duracion total de la lista
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * duracion de playlist
     * @param duracion duracion total de playlist
     */

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * numero total de temas
     * @return numero de canciones que tiene la lista
     */

    public int getNumCanciones() {
        return numCanciones;
    }

    /**
     * numero de canciones a introducir
     * @param numCanciones total canciones de la playlist
     */

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    // Metodos

    /**
     * Agrega la cancion a la playlist
     * @param cancion  tema a agregar
     */

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
        duracion += cancion.getDuracion();
        numCanciones++;
    }

    /**
     * Elimina el tema de la playlist
     * @param cancion tema a borrar
     */

    public void eliminarCancion(Cancion cancion) {
        canciones.remove(cancion);
        duracion -= cancion.getDuracion();
        numCanciones--;

    }

    /**
     * For each para mostrar el titulo y la duracion de
     * cada tema agregado a la Playlist
     */
    public void mostrarCanciones() {
        for (Cancion cancion : canciones) {
            System.out.println("- " + cancion.getTitulo() + " (" + cancion.getDuracion() + " segundos)");
        }
    }

    /**
     * ToString con los detalles de la playlist:
     * elementos que la componen, duracion total
     * y el numero de elementos que la conforman
     * @return recoge informacion esencial de la playlist
     */
    @Override
    public String toString() {
        String str = "Playlist " + idLista + ": " + nombre + "\n";
        str += "Duracion total: " + duracion + "s\n";
        str += "Numero de canciones: " + numCanciones + "\n";
        return str;
    }


    /**
     * introduccion de canciones en el arraylist
     * @return devuelve las canciones que conforman la playlist
     */
    // Getters y Setters
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    /**
     * establecer cancion
     * @param canciones recoge las canciones que conforman la playlist
     */

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

}

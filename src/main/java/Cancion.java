/**
 * clases cancion para reproducir musica en una plataforma de intercambio musical
 * para profesionales de la musica
 * @author cris
 */

public class Cancion {
    private String titulo;
    private int duracion;
    private int anho;
    private String compositor;
    private String genero;
    private String pais;
    private String copyright;
    private String interprete;
    private String disquera;


    /**
     * atributos de tema
     * @param titulo titulo del tema
     * @param duracion duracion del tema
     * @param anho  anho de publicacion
     * @param compositor compositor del tema
     * @param genero  genero musical al que pertenece
     * @param pais pais de registro del tema
     * @param copyright marco legal
     * @param interprete nombre de quien lo interpreta en la grabacion aportada
     * @param disquera compania a la que pertenece
     */
    // Constructor
    public Cancion(String titulo, int duracion, int anho, String compositor,
                   String genero, String pais, String copyright,
                   String interprete, String disquera) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.anho = anho;
        this.compositor = compositor;
        this.genero = genero;
        this.pais = pais;
        this.copyright = copyright;
        this.interprete = interprete;
        this.disquera = disquera;

    }

    /**
     * devuelve el titulo de la cancion
     * @return se obtiene el titulo del tema
     */

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    /**
     * titulo establecido para el tema
     * @param titulo agrega el titulo de la cancion
     */

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * se obtiene la duracion
     * @return devuelve la duracion del tema
     */

    public int getDuracion() {
        return duracion;
    }

    /**
     * duracion total del tema
     * @param duracion se introduce la duracion del tema
     */

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * devuelve el anho de creacion
     * @return devuelve el anho de creacion
     */

    public int getAnho() {
        return anho;
    }

    /**
     * anho de creacion
     * @param anho se introduce el anho de creacion del tema
     */

    public void setAnho(int anho) {
        this.anho = anho;
    }

    /**
     * se obtiene el nombre del compositor
     * @return devuelve el nombre del compositor
     */

    public String getCompositor() {
        return compositor;
    }

    /**
     * se recoge el nombre del compositor del tema
     * @param compositor se introduce el nombre del compositor del tema
     */

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    /**
     * se obtiene el genero musical principal del tema
     * @return devuelve el genero musical al que pertenece el tema
     */

    public String getGenero() {
        return genero;
    }

    /**
     * genero musical prioritario en el que se encaja
     * @param genero se introduce el genero musical al que pertenece el tema
     */

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * pais de registro de derechos
     * @return devuelve el pais de registro del tema
     */

    public String getPais() {
        return pais;
    }

    /**
     * pais de registro del tema
     * @param pais se introduce el pais de registro del tema
     */

    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * denominacion de tenencia de derechos
     * @return devuelve el marco de propiedad intelectual al que se acoge el tema
     */

    public String getCopyright() {
        return copyright;
    }

    /**
     * regimen de derechos
     * @param copyright se introduce el marco de propiedad intelectual al que se acoge el tema
     */

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    /**
     * obtiene nombre del interprete
     * @return devuelve el nombre del interprete de la grabacion del tema
     */

    public String getInterprete() {
        return interprete;
    }

    /**
     * interprete del tema
     * @param interprete recoge el nombre del interprete de la grabacion del tema
     */

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    /**
     * companhia propietaria
     * @return devuelve la disquera a la que pertenece
     */

    public String getDisquera() {
        return disquera;
    }

    /**
     * companhia a la que pertenece el tema
     * @param disquera recoge el nombre de la disquera a la que pertenece
     */

    public void setDisquera(String disquera) {
        this.disquera = disquera;
    }

    /**
     *
     * @return detalles del tema recogidos
     */
    @Override
    public String toString() {
        String str = "Cancion: " + titulo + "\n";
        str += "Duracion: " + duracion + "s\n";
        str += "Anho: " + anho + "\n";
        str += "Compositor: " + compositor + "\n";
        str += "Genero: " + genero + "\n";
        str += "Pais: " + pais + "\n";
        str += "Disquera: " + disquera + "\n";
        str += "Interprete: " + interprete + "\n";
        return str;
    }
}



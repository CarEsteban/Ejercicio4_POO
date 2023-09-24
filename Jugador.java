/**
 * La clase Jugador representa a un jugador genérico en un equipo de fútbol.
 */
public class Jugador {
    /**
     * Nombre del jugador.
     */
    protected String nombre;
    
    /**
     * País de origen del jugador.
     */
    protected String pais;
    
    /**
     * Número de faltas cometidas por el jugador.
     */
    protected int faltas;
    
    /**
     * Número de goles directos anotados por el jugador.
     */
    protected int goles_directos;
    
    /**
     * Número total de lanzamientos realizados por el jugador.
     */
    protected int total_lanzamientos;

    /**
     * Constructor de la clase Jugador.
     * 
     * @param nombre             Nombre del jugador.
     * @param pais               País de origen del jugador.
     * @param faltas             Número de faltas cometidas por el jugador.
     * @param goles_directos     Número de goles directos anotados por el jugador.
     * @param total_lanzamientos Número total de lanzamientos realizados por el jugador.
     */
    public Jugador(String nombre, String pais, int faltas, int goles_directos, int total_lanzamientos) {
        this.nombre = nombre;
        this.pais = pais;
        this.faltas = faltas;
        this.goles_directos = goles_directos;
        this.total_lanzamientos = total_lanzamientos;
    }

    /**
     * Obtiene el nombre del jugador.
     * 
     * @return El nombre del jugador.
     */
    protected String getNombre() {
        return this.nombre;
    }

    /**
     * Obtiene el país de origen del jugador.
     * 
     * @return El país de origen del jugador.
     */
    protected String getPais() {
        return this.pais;
    }

    /**
     * Obtiene el número de faltas cometidas por el jugador.
     * 
     * @return El número de faltas cometidas por el jugador.
     */
    protected int getFaltas() {
        return this.faltas;
    }

    /**
     * Obtiene el número de goles directos anotados por el jugador.
     * 
     * @return El número de goles directos anotados por el jugador.
     */
    protected int getGoles_directos() {
        return this.goles_directos;
    }

    /**
     * Obtiene el número total de lanzamientos realizados por el jugador.
     * 
     * @return El número total de lanzamientos realizados por el jugador.
     */
    protected int getTotal_lanzamientos() {
        return this.total_lanzamientos;
    }

    /**
     * Devuelve una representación en cadena del jugador.
     * 
     * @return Una cadena que representa al jugador con sus atributos.
     */
    @Override
    public String toString() {
        return "Jugador: Nombre=" + this.nombre + ", País=" + this.pais + ", Faltas=" + this.faltas
                + ", Goles Directos=" + this.goles_directos + ", Total de Lanzamientos=" + this.total_lanzamientos + ",";
    }
}

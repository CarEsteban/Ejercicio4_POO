/**
 * La clase Portero representa a un jugador de tipo portero en un equipo de fútbol.
 * Portero es una subclase de Jugador.
 */
public class Portero extends Jugador {

    /**
     * Número de paradas efectivas realizadas por el portero.
     */
    private int paradas_efectivas;

    /**
     * Número de goles recibidos por el portero.
     */
    private int goles_recibidos;

    /**
     * Efectividad del portero.
     */
    private int efectividad;

    /**
     * Constructor de la clase Portero.
     * 
     * @param nombre           Nombre del portero.
     * @param pais             País de origen del portero.
     * @param faltas           Número de faltas cometidas por el portero.
     * @param goles_directos   Número de goles directos anotados por el portero.
     * @param total_lanzamientos Número total de lanzamientos realizados por el portero.
     * @param paradas_efectivas Número de paradas efectivas realizadas por el portero.
     * @param goles_recibidos  Número de goles recibidos por el portero.
     */
    public Portero(String nombre, String pais, int faltas, int goles_directos, int total_lanzamientos, int paradas_efectivas, int goles_recibidos) {
        super(nombre, pais, faltas, goles_directos, total_lanzamientos);
        this.paradas_efectivas = paradas_efectivas;
        this.goles_recibidos = goles_recibidos;
    }

    /**
     * Obtiene el número de paradas efectivas realizadas por el portero.
     * 
     * @return El número de paradas efectivas realizadas por el portero.
     */
    public int getParadas_efectivas() {
        return paradas_efectivas;
    }

    /**
     * Obtiene el número de goles recibidos por el portero.
     * 
     * @return El número de goles recibidos por el portero.
     */
    public int getGoles_recibidos() {
        return goles_recibidos;
    }

    /**
     * Calcula la efectividad del portero utilizando la fórmula dada.
     * 
     * @param paradas_efectivas Número de paradas efectivas realizadas por el portero.
     * @param goles_recibidos   Número de goles recibidos por el portero.
     * @param goles_directos    Número de goles directos anotados por el portero.
     * @param total_lanzamientos Número total de lanzamientos realizados por el portero.
     */
    public void calcularEfectividad(int paradas_efectivas, int goles_recibidos, int goles_directos, int total_lanzamientos) {
        efectividad = ((paradas_efectivas - goles_recibidos) * 100 / (paradas_efectivas + goles_recibidos))
                + (goles_directos * 100 / total_lanzamientos);
    }

    /**
     * Obtiene la efectividad del portero.
     * 
     * @return La efectividad del portero.
     */
    public int getEfectividad() {
        return efectividad;
    }

    /**
     * Devuelve una representación en cadena del portero.
     * 
     * @return Una cadena que representa al portero con sus atributos.
     */
    @Override
    public String toString() {
        return super.toString() + " tipo de jugador: portero, Paradas efectivas=" + paradas_efectivas
                + ", Goles recibidos=" + goles_recibidos + ", Efectividad=" + efectividad + ".";
    }
}

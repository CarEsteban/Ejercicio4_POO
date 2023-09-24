/**
 * La clase Extremo representa a un jugador de tipo extremo en un equipo de fútbol.
 * Extremo es una subclase de Jugador.
 */
public class Extremo extends Jugador {

    /**
     * Número de pases realizados por el extremo.
     */
    private int pases;

    /**
     * Número de asistencias efectivas realizadas por el extremo.
     */
    private int asistencias_efectivas;

    /**
     * Efectividad del extremo.
     */
    private int efectividad;

    /**
     * Constructor de la clase Extremo.
     * 
     * @param nombre               Nombre del extremo.
     * @param pais                 País de origen del extremo.
     * @param faltas               Número de faltas cometidas por el extremo.
     * @param goles_directos       Número de goles directos anotados por el extremo.
     * @param total_lanzamientos   Número total de lanzamientos realizados por el extremo.
     * @param pases                Número de pases realizados por el extremo.
     * @param asistencias_efectivas Número de asistencias efectivas realizadas por el extremo.
     */
    public Extremo(String nombre, String pais, int faltas, int goles_directos, int total_lanzamientos, int pases, int asistencias_efectivas) {
        super(nombre, pais, faltas, goles_directos, total_lanzamientos);
        this.pases = pases;
        this.asistencias_efectivas = asistencias_efectivas;
    }

    /**
     * Obtiene el número de pases realizados por el extremo.
     * 
     * @return El número de pases realizados por el extremo.
     */
    public int getPases() {
        return pases;
    }

    /**
     * Obtiene el número de asistencias efectivas realizadas por el extremo.
     * 
     * @return El número de asistencias efectivas realizadas por el extremo.
     */
    public int getAsistencias_efectivas() {
        return asistencias_efectivas;
    }

    /**
     * Calcula la efectividad del extremo utilizando la fórmula dada.
     * 
     * @param pases                Número de pases realizados por el extremo.
     * @param asistencias_efectivas Número de asistencias efectivas realizadas por el extremo.
     * @param goles_directos       Número de goles directos anotados por el extremo.
     * @param total_lanzamientos   Número total de lanzamientos realizados por el extremo.
     * @param faltas               Número de faltas cometidas por el extremo.
     */
    public void calcularEfectividad(int pases, int asistencias_efectivas, int goles_directos, int total_lanzamientos, int faltas) {
        efectividad = ((pases + asistencias_efectivas - faltas) * 100 / (pases + asistencias_efectivas + faltas))
                + (goles_directos * 100 / total_lanzamientos);
    }

    /**
     * Obtiene la efectividad del extremo.
     * 
     * @return La efectividad del extremo.
     */
    public int getEfectividad() {
        return efectividad;
    }

    /**
     * Devuelve una representación en cadena del extremo.
     * 
     * @return Una cadena que representa al extremo con sus atributos.
     */
    @Override
    public String toString() {
        return super.toString() + " tipo de jugador: extremo, Pases=" + pases + ", Asistencias Efectivas="
                + asistencias_efectivas + ", Efectividad=" + efectividad + ".";
    }
}

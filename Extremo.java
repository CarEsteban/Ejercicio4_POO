public class Extremo extends Jugador {

    private int pases, asistencias_efectivas, efectividad;


    public Extremo(String nombre, String pais, int faltas, int goles_directos, int total_lanzamientos, int  pases, int asistencias_efectivas) {
        super(nombre, pais, faltas, goles_directos, total_lanzamientos);
        this.pases = pases;
        this.asistencias_efectivas = asistencias_efectivas;
    }


    public int getPases() {
        return pases;
    }


    public int getAsistencias_efectivas() {
        return asistencias_efectivas;
    }

    public void calcularEfectividad(int pases, int asistencias_efectivas, int goles_directos, int total_lanzamientos, int faltas){
        efectividad = ((pases + asistencias_efectivas - faltas)*100/(pases + asistencias_efectivas + faltas)) + (goles_directos*100 / total_lanzamientos);
    }

    public int getEfectividad() {
        return efectividad;
    }


    @Override
    public String toString() {
        return super.toString() + " tipo de jugador: extremo, Pases=" + pases + ", Asistencias Efectivas=" + asistencias_efectivas + ", Efectividad="
                + efectividad + ".";
    }

}

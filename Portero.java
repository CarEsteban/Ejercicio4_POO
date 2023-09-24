public class Portero extends Jugador {
    int paradas_efectivas, goles_recibidos, efectividad;

    public Portero(String nombre, String pais, int faltas, int goles_directos, int total_lanzamientos, int paradas_efectivas, int goles_recibidos) {
        super(nombre, pais, faltas, goles_directos, total_lanzamientos);
        this.paradas_efectivas = paradas_efectivas;
        this.goles_recibidos = goles_recibidos;
    }

    public int getParadas_efectivas() {
        return paradas_efectivas;
    }

    public int getGoles_recibidos() {
        return goles_recibidos;
    }

    
    public void calcularEfectividad(int paradas_efectivas, int goles_recibidos, int goles_directos, int total_lanzamientos){
        efectividad = ((paradas_efectivas-goles_recibidos)*100/(paradas_efectivas + goles_recibidos)) + goles_directos*100 / total_lanzamientos;
    }


    public int getEfectividad() {
        return efectividad;
    }


    @Override
    public String toString() {
        return super.toString() + " tipo de jugador: portero, Paradas efectivas=" + paradas_efectivas + ", Goles recibidos=" + goles_recibidos + ", Efectividad="
                + efectividad + ".";
    }
}

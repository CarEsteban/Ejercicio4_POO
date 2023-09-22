public class Jugador {
    protected String nombre, pais;
    protected int faltas,goles_directos,total_lanzamientos;

    public Jugador(String nombre, String pais, int faltas, int goles_directos, int total_lanzamientos) {
        this.nombre = nombre;
        this.pais = pais;
        this.faltas = faltas;
        this.goles_directos = goles_directos;
        this.total_lanzamientos = total_lanzamientos;
    }

    protected String getNombre() {
        return this.nombre;
    }

    protected String getPais() {
        return this.pais;
    }

    protected int getFaltas() {
        return this.faltas;
    }

    protected int getGoles_directos() {
        return this.goles_directos;
    }

    protected int getTotal_lanzamientos() {
        return this.total_lanzamientos;
    }

    @Override
    public String toString() {
        return "Jugador: Nombre=" + this.nombre + ", País=" + this.pais + ", Faltas=" + this.faltas + ", Goles Directos="
                + this.goles_directos + ", Total de Lanzamientos=" + this.total_lanzamientos + ",";
    }
    

    
    



}

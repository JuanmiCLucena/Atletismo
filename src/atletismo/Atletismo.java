package atletismo;

import java.time.LocalTime;
import java.util.List;

public class Atletismo {
    private int numeroAtleta;
    private String nombre;
    private LocalTime tiempoCarrera;

    public Atletismo(){

    }

    public Atletismo(int numeroAtleta, String nombre, LocalTime tiempoCarrera){
        this.nombre = nombre;
        this.numeroAtleta = numeroAtleta;
        this.tiempoCarrera = tiempoCarrera;
    }

    public static Atletismo ganadorCarrera(List<Atletismo> corredores) {

        Atletismo carreraGanador = new Atletismo();
        LocalTime mejorTiempo = LocalTime.MAX;

        for (int i = 0; i < corredores.size(); i++) {
            if(corredores.get(i).getTiempoCarrera().isBefore(mejorTiempo)) {
                mejorTiempo = corredores.get(i).getTiempoCarrera();
                carreraGanador = corredores.get(i);
            }
        }

        return carreraGanador;
    }

    public int getNumeroAtleta() {
        return numeroAtleta;
    }

    public void setNumeroAtleta(int numeroAtleta) {
        this.numeroAtleta = numeroAtleta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(LocalTime tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }
}

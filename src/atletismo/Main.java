package atletismo;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Atletismo> corredores = new ArrayList<Atletismo>();

        Atletismo ganadorCarrea = new Atletismo();

        corredores.add(new Atletismo(1, "Maxi", LocalTime.of(10, 32, 15)));
        corredores.add(new Atletismo(2, "Javier", LocalTime.of(9, 52, 13)));
        corredores.add(new Atletismo(3, "Amador", LocalTime.of(10, 11, 23)));
        corredores.add(new Atletismo(4, "Antonio", LocalTime.of(10, 28, 9)));
        corredores.add(new Atletismo(5, "Leo", LocalTime.of(10, 12, 54)));

        ganadorCarrea = Atletismo.ganadorCarrera(corredores);

        System.out.println("El corredor con mejor tiempo es: " + ganadorCarrea.getNombre()
                + " número: " + ganadorCarrea.getNumeroAtleta()
                + " y su tiempo es: " + ganadorCarrea.getTiempoCarrera());



    }
}
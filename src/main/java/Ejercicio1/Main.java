package Ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de cada tipo de ciclo ofrecido
        Ciclo[] ciclos = {
                new Bicicleta("Lapierre", "Speed 400", LocalDate.of(2022, 1, 1), 27),
                new Bicicleta("Btwin", "Riverside 900", LocalDate.now(), 10),
                new Giroscopio("Segway", "Nine", LocalDate.now(), 40),
                new Giroscopio("Weebot", "Echo", LocalDate.of(2022, 1, 1), 35),
                new Segway("Immotion", "V8", LocalDate.now(), 40, 0.2),
                new Segway("Segway", "Ninebot One E+", LocalDate.now(), 30, 0.1)
        };
        // Mostrar la tabla de ciclos ofrecidos en alquiler
        System.out.println("Estos son los ciclos que ofrecemos en alquiler:");
        for (Ciclo ciclo : ciclos) {
            System.out.println(ciclo.toString());
        }

    }
}

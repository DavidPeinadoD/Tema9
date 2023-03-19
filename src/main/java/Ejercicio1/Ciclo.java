package Ejercicio1;
import java.time.LocalDate;


abstract class Ciclo {
    protected String marca;
    protected String modelo;
    protected LocalDate fechaCompra;

    public Ciclo(String marca, String modelo, LocalDate fechaCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
    }

    public abstract double getTarifa();

    public String toString() {
        return "- " + marca + " " + modelo + " (" + (LocalDate.now().getYear() - fechaCompra.getYear()) + " años) " + " " + getDetalles() + " " + getTarifa() + "€/hora";
    }

    protected abstract String getDetalles();
}

class Bicicleta extends Ciclo {
    private int numVelocidades;

    public Bicicleta(String marca, String modelo, LocalDate fechaCompra, int numVelocidades) {
        super(marca, modelo, fechaCompra);
        this.numVelocidades = numVelocidades;
    }

    public double getTarifa() {
        return 4.9;
    }

    protected String getDetalles() {
        return numVelocidades + " velocidades";
    }
}

abstract class VehiculoElectrico extends Ciclo {
    protected double autonomia;

    public VehiculoElectrico(String marca, String modelo, LocalDate fechaCompra, double autonomia) {
        super(marca, modelo, fechaCompra);
        this.autonomia = autonomia;
    }

    protected String getDetalles() {
        int horas = (int) Math.floor(autonomia / getVelocidadMedia());
        int minutos = (int) ((autonomia / getVelocidadMedia() - horas) * 60);

        return (int) autonomia + " km de autonomía [" + horas + "h" + minutos + " min]";
    }

    protected abstract double getVelocidadMedia();
}

class Segway extends VehiculoElectrico {
    private double alturaMinima;

    public Segway(String marca, String modelo, LocalDate fechaCompra, double autonomia, double alturaMinima) {
        super(marca, modelo, fechaCompra, autonomia);
        this.alturaMinima = alturaMinima;
    }

    public double getTarifa() {
        return 18.9;
    }

    protected double getVelocidadMedia() {
        return 20.0;
    }

    protected String getDetalles() {
        return super.getDetalles() + ", Altura mínima: " + alturaMinima + "m";
    }
}

class Giroscopio extends VehiculoElectrico {
    public Giroscopio(String marca, String modelo, LocalDate fechaCompra, double autonomia) {
        super(marca, modelo, fechaCompra, autonomia);
    }

    public double getTarifa() {
        return 9.9;
    }

    protected double getVelocidadMedia() {
        return 15.0;
    }
}


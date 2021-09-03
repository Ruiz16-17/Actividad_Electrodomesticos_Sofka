package Modelo;

import java.util.Scanner;

public class Nevera extends Electrodomestico {

    private int capacidad;

    public Nevera() {
    }

    public Nevera(char consumo, String procedencia, int capacidad) {
        super(consumo, procedencia);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double calcularPrecio() {
        double precio = super.calcularPrecio();

        if (getCapacidad() > 120) {

            precio = litrosExtra(precio);

        }

        return precio;
    }

    public void solicitarCapacidad() {

        Scanner read = new Scanner(System.in);
        System.out.println("Digite la capacidad de litros de la nevera");
        setCapacidad(read.nextInt());

    }

    private double litrosExtra(double precio) {

        double litrosMas = 0;
        double aumento = precio * 0.05;

        litrosMas = (getCapacidad() - 120) / 10;
        
        precio += (Math.floor(litrosMas) * aumento);

        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + "Nevera{" +
                "capacidad=" + capacidad +
                '}';
    }
}

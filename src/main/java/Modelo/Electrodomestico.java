package Modelo;

import javax.swing.*;
import java.util.Scanner;

public class Electrodomestico {

    private char consumo;
    private String procedencia;

    public Electrodomestico() {
    }

    public Electrodomestico(char consumo, String procedencia) {
        this.consumo = consumo;
        this.procedencia = procedencia;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public double calcularPrecio() {

        return asignarValorConsumo(getConsumo()) + asignarValorProcedencia(getProcedencia());
    }

    protected double asignarValorConsumo(char opcion) {

        double precio = 0;

        switch (opcion) {
            case 'A':

                precio = 450000;
                break;

            case 'B':

                precio = 350000;
                break;

            case 'C':

                precio = 250000;
                break;
            default:

                precio = 0;
        }

        return precio;
    }

    protected double asignarValorProcedencia(String opcion) {

        double precio = 0;

        switch (opcion) {
            case "Nacional":

                precio = 250000;
                break;

            case "Importado":

                precio = 350000;
                break;

            default:

                precio = 0;
        }

        return precio;
    }

    public void solicitarConsumoProcedencia() {

        Scanner read = new Scanner(System.in);
        int opcion = 0;

        System.out.println("Ingrese el consumo (A, B o C)");
        setConsumo(read.nextLine().charAt(0));

        System.out.println("Ingrese la procedencia " +
                "\n1. Nacional." +
                "\n2. Importado.");

        opcion = read.nextInt();

        setProcedencia((opcion == 1) ? "Nacional" : "Importado");

    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "consumo=" + consumo +
                ", procedencia='" + procedencia + '\'' +
                '}';
    }
}

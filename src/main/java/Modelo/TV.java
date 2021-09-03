package Modelo;

import java.util.Scanner;

public class TV extends Electrodomestico {

    private int tamanio;
    private boolean isTDT;

    public double calcularPrecio() {
        double precio = super.calcularPrecio();

        if (getTamanio() > 40) {

            precio *= 1.3;

            if (getTDT()) {

                precio += 250000;

            }
        } else if (getTDT()) {

            precio += 250000;

        }

        return precio;
    }

    public void solicitarTamanio(){

        Scanner read = new Scanner(System.in);

        System.out.println("Digite el tamaño en pulgadas del televisor");
        setTamanio(read.nextInt());


    }

    public void solicitarTDT(){

        Scanner read = new Scanner(System.in);
        int opcion = 0;

        System.out.println("¿Tiene TDT?" +
                "\n1. Sí." +
                "\n2. No.");
        opcion = read.nextInt();

        if(opcion == 1){
            setTDT(true);
        }else{

            setTDT(false);
        }


    }

    @Override
    public String toString() {
        return  super.toString() + "TV{" +
                "tamanio=" + tamanio +
                ", isTDT=" + isTDT +
                '}';
    }

    public TV() {
    }

    public TV(char consumo, String procedencia, int tamanio, boolean isTDT) {
        super(consumo, procedencia);
        this.tamanio = tamanio;
        this.isTDT = isTDT;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public boolean getTDT() {
        return isTDT;
    }

    public void setTDT(boolean TDT) {
        isTDT = TDT;
    }
}

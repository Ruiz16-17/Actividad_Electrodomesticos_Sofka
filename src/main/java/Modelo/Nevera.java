package Modelo;

public class Nevera  extends Electrodomestico{

    private int capacidad;

    public Nevera() {
    }

    public double calcularPrecio(){
        double precio = super.calcularPrecio();

        if(getCapacidad() > 120){

            precio = litrosExtra(precio);

            }
        return precio;
    }

    private double litrosExtra(double precio){

        double litrosMas = 0;
        double aumento = precio * 0.05;

        litrosMas = (getCapacidad() - 120)/10;
        for (int i = 0; i < litrosMas; i++) {
            precio +=  aumento;

        }

        return precio;
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
}

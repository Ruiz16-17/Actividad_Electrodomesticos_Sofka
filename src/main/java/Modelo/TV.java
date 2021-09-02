package Modelo;

public class TV extends Electrodomestico{

    private int tamanio;
    private boolean isTDT;

    public double calcularPrecio(){
        double precio = calcularPrecio();

        if(getTamanio() > 40){

            precio *= 1.3;

            if (getTDT()){

                precio += 250000;

            }
        }else{

            if (getTDT()){

                precio += 250000;

            }
        }

        return precio;
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

import Modelo.Nevera;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int opcion = 0;
        double precioTotal = 0;

        Scanner read = new Scanner(System.in);

        do {

            System.out.println("¡Bienvenido a la tienda!");
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Añadir Electrodméstico. \n" +
                    "2. Añadir TV.\n" +
                    "3. Añadir Nevera.\n" +
                    "4. Salir");
            opcion = read.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("Co");

            }

        }while (opcion != 4);
    }
}

package Interfaz;

import Modelo.Electrodomestico;
import Modelo.Nevera;
import Modelo.TV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarritoCompras {

    public void ejecutarCarritoCompras(){
        int opcion = 0;
        double precioTotal = 0;
        List<Object> carrito = new ArrayList<>();

        Scanner read = new Scanner(System.in);

        do {

            System.out.println("¡Bienvenido a la tienda!");
            System.out.println("¿Qué desea hacer?" +
                    "\n1. Añadir Electrodméstico." +
                    "\n2. Añadir TV." +
                    "\n3. Añadir Nevera." +
                    "\n4. Mostrar lista de productos." +
                    "\n5. Salir");
            opcion = read.nextInt();

            switch (opcion){

                case 1:

                    Electrodomestico electrodomestico = new Electrodomestico();
                    electrodomestico.solicitarConsumoProcedencia();
                    precioTotal += electrodomestico.calcularPrecio();
                    carrito.add(electrodomestico);

                    break;

                case 2:

                    TV tv = new TV();
                    tv.solicitarConsumoProcedencia();
                    tv.solicitarTamanio();
                    tv.solicitarTDT();
                    precioTotal += tv.calcularPrecio();
                    carrito.add(tv);

                    break;

                case 3:

                    Nevera nevera = new Nevera();
                    nevera.solicitarConsumoProcedencia();
                    nevera.solicitarCapacidad();
                    precioTotal += nevera.calcularPrecio();
                    carrito.add(nevera);

                    break;

                case 4:

                    carrito.stream().forEach(System.out::println);

                    break;

                case 5:

                    System.out.println("¡Hasta luego, esperamos que vuelva pronto!");

                    break;

                default:

                    System.out.println("Dato no válido");
                    break;
            }

            System.out.println("El precio total hasta el momento es: " + precioTotal);
        }while (opcion != 5);
    }
}

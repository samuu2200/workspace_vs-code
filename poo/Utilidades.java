package poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidades {

    private static Scanner scan = new Scanner(System.in);

    // Lee un entero con un mensaje y validación (no nulo, no string, etc.)
    public static int leerEntero(String mensaje) {
        int numero = 0;
        boolean valido = false;

        do {
            System.out.print(mensaje + ": ");
            try {
                numero = scan.nextInt();
                scan.nextLine();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: por favor, ingresa un número válido.");
                scan.nextLine(); // Limpiar Buffer para evitar bucle infinito
            }
        } while (!valido);

        return numero;
    }

    // Lee un string cualquiera
    public static String leerCadena(String mensaje) {
        System.out.println(mensaje + ": ");
        return scan.nextLine();
    }

}

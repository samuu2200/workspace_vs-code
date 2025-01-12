import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Crear un array de 5 números enteros
        int[] numeros = new int[5];
        
        //Solicitar los valores al usuario y asignarlos al array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el valor para la posición: ");
            numeros[i] = scan.nextInt();
        }

        //Imprimir cada valor del array en una línea nueva
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }


        scan.close();
    }

}

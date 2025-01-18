import java.util.Scanner;

public class Utilidades {

    // devuelve el número que ha escrito por consola 
    public static int getNumeroEntero(String texto) {
        // Creamos el objeto Scanner
        Scanner scan = new Scanner(System.in);
        // Mostramos el mensaje por consola 
        System.out.print(texto);
        // Recojemos los datos que ha ingresado el usuario por consola
        return scan.nextInt();
    }

    // Recorremos el array esto nos va a devolver los valores del array
    public static int[] getValoresArr(String texto, int numElementos) {
        // Creamos el objeto Scanner
        Scanner scan = new Scanner(System.in);
        // Mostramos el mensaje del texto
        System.out.println(texto);
        // Recorremos el número de elementos que haya ingresado el usuario
        int[] valoresArr = new int[numElementos];
        for (int i = 0; i < valoresArr.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            // Ingresamos los valores del array
            valoresArr[i] = scan.nextInt();
        }
        return valoresArr;
    }

    // Recorremos el array y sumamos sus valores
    public static int getSumaArr(int[] valores) {
        int suma = 0;
        for (int valor : valores) {
            suma += valor;
        }
        return suma;
    }

}

package ejerciciocasa;

public class MayorMenor {

    public static void main(String[] args) {
        //Solicita al usuario ingresar 10 números, almacénalos en un array y determina cuál es el número más grande y cuál es el más pequeño.
        
        // Ingresamos los valores del arr
        int[] numeros = Utilidades.pedirNumero("Ingresa 10 números");
        
        // Mostramos el contenido del arr
        Utilidades.mostrarArr(numeros);

        // Mostramos el resultado cual es el mayor y menor
        int[] mayorMenor = Utilidades.mayorMenor(numeros);
        System.out.println("El número mayor es: " + mayorMenor[0]);
        System.out.println("El número menor es: " + mayorMenor[1]);
    }
    
}

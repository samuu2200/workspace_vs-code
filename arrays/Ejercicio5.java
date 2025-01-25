public class Ejercicio5 {

    public static void main(String[] args) {
        
        // Escribir un programa que tome un array de 5 elementos y lo invierta
        int numElementos = Utilidades.getNumeroEntero("Introduce el tamaño del array: ");
    
        // Le pasamos el array para que proceda a invertirlo
        int[] valoresInvertido = Utilidades.arrInvertido(new int[numElementos]);
    
        // Mostrar por consola el resultado
        for (int valor : valoresInvertido) {
            System.out.println(valor);
        }
    }

}

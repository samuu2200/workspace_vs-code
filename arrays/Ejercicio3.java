public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        // Pedimos el tamañano del array llamando a la función 
        int numElementos = Utilidades.getNumeroEntero("Introduce el tamaño del array: ");

        // Pedimos al usario que ingrese los valores del array y le devolvemos los valores contenidos
        int[] valoresArr = Utilidades.getValoresArr("Introducelos valores del array: ", numElementos);

        // Recorremos los valores del array y los mostramos por consola
        System.out.println("Contenido del array");
        for (int valores : valoresArr) {
            System.out.print(valores + ", ");
        }
        
    }

}

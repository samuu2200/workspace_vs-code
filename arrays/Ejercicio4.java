public class Ejercicio4 {

    public static void main(String[] args) {

        // Pedimos al usuario la cantidad de números que quiere almacenar
        int numElementos = Utilidades.getNumeroEntero("Introduce el tamaño del array: ");
        
        // Elemento mayor y menor
        int valores[] = Utilidades.getValoresArr("Introduce los valores para cada posición del array: ", numElementos);
        
        // Devolvemos el número mayor
        int[] mayorMenor = Utilidades.getMayorMenor(valores);
        System.out.println("El númmero mayor es: " + mayorMenor[0]);
        System.out.println("El númmero menor es: " + mayorMenor[1]);
    }

}

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        //Creamos un array desordenado
        int [] numeros = {3, 6, 9, 12, 15};

        //Preguntamos al usuario que número quiere buscar
        System.out.print("Introduce el número que quieras buscar: ");
        String entrada = scan.nextLine();
        int numBusqueda = Integer.parseInt(entrada);

        boolean encontrado = true;
        for (int i = 0; i < numeros.length; i++) {
            if (numBusqueda != numeros[i]){
                encontrado = false;
            } else {
                encontrado = true;    
                break;            
            }
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado");
        } else {
            System.out.println("SE HA ENCONTRADO UN RESULTADO");
        }
        
        scan.close();
        
    }

}

package validaremail;

public class ValidarEmail {

    public static void main(String[] args) {

        /*
         * Escribe un programa que solicite al usuario ingresar un correo electrónico y
         * valide si cumple las siguientes reglas:
         * 1. El correo debe contener exactamente una arroba (@).
         * 2. No puede contener espacios en blanco.
         * 3. Después de la arroba (@) debe haber al menos un punto (.).
         * 4. Entre la arroba (@) y el primer punto (.) después de la arroba, debe haber
         * al menos dos caracteres.
         * 5. Después del último punto (.), debe haber entre 2 y 6 caracteres.
         */

        // Guardamos el correo en una variable
        String correo = "samdev2200@@gmail.com";

        // Nos devuelve el correo sin espacios hacia los lados
        correo = correo.trim();

        // 1. El correo debe contener al menos una '@'
        int posicionArroba = correo.indexOf('@');
        int countArroba = 0;
        // Recorremos con un bucle y contamos la cantidad de '@'
        if (posicionArroba != -1) {
            countArroba++;
        } else if (countArroba > 1) {
            System.out.println("El correo contiene más de una '@'");
        }
 
    }

}

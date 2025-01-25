package poo.ejercicio2;

public class PruebaCuenta {

    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria("ABC123", 1000);
        CuentaBancaria cuenta2 = new CuentaBancaria("987XYZ", 500);

        // Mostramos el estado inicial de las cuentas
        System.out.println(cuenta1);
        System.out.println(cuenta2);

        // Operaciones
        cuenta1.depositar(500);
        cuenta2.retirar(100);
        
        // Mostrar estado después de cada operación
        System.out.println("Estado de las cuentas después de cada operación:");
        System.out.println(cuenta1);
        System.out.println(cuenta2);

        // Intentar retirar más de los que hay en la cuenta1
        cuenta1.retirar(2000);
        System.out.println("Estado de cuenta despues de poner operaciones invaliadas");
        System.out.println(cuenta1);

        // Intentar depositar un número negativo en la cuenta 2
        cuenta2.depositar(-50);
        System.out.println("Estado de cuenta despues de depositar números negativos");
        System.out.println(cuenta2);
    }

}

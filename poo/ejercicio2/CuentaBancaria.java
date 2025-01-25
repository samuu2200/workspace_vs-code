package poo.ejercicio2;

public class CuentaBancaria {
    // variables de instancia o propiedades
    private String numeroCuenta;
    private double saldo;

    // Constructor
    public CuentaBancaria (String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        if (saldo < 0) {
            saldoInicial = 0;
        }
        this.saldo = saldoInicial;
    }
    
    // Getters & Setters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    // Método depositar
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }

    // Método retirar 
    public void retirar(double monto) {
        if (monto <= saldo && monto > 0) {
            this.saldo -= monto;
        }
    }

    @Override
    public String toString() {
        return "====== Cuenta Bancaria ======\n"
            + "Nº de cuenta: " + numeroCuenta + "\n"
            + "Saldo: " + saldo + "\n"
            + "==============================";
    }

}

package poo.cine;

import java.util.Arrays;

public class Sala {
    // Atributos
    private int numero;
    private String tituloPelicula;
    private Espectador[][] butacas;

    // Constructor
    public Sala(int numero, String tituloPelicula, int filas, int columnas) {
        this.numero = numero;
        this.tituloPelicula = tituloPelicula;
        this.butacas = new Espectador[filas][columnas];
    }

    // Getter & Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public Espectador[][] getButacas() {
        return butacas;
    }

    public void setButacas(Espectador[][] butacas) {
        this.butacas = butacas;
    }
    
    @Override
    public String toString() {
        // Podríamos imprimir una descripción básica de la sala
        return "Sala " + numero + " - Película: " + tituloPelicula
               + " (" + butacas.length + " filas, " + butacas[0].length + " columnas)";
    }
}

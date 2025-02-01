package poo.cine;

import poo.Utilidades;

public class Cine {
    // Atributos
    private String nombre;
    private Sala[] salas;

    // Constructor
    public Cine(String nombre, Sala[] salas) {
        this.nombre = nombre;
        this.salas = salas;
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sala[] getSalas() {
        return salas;
    }

    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }
    
    @Override
    public String toString() {
        return "Cine: " + nombre + " con " + salas.length + " salas.";
    }
}

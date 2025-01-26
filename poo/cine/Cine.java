package poo.cine;

public class Cine {
    
    private String nombre;
    private int[] salas;

    // Constructor
    public Cine(String nombre, int[] salas) {
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
    public int[] getSalas() {
        return salas;
    }
    public void setSalas(int[] salas) {
        this.salas = salas;
    }

    
}

package poo.cine;

public class Cine {
    // Variables de instancia
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

    
}

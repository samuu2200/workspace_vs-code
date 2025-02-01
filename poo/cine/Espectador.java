package poo.cine;

public class Espectador {   
    // Variables de instancia
    private String nombre;
    private String dni;

    // Constructor espectador
    public Espectador(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Espectadro{" + "nombre='" + nombre + "', dni='" + dni + "'}";
    }
}

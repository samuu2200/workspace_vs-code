package poo.cine;

public class Espectador {
    // Variables de instancia
    private String nombre;
    private String dni;

    // Constructor
    public Espectador(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Getter & Setter
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

}

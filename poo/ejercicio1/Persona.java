package poo.ejercicio1; 
public class Persona {
    /**
     * El nombre de la persona
     */
    private String nombre;
    /**
     * La edad de la persona
     */
    private int edad;


    /**
     * Crea una nueva persona con el nombre y la edad especificados.
     * 
     * @param nombre
     *      El nombre de la persona.
     * @param edad
     *      La edad de la persona.
     *      Se asume que la edad es mayor o igual que 0
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Muestra un saludo por consola con el nombre y la edad de la persona.
     */
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad);
    }
    
}

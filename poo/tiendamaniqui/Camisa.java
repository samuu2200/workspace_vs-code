package poo.tiendamaniqui;

public class Camisa {
    private String color;
    private double precio;
    private String talla;
    private Boton[] btns;

    // Constructor
    public Camisa(String color, double precio, String talla, Boton[] btns) {
        this.color = color;
        this.precio = precio;
        this.talla = talla;
        this.btns = btns;
    }

    // Color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // Precio
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Talla
    public String getTalla() {
        return talla;
    }
    public void setTalla(String talla) {
        this.talla = talla;
    }

    // Botón
    public Boton[] getBtns() {
        return btns;
    }
    public void setBtns(Boton[] btn) {
        this.btns = btn;
    }

    // Metodo mostrar Botones
    public void mostrarBotones(Boton[] btns) {
        int contador = 0;
        for (Boton botones : btns) {
            contador++;
            System.out.println("Botón " + contador + ":");
            System.out.println("\tColor botón: " + botones.getColor());
            System.out.println("\tForma botón: " + botones.getForma());
            System.out.println("\tTamaño botón: " +botones.getTamanio());
        }
    }
}

package poo.tiendamaniqui;

public class Vestido {
    private String color;
    private double precio;
    private String talla;

    // Constructor
    public Vestido(String color, double precio, String talla) {
        this.color = color;
        this.precio = precio;
        this.talla = talla;
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
    
}

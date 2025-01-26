package poo.tiendamaniqui;

public class Pantalon {
    private String color; 
    private double precio;
    private String talla;
    private Boton btn;

    public Pantalon(String color, double precio, String talla, Boton btn) {
        this.color = color;
        this.precio = precio;
        this.talla = talla;
        this.btn = btn;
    }
    
    // Getter & Setter
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
    public Boton btn() {
        return btn;
    }
    public void btn(Boton btn) {
        this.btn = btn;
    }
}

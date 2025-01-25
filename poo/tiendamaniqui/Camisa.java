package poo.tiendamaniqui;

public class Camisa {
    private String color;
    private double precio;
    private String talla;
    private Boton[] btn;

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
    public Boton[] getBtn() {
        return btn;
    }
    public void setBtn(Boton[] btn) {
        this.btn = btn;
    }

    
}

package poo.tiendamaniqui;

public class Boton {
    // Variables de instancia o propiedades
    private String color;
    private String tamanio;
    private String forma;

    // Constructor
    public Boton(String color, String tamanio, String forma) {
        this.color = color;
        this.tamanio = tamanio;
        this.forma = forma;
    }

    // Getter & Setter
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }

}

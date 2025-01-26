package poo.tiendamaniqui;

public class Maniqui {

    private int id;
    private Pantalon pantalon;
    private Camisa camisa;
    private Vestido vestido;

    // Constructores
    public Maniqui (int id) {
        this.id = id;
    }
    public Maniqui(int id, Pantalon pantalon, Camisa camisa) {
        this.id = id;
        this.pantalon = pantalon;
        this.camisa = camisa;
    }
    public Maniqui(int id, Vestido vestido) {
        this.id = id;
        this.vestido = vestido;
    }

    // id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    // Pantalón
    public Pantalon getPantalon() {
        return pantalon;
    }
    public void setPantalon(Pantalon pantalon) {
        this.pantalon = pantalon;
    }
    // Camisa
    public Camisa getCamisa() {
        return camisa;
    }
    public void setCamisa(Camisa camisa) {
        this.camisa = camisa;
    }
    // Vestido
    public Vestido getVestido() {
        return vestido;
    }
    public void setVestido(Vestido vestido) {
        this.vestido = vestido;
    }
    
    @Override
    public String toString() {
        return "\n========= Maniquí ========\n"
                + "\tVACIO.";
    }

    public String toCompleto() {
        return "\n====== Maniqui Completo ======" + "\n"
            +  "Camisa: " + "\n"
                + "\tColor: " + camisa.getColor() + "\n"
                + "\tTalla: " + camisa.getTalla() + "\n"
                + "\tPrecio: " + camisa.getPrecio() + "\n"
            +  "Pantalon: " + "\n"
                + "\tColor: " + pantalon.getColor() + "\n"
                + "\tTalla: " + pantalon.getTalla() + "\n"
                + "\tPrecio: " + pantalon.getPrecio() + "\n"
                + "\tColor botón: " + pantalon.btn().getColor() + "\n"
                + "\tForma botón: " + pantalon.btn().getForma() + "\n"
                + "\tTamaño botón: " + pantalon.btn().getTamanio();

    }
    
    public String toVestido() {
        return "\n====== Maniqui vestido ======" + "\n"
            +  "Vestido: " + "\n"
                + "\tColor: " + vestido.getColor() + "\n"
                + "\tTalla: " + vestido.getTalla() + "\n"
                + "\tPrecio: " + vestido.getPrecio() + "\n";
    }
}

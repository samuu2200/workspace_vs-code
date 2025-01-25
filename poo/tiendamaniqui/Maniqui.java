package poo.tiendamaniqui;

public class Maniqui {

    private int id;
    private Pantalon pantalon;
    private Camisa camisa;
    private Vestido vestido;

    // Constructores
    public Maniqui () {

    }
    public Maniqui(Pantalon pantalon, Camisa camisa) {
        this.pantalon = pantalon;
        this.camisa = camisa;
    }
    public Maniqui(Vestido vestido) {
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
}

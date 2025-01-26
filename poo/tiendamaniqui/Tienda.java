package poo.tiendamaniqui;

public class Tienda {

    // Variable de instacia
    private String nombre;
    private Maniqui[] maniquies;


    // Constructor
    public Tienda(String nombre) {
        this.nombre = nombre;
    }

    // Getters & setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Maniqui[] getManiqui() {
        return maniquies;
    }
    public void setManiqui(Maniqui[] maniquies) {
        this.maniquies = maniquies;
    }

    public static void main(String[] args) {
        Tienda tienda = new Tienda("the best Shop");

        tienda.abrirTienda();
        tienda.mostrarEscaparate();
        tienda.cerrarTienda();

    }

    // Método abrirTienda
    public void abrirTienda() {
        // Objeto botón para el pantalón
        Boton btn = new Boton("Plateado", "Pequeño", "redondo");
        Boton btn1 = new Boton("Negro", "Pequeño", "redondo");
        Boton btn2 = new Boton("Blanco", "Pequeño", "redondo");
        Boton btn3 = new Boton("Gris", "Pequeño", "redondo");

        // Objeto botón para la camisa
        Boton[] btns = { btn1, btn2, btn3 };

        // Objeto Pantalón
        Pantalon pantalon = new Pantalon("Azul", 15.50, "M", btn);

        // Objeto Camisa
        Camisa camisa = new Camisa("Azul marino", 39.99, "M", btns);

        // Objeto Vestido
        Vestido vestido = new Vestido("Blanco", 60.99, "S");

        // Creamos los objetos maniqui
        Maniqui maniqui1 = new Maniqui(1234, pantalon, camisa);
        Maniqui maniqui2 = new Maniqui(9876, vestido);
        Maniqui maniqui3 = new Maniqui(5463);

        maniquies = new Maniqui[3];
        maniquies[0] = maniqui1;
        maniquies[1] = maniqui2;
        maniquies[2] = maniqui3;

        System.out.println("La tienda " + nombre + " está abierta");
    }

    public void mostrarEscaparate() {
        // Mostrar la información de cada maniqui y el precio total
        System.out.println("Mostrando escaparate de la tienda " + nombre);
        
        for (Maniqui maniqui : maniquies) {
            if (maniqui.getCamisa() != null) {
                System.out.println("\n- Camisa: " + maniqui.getCamisa().getColor() +
                                    " (Precio: " + maniqui.getCamisa().getPrecio() + ")");
            }
            if (maniqui.getPantalon() != null) {
                System.out.println("\n- Pantalón: " + maniqui.getPantalon().getColor() +
                                    " (Precio: " + maniqui.getPantalon().getPrecio() + ")");
            }
            if (maniqui.getVestido() != null) {
                System.out.println("\n- Vestido: " + maniqui.getVestido().getColor() +
                                    " (Precio: " + maniqui.getVestido().getPrecio() + ")");
            }

            double precioTotal = 0;
            if (maniqui.getCamisa() != null) {
                precioTotal += maniqui.getCamisa().getPrecio();
            }
            if (maniqui.getPantalon() != null) {
                precioTotal += maniqui.getPantalon().getPrecio();
            }
            if (maniqui.getVestido() != null) {
                precioTotal += maniqui.getVestido().getPrecio();
            }
            System.out.println("  *** Precio total de la ropa: " + precioTotal);
        }
    }

    public void cerrarTienda() {
        System.out.println("La tienda " + nombre + " va a cerrar muy pronto, desvistiendo maniquies");
        for (Maniqui maniqui : maniquies) {
            maniqui.setCamisa(null);
            maniqui.setPantalon(null);
            maniqui.setVestido(null);
        }
        
        System.out.println("Maniquíes desvetidos. ¡Tienda cerrada!");
         
    }


}

package poo.cine;

import poo.Utilidades;

public class PruebaCine {

    public static void main(String[] args) {
        PruebaCine main = new PruebaCine();
        main.ejecutar();
    }

    public void ejecutar() {
        // 1) Crear cine con 3 salas
        Cine cine = crearCineEjemplo();

        // 2) Crear 3 espectadores
        Espectador[] espectadores = crearEspectadoresEjemplo();

        // 3) Para cada espectador, preguntar y reservar
        for (Espectador espectador : espectadores) {
            System.out.println("\n=============================");
            System.out.println("Espectador: " + espectador.getNombre()
                            + " (DNI: " + espectador.getDni() + ")");
            System.out.println("===============================");

            //3.1) Mostrar cartelera y preguntar sala
            mostrarCartelera(cine);
            int numSalaSeleccionada = seleccionarSala(cine);
            Sala salaElegida = cine.getSalas()[numSalaSeleccionada - 1];

            // 3.2) Pedir cuántas entradas
            int numEntradas = Utilidades.leerEntero("¿Cuántas entradas quieres?");

            // 3.3) Mostrar butacas y reservar
            for (int i = 0; i < numEntradas; i++) {
                System.out.println("\n=== Reserva nº " + (i + 1) + " de " + numEntradas + " ===");
                mostrarButacas(salaElegida);
                reservarButaca(salaElegida, espectador);
            }
        }
        // 4) Al final de todo, mostrar resumen por cada sala
        mostrarResumenCine(cine);
    }

    // --- METODOS DE CREACIÓN DE DATOS ---
    
    private Cine crearCineEjemplo() {
        Sala s1 = new Sala(1, "Interestelar", 3, 3);
        Sala s2 = new Sala(2, "Oppenheimer", 2, 2);
        Sala s3 = new Sala(3, "Tenet", 4, 4);

        // Meterlas en un array
        Sala[] salas = {s1, s2, s3};
        
        // Crear cine
        return new Cine("Pirineos", salas);
    }

    private Espectador[] crearEspectadoresEjemplo() {
        Espectador e1 = new Espectador("Samuel", "12345678A");
        Espectador e2 = new Espectador("Monse", "23456789B");
        Espectador e3 = new Espectador("Agustin", "34567890C");

        return new Espectador[]{e1, e2, e3};
    }

    // --- METODOS DE INTEGRACIÓN ---

    /**
     * Muestra las salas con su título de película
     */
    private void mostrarCartelera(Cine cine) {
        System.out.println("\nCartelera del cine " + cine.getNombre() + ":");
        for (Sala sala : cine.getSalas()) {
            System.out.println(" Sala " + sala.getNumero()
                            + " -> " + sala.getTituloPelicula());
        }
    }

    /**
     * Pide al usuario que seleccione la sala por número (1,2,3).
     * Valida que el número esté en rango
     */
    private int seleccionarSala(Cine cine) {
        int numeroSalas = cine.getSalas().length;
        int salaElegida;
        do {
            salaElegida = Utilidades.leerEntero("Elige el número de sala (1-" + numeroSalas + ")");
            if (salaElegida < 1 || salaElegida > numeroSalas) {
                System.out.println("Opción inválida. Intenta de nuevo");
            }
        } while (salaElegida < 1 || salaElegida > numeroSalas);
        return salaElegida;
    }

    /**
     * Muestra las butacas de una sala, marcando 'X' si está ocupada o 'O' si está libre.
     * Añadimos también la indicación de filas y columnas para que el usuario se guíe.
     */
    private void mostrarButacas(Sala sala) {
        Espectador[][] butacas = sala.getButacas();
        System.out.println("\nMapa de butacas - Sala " + sala.getNumero()
                        + " (" + sala.getTituloPelicula() + ")");
        
        // Encabezado de columnas
        System.out.println("    ");
        for (int col = 0; col < butacas[0].length; col++) {
            System.out.print("Col" + (col + 1) + "  ");
        }
        System.out.println();

        // Filas
        for (int fila = 0; fila < butacas.length; fila++) {
            System.out.print("Fila" + (fila + 1) + " ");
            for (int col = 0; col < butacas[fila].length; col++) {
                if (butacas[fila][col] == null) {
                    System.out.print(" O    "); // Libre
                } else {
                    System.out.print(" X    "); // Ocupado
                }
            }
            System.out.println();
        }
    }

    /**
     * Pide al usuario fila y columna, valida que estén libres y asigna el espectador.
     */
    private void reservarButaca(Sala sala, Espectador espectador) {
        Espectador[][] butacas = sala.getButacas();
        int filas = butacas.length;
        int cols = butacas[0].length;

        boolean reservado = false;
        while (!reservado) {
            // Pedir fila y columna
            int fila = Utilidades.leerEntero("Introduce la fila (1-" + filas + ")");
            int col = Utilidades.leerEntero("Introduce la fila (1-" + cols + ")");

            // Validar rangos
            if (fila < 1 || fila > filas || col < 1 || col > cols) {
                System.out.println("Fila/columna fuera de rango. Intenta de nuevo");
                continue;
            }

            // Comprobar si ya está ocupada
            if (butacas[fila-1][col-1] != null) {
                System.out.println("La butaca ya está ocupada. Elige otra.");
            } else {
                // Ocupamos la butaca
                butacas[fila-1][col-1] = espectador;
                System.out.println("Reserva confirmada para "
                                + fila + ", col " + col);

                reservado = true;
            }
        }
    }

    /**
     * Al final, mostramos cuántas butacas ocupadas hay en cada sala y quién las ocupa.
     */
    private void mostrarResumenCine(Cine cine) {
        System.out.println("\n===== RESUMEN FINAL DE SALAS =====");
        for (Sala sala : cine.getSalas()) {
            System.out.println(">> Sala " + sala.getNumero()
                            + " - " + sala.getTituloPelicula());
            mostrarResumenSala(sala);
        }
    }
    
    /**
     * Muestra las butacas ocupadas en una sala, junto con el espectador que las ocupa.
     */
    private void mostrarResumenSala(Sala sala) {
        Espectador[][] butacas = sala.getButacas();
        int filas = butacas.length;
        int cols = butacas[0].length;

        int contadorOcupadas = 0;

        // Recorremos para ver cuáles están ocupadas
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < cols; c++) {
                if (butacas[f][c] != null) {
                    contadorOcupadas++;
                    System.out.println("    - Fila " + (f+1)
                                    + ", Col " + (c+1)
                                    + " -> " + butacas[f][c].getNombre());
                }
            }
        }

        System.out.println("    Total butacas ocupadas: " + contadorOcupadas
                        + " / " + (filas*cols));
        System.out.println("-----------------------------------------------");
    }
}

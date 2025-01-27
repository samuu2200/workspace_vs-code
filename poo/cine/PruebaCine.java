package poo.cine;

public class PruebaCine {

    public static void main(String[] args) {

        // Creamos un array bidimencionla de butacas
        int[][] butacas = new int[3][3];

        // Objeto Sala
        Sala sala1 = new Sala(1, "La carrera del caballo paralitico", butacas);
        Sala sala2 = new Sala(2, "Spider-man", butacas);
        Sala sala3 = new Sala(3, "Oppenheimer", butacas);
        Sala[] salas = {sala1, sala2, sala3};
        
        // Objeto espectadores
        Espectador espectador1 = new Espectador("Darío", "0123A");
        Espectador espectador2 = new Espectador("")
        
        // Obejto cine 
        Cine cine = new Cine("Pirineos", salas);
    }

}

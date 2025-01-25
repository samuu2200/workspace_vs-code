package ejerciciocasa;

import java.util.Scanner;

public class Utilidades {

    public static int[] pedirNumero(String texto) {
        System.out.println(texto);
        Scanner scan = new Scanner(System.in);
        int[] valores = new int[10];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = scan.nextInt();
        }
        return valores;
    }
    
    /* 2, 3, 19, 1, 5, 38, 6 */

    public static int[] mayorMenor(int[] valoresArr) {
        int mayor = valoresArr[0];
        int menor = valoresArr[0];

        for (int i : valoresArr) {
            if (i > mayor) {package ejerciciocasa;

                import java.util.Scanner;
                
                public class Utilidades {
                
                    public static int[] pedirNumero(String texto) {
                        System.out.println(texto);
                        Scanner scan = new Scanner(System.in);
                        int[] valores = new int[10];
                
                        for (int i = 0; i < valores.length; i++) {
                            valores[i] = scan.nextInt();
                        }
                        return valores;
                    }
                    
                    /* 2, 3, 19, 1, 5, 38, 6 */
                
                    public static int[] mayorMenor(int[] valoresArr) {
                        int mayor = valoresArr[0];
                        int menor = valoresArr[0];
                
                        for (int i : valoresArr) {
                            if (i > mayor) {
                                mayor = i;
                            }
                            if (i < menor) {
                                menor = i;
                            }
                        }
                        return new int[]{mayor, menor};
                    }
                    
                    public static void mostrarArr(int[] valores){
                        for (int valor : valores) {
                            System.out.println(valor + " ");
                        }
                    }
                }
                
                mayor = i;
            }
            if (i < menor) {
                menor = i;
            }
        }
        return new int[]{mayor, menor};
    }
    
    public static void mostrarArr(int[] valores){
        for (int valor : valores) {
            System.out.println(valor + " ");
        }
    }
}

package practica10;

import java.util.Scanner;

/**
 *              PRACTICA 10 | EJERCICIO 4 | BUCLES (III).
 * Crea un programa que construya el siguiente cuadro:
 * Donde:
 *      • La primera fila contendrá los valores del 1 al 10
 *      • La primera columna contendrá los valores del 1 al 10
 *      • El resto de las celdas tendrán el resultado de multiplicar el número de la fila a la que pertenece por el número de la columna.
 * @author M0ltr3x
 */
public class ejercicio4 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n");
        int numero = 10;
        for (int fila = 1; fila <= numero; fila++) {
            for (int columnas = 1; columnas <= numero; columnas++) {
                System.out.printf("%-4s", (fila * columnas));
            }
            System.out.println();

        }
        System.out.println("\n");
    }
}

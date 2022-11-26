package gitHub7;

import java.util.Scanner;

/**
 *
 *                  EJERCICIO 5 | TEMA_07 | BUCLES (I)
 * Crea un programa (usando bucles) que calcule el número de dígitos que tiene un número
 * introducido desde el teclado. El número puede ser positivo o negativo. (Versión del Ejercicio 4 de la Práctica 05)
 * 
 * @author m0ltr3x
 */
public class ejercicio5 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        int numero = keyboard.nextInt();
        int i;
        for (i = 0; numero > 0; i++) {
            numero = numero / 10;
        }
        System.out.println("El número tiene " + i + " cifras.");
    }
}

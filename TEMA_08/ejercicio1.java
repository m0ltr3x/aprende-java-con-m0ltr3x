package gitHub8;

import java.util.Scanner;

/**
 *
 *                      EJERCICIO 1 | TEMA_07 | BUCLES (II)
 * Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El número n se debe introducir por teclado
 * 
 * @author m0ltr3x
 */
public class ejercicio1 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int cifras;
        do {
            System.out.print("Introduce un numero: ");
            cifras = keyboard.nextInt();
        } while (cifras <= 2);
        int numeroUno = 0;
        int numeroDos = 1;
        int fib = 0;
        System.out.print("Las primeras " + cifras + " de la serie de Fibonacci son: " + numeroUno + ", " + numeroDos + ",");
        for (int i = 0; i < (cifras - 2); i++) {
            fib = numeroUno + numeroDos;
            System.out.print(" " + fib + ",");
            numeroUno = numeroDos;
            numeroDos = fib;
        }
    }
}

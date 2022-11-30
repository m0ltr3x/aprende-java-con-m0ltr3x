package practica10;

import java.util.Scanner;

/**
 *          PRACTICA 10 | EJERCICIO 1 | BUCLES (III)
 * Escribe un programa que pida un número por pantalla y devuelva la suma de sus dígitos.
 * 
 * @author M0ltr3x
 */
public class ejercicio1 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int num;

        int result = 0;

        System.out.print("Por favor, Introduce un número para sumar los dígitos: ");
        num = keyboard.nextInt();

        while (num > 0) {
            result += num % 10;
            num = num / 10;
        }

        System.out.println("La suma de ambos digítos es: " + result);

    }

}

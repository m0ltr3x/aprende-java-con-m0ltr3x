package gitHub8;

import java.util.Scanner;

/**
 *
 *                      EJERCICIO 5 | TEMA_07 | BUCLES (II)
 * Escribe un programa que calcule el factorial de un número entero leído por teclado.
 * 
 * @author m0ltr3x
 */
public class ejercicio5 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int fact = 1;
        int numero;
        int i; //nombramos los diferentes int
        System.out.print("por favor, introduce un numero: ");
        numero = keyboard.nextInt();
        for (i = 1; i <= numero; i++) { //i++ va a ir multiplicando hasta el numero que hemos introducido por ejemplo: 7 se multiplicara hasta 7 veces
            fact *= i; //el factorial se va a ir multiplicando por el i y va a ir sumando 1 hasta el numero que hemos introducido
        }
        System.out.print(numero + "! = " + fact);
    }
}

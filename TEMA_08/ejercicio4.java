package gitHub8;

import java.util.Scanner;

/**
 *                      EJERCICIO 4 | TEMA_07 | BUCLES (II)
 * Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
 * 
 * @author m0ltr3x
 */
public class ejercicio4 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;
        int dividido = 10;
        System.out.print("Introduce un número: ");
        numero = keyboard.nextInt();
        System.out.print("El numero " + numero + " al reves es: ");
        while (numero > 0) {
            int delReves = numero % dividido;
            System.out.print(delReves);
            numero = (numero - delReves * (dividido / 10)) / 10;
        }
    }
}

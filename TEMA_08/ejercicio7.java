package gitHub8;

import java.util.Scanner;

/**
 *
 *                      EJERCICIO 7 | TEMA_07 | BUCLES (II)
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la altura. El palo horizontal de la L tendrá 
 * una longitud de la mitad (división entera entre 2) de la altura más uno.
 * 
 * @author m0ltr3x
 */
public class ejercicio7 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int letra;
        int i;
        System.out.print("Introduce la altura de la letra L: ");
        letra = keyboard.nextInt();
        for (i = 0; i < letra - 1; i++) {
            System.out.println("*");
        }
        for (i = 0; i < ((letra / 2) + 1); i++) {
            System.out.print("* ");
        }
    }
}

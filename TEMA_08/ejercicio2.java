package gitHub8;

import java.util.Scanner;

/**
 *                      EJERCICIO 2 | TEMA_07 | BUCLES (II)
 * 
 * Realiza un programa que pinte una pirámide rellena por pantalla. La altura y el carácter de relleno se deben pedir por teclado. 
 * 
 * @author m0ltr3x
 */
public class ejercicio2 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Introduce la altura: ");
        int altura = keyboard.nextInt();
        System.out.print("Introduce el caracter: ");
        char caracter = (keyboard.next()).charAt(0);
        for (int filas = 0; filas < altura; ++filas) {
            for (int col = 0; col < altura - filas - 1; ++col) {
                System.out.print(" ");
            }
            for (int columnas = 0; columnas < 2 * filas + 1; ++columnas) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}

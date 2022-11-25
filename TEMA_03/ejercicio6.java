package gitHub3;

import java.util.Scanner;

/**
 *                      EJERCICIO 6 | TEMA_03 | LECTURA DE DATOS DESDE TECLADO 
 * Adapta el ejercicio 6 de la práctica 2 para solicitar el valor de las variables de tipo char y el
 * valor de la variable de tipo String. Muéstralas por pantalla todas juntas en la misma línea y con una sola sentencia de Java (con un solo println)
 *
 * @author M0ltr3X
 */
public class ejercicio6 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // pide el string
        System.out.print("Introduce tu frase: ");
        String frase = keyboard.nextLine();
        //pide el char
        System.out.print("Ahora introduce el char: ");
        char dataChar = (keyboard.next()).charAt(0);

        //salida de la frase de string mas el char
        System.out.println("tu nombre es: " + frase + " " + dataChar + " ");
    }
}

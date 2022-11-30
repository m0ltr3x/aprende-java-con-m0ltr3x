package practica10;

import java.util.Scanner;

/**
 *
 *          PRACTICA 10 | EJERCICIO 3 | BUCLES (III)
 * Escribe un programa que imprima los caracteres de una variable String de la siguiente forma:
 *      • Un carácter por línea
 *      • Que las líneas formen una diagonal
 * Por ejemplo, si el String contiene la palabra Hola, la salida debería mostrar:
 * H
 *   o
 *      l
 *         a
 * 
 * @author M0ltr3x
 */
public class ejercicio3 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Por favor introduce tu palabra: ");
        String palabra = keyboard.next();
        String espacio= " ";
    for (int i = 0; i < palabra.length(); i++) {
        System.out.println(espacio +palabra.charAt(i));
        espacio += "  ";
    }
    }
}
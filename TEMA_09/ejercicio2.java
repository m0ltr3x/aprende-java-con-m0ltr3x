package practica10;

import java.util.Scanner;

/**
 *              PRACTICA 10 | EJERCICIO 2 | BUCLES (III)
 * Escribe un programa que:
 *      • Solicite que se introduzca una palabra o frase por teclado.
 *      • A continuación pida un determinado carácter.
 *      • Finalmente deberá contar cuántas veces aparece ese carácter dentro del texto introducido.
 * Para hacerlo deberás usar bucles y los métodos length y charAt de la clase String.
 * 
 * @author M0ltr3x
 */
public class ejercicio2 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        keyboard.useDelimiter("\n"); //ESTO ES IMPORTANTE SI QUIERES QUE TU PROGRAMA PUEDA DETECTAR FRASES, SI NO LO PONES DE LO CONTRARIO SOLO 
                                     //DETECTARA UNA PALABRA.
        int contamos = 0;

        System.out.print("Por favor, introduce tu frase: ");
        String palabra = keyboard.next();

        System.out.println("¿que caracter quieres contar? ");
        String caracter = keyboard.next();
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == caracter.charAt(0)) {
                contamos++;
            }
        }

        if (contamos != 0) {
            System.out.println("El caracter " + caracter.charAt(0) + " aparece " + contamos + " veces");
        } else {
            System.out.println("Este caracter no aparece en la frase que has introducido");

        }
    }
}

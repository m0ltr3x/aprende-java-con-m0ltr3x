package gitHub3;

import java.util.Scanner;

/**
 *
 *                      EJERCICIO 7 | TEMA_03 | LECTURA DE DATOS DESDE TECLADO 
 * Adapta el ejercicio 7 de la práctica 2 para que pida por pantalla 5 variables de tipo char. A
 * continuación, crea otra variable como cadena de caracteres y asígnale como valor la concatenación de las anteriores 5 variables. Por último, muestra la
 * cadena de caracteres por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 *
 * @author M0ltr3X
 */
public class ejercicio7 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // introducimos todas las variables segun nos preguntan
        System.out.print("Introduce la primera variable: ");
        double v1 = keyboard.nextDouble();
        System.out.print("Introduce la segunda variable: ");
        double v2 = keyboard.nextDouble();
        System.out.print("Introduce la tercera variable: ");
        double v3 = keyboard.nextDouble();
        System.out.print("Introduce la cuarta variable: ");
        double v4 = keyboard.nextDouble();
        System.out.print("Introduce la quinta variable: ");
        double v5 = keyboard.nextDouble();

        //Tenemos que sumar todas y cada una de las variables y hemos puesto double por si queremos poner decimales
        System.out.println("variable 1: " + v1 + "\nVariable 2: " + v2 + "\nVariable 3: " + v3 + "\nVariable 4: " + v4 + "\nVariable 5: " + v5);
    }

}

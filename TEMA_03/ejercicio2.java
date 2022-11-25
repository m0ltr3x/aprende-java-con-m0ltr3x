package gitHub3;

import java.util.Scanner;

/**
 *                      EJERCICIO 2 | TEMA_03 | LECTURA DE DATOS DESDE TECLADO
 * Adapta el ejercicio 2 de la práctica 2 para que en lugar de asignar un nombre fijo a la variable
 * nombre, lo solicite por pantalla asígnale tu nombre completo. Muestra el valor leído por pantalla
 * 
 * @author M0ltr3X
 */
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = keyboard.nextLine();
        System.out.println("tu nombre es: " + nombre);

    }
}

package gitHub3;

import java.util.Scanner;

/**
 *
 *                      EJERCICIO 3 | TEMA_03 | LECTURA DE DATOS DESDE TECLADO
 * Adapta el ejercicio 3 de la práctica 2 para asignar a las variables nombre, direccion y telefono los
 * valores que se introduzcan desde la consola. Muestra los valores de esas variables por pantalla.
 *
 * @author M0ltr3X
 */
public class ejercicio3 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = keyboard.nextLine();
        System.out.print("Introduce tu direccion: ");
        String direccion = keyboard.nextLine();
        System.out.print("Introduce tu Telefono: ");
        int telefono = keyboard.nextInt();
        System.out.println("tu nombre es: " + nombre);
        System.out.println("tu direccion es: " + direccion);
        System.out.println("tu telefono es: " + telefono);
    }
}

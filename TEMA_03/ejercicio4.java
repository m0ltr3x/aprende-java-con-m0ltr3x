package gitHub3;

import java.util.Scanner;

/**
 *                          EJERCICIO 4 | TEMA_03 | LECTURA DE DATOS DESDE TECLADO
 * Adapta el ejercicio 4 de la práctica 2 para que el conversor de euros a otra moneda solicite la
 * divisa a la que se va a cambiar, la cantidad en euros que se quiere convertir y el cambio aplicado.
 * 
 * @author M0ltr3X
 */
public class ejercicio4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Por favor, introduzca la cantidad de euros que quiere convertir: ");
        double euros = keyboard.nextInt();

        System.out.println("La conversion a dolares es: " + euros * 0.96 + "$");
    }
}


package gitHub3;

import java.util.Scanner;

/**
 *                          EJERCICIO 5 | TEMA_03 | LECTURA DE DATOS DESDE TECLADO
 * Adapta el ejercicio 5 de la práctica 2 para que el programa que calcule el total de una factura
 * solicite al usuario la base imponible (precio sin IVA). El valor del IVA deberás declararlo una constante
 * 
 * @author M0ltr3X
 */
public class ejercicio5 {
    public static void main(String[] args) {
        
    Scanner keyboard= new Scanner(System.in);
    System.out.print("Por favor, introduzca la base imponible (precio del artículo sin IVA): ");
    double baseImponible =keyboard.nextInt();

    System.out.printf("\nBase imponible %8.2f €\n", baseImponible);
    System.out.printf("IVA (21%%)      %8.2f €\n", (baseImponible * 0.21));
    System.out.printf("Total          %8.2f €\n", (baseImponible * 2.21));
  }
}
    
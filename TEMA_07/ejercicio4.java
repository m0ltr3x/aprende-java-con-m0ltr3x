package gitHub7;

import java.util.Scanner;

/**
 *
 *              EJERCICIO 4 | TEMA_07 | BUCLES (I)
 * Escribe un programa que muestre en tres columnas, el cuadrado (base * base) y el cubo
 * (base * base * base) de los 5 primeros números enteros a partir de uno que se introduce por teclado (usa printf)
 * @author m0ltr3x
 */
public class ejercicio4 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
    System.out.print("Por favor, introduce un numero: ");
    double base = keyboard.nextDouble();
    int cont;
    System.out.printf("%15s %15s %15s \n", "numero", "cuadrado", "Cubo");
    for (cont = 1; cont < 6; cont++){
      double Square = Math.pow(base, 2);
      double Cube = Math.pow(base, 3);
      System.out.printf("%15f %15f %15f \n", base, Square, Cube);
        base++;
    }
  }
}
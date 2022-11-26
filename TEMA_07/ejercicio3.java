package gitHub7;

import java.util.Scanner;

/**
 *          EJERCICIO 3 | TEMA_07 | BUCLES (I)
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * @author m0ltr3x
 */
public class ejercicio3 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
    System.out.print("Introduce un numero: ");
    int numero = keyboard.nextInt();
    System.out.println("tabla de multiplicacion del " + numero +"\n");
    for (int i = 1; i<= 10; i++){
      System.out.println(numero+" x "+i+" = "+numero*i);
    }
  }
}


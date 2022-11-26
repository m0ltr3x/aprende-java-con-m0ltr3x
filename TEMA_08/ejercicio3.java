package gitHub8;

import java.util.Scanner;

/**
 *                      EJERCICIO 3 | TEMA_07 | BUCLES (II)
 * 
 * Realiza un programa que:
 *          • Pida números hasta que se introduzca un numero negativo
 *          • Tras introducir un número negativo el programa deberá mostrar:
 *                       o Cuantos números se han introducido,
 *                       o la media de los impares
 *                       o y el mayor de los pares.
 *          • El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en los cálculos.
 * 
 * 
 * @author m0ltr3x
 */
public class ejercicio3 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double dividendo = 0;
        int conimpar = 0;
        int mayor = 0;
        int impar = 0;
        int contador = 0;
        int numero;
        do {
            System.out.print("Por favor, introduce un numero: ");
            numero = keyboard.nextInt();
            if (numero % 2 != 0) {
                impar = numero;
                dividendo += numero;
                conimpar++;
            } else {
                if (numero > mayor) {
                    mayor = numero;
                }
            }
            contador++;
        } while (numero > 0);
        double media = (dividendo - impar) / (conimpar - 1);
        System.out.println("Ha introducido " + contador + " numeros");
        System.out.println("La media de los impares es: " + media);
        System.out.println("El mayor número par ha sido el: " + mayor);
    }
}

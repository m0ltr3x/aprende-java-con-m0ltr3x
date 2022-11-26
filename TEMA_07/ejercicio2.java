package gitHub7;

import java.util.Scanner;

/**
 *
 * EJERCICIO 2 | TEMA_07 | BUCLES (I) 
 *   Crea un programa que haga lo siguiente:
 *              • Muestra el mensaje: “Introduce un número entero > 10: “
 *              • Muestra el mensaje: “Vamos a contar números de 10 en 10 entre N (el número introducido) y 0”
 *              • Muestra el siguiente menú:
 *                              [1] Usando for
 *                              [2] Usando while
 *                              [3] Usando do-while
 *              • La estructura de repetición que uses deberá contar hacia atrás, es decir, se
 *                empezarán a mostrar los números a partir de N (Ej.; Si N=100 → 100, 90, ... , 10, 0)
 *
 * @author m0ltr3x
 */
public class ejercicio2 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        keyboard.useDelimiter("\n");
        int option;

        do {

            System.out.println("\nMENU"); //Creamos el menu
            System.out.println("[1] - USANDO FOR");
            System.out.println("[2] - USANDO WHILE");
            System.out.println("[3] - USANDO DO-WHILE");
            System.out.println("[0] - SALIR");

            System.out.print("ESCOGE UNA OPCION: ");
            option = keyboard.nextInt();

            switch (option) {
                case 1:
                    usandoFor();
                    break;
                case 2:
                    While();
                    break;
                case 3:
                    doWhile();
                    break;
                case 0:
                    System.out.println("SALIR DE TU PROGRAMA");
                    break;
                default:
                    System.out.println("ERROR DE CARACTER");
            }

        } while (option != 0);
    }

    static void usandoFor() {
        int numero;
        int i;
        System.out.print("Introduce tu numero entero (del 1 al 100): ");
        numero = keyboard.nextInt();

        for (i = 100; i >= numero; i = i - 10) {
            System.out.print(i + " ");
        }
    }
    static void While() {
        int numero;
        int i = 100;
        System.out.print("Introduce tu numero entero (del 1 al 100): ");
        numero = keyboard.nextInt();

        while (i >= numero) {
            System.out.print(i + " ");
            i = i - 10;
        }
    }
    static void doWhile() {
        int numero;
        int i = 100;
        System.out.print("Introduce tu numero entero (del 1 al 100): ");
        numero = keyboard.nextInt();
        do {
            System.out.print(i + " ");
            i = i - 10;
        } while (i >= numero);
    }
}

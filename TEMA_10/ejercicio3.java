package practica11;

import java.util.Scanner;

/**
 *
 * Realiza un programa que intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, 
 * el programa debe preguntar si el número que estás pensando es mayor o menor que el que te acaba de decir
 *
 * @author m0ltr3x
 */
public class ejercicio3 {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

       System.out.print("Intenta adivinar el número (entre 0 y 10) en el que estoy pensando: ");
        int num = (int) (Math.random() * 10);
        int i = 1;
        int intentados = 5;
        boolean acertado = false;
        while (i <= intentados) {
            int numUs = keyboard.nextInt();
            if (num == numUs) {
                acertado = true;
                System.out.println("FELICIDADES, HAS ADIVINADO EL NUMERO");
            }
            if (!acertado) {
                if (num < numUs) {
                    System.out.println("EL NUMERO QUE ESTOY PENSANDO ES MAS PEQUEÑO");
                } else {
                    System.out.println("EL NUMERO QUE ESTOY PENSANDO ES MAS GRANDE");
                }
                System.out.println("te quedan solo " + (intentados - i) + " oportunidades");
                if (i < 8) {
                    System.out.print("por favor, introduce otro numero y intentalo de nuevo: ");
                }
            }
            i++;
        }
        System.out.println("El numero era: " + num);
    }
}

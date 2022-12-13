package practica11;

import java.util.Scanner;

/**
 *
 * @author josebartor
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
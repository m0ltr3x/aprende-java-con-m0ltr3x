package gitHub7;

import java.util.Scanner;

/**
 *
 *                      EJERCICIO 6 | TEMA_07 | BUCLES (I)
 * Vamos a realizar una nueva versión con bucles del ejercicio de adivinar un número aleatorio
 * visto anteriormente. Escoge la estructura de iteración que consideres más apropiada.
 * El programa deberá generar automáticamente un número aleatorio entre 0 – 10, usando la
 * función Math.random, y luego el usuario deberá tratar de adivinarlo.
 *                  a) El programa continuará solicitando un número hasta que el usuario lo acierte.
 *                  b) Se establecerá un número máximo de 3 intentos para adivinarlo
 * 
 * @author m0ltr3x
 */
public class ejercicio6 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Intenta adivinar el número (entre 0 y 10) en el que estoy pensando: ");
        int num = (int) (Math.random() * 10);
        int i = 1;
        int intentados = 3;
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
                System.out.println("teu quedan solo " + (intentados - i) + " oportunidades");
                if (i < 8) {
                    System.out.println("ui, otra vez sera!. PRUEBA A INTENTARLO DE NUEVO");
                }
            }
            i++;
        }
        System.out.println("El numero era: " + num);
    }
}

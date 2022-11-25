package gitHub4;

import java.util.Scanner;

/**
 *     EJERCICIO 1 | TEMA_04 | ESTRUCTURAS CONDICIONALES (I)
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 *
 * @author m0ltr3x
 */
public class ejercicio1 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        keyboard.useDelimiter("\n");
        System.out.print("Por favor ingrese un día de la semana: ");
        String diaSemana = keyboard.next();

        switch (diaSemana) {

            case "lunes": //los casos son para poder escoger una selecion de los días de la semana en este caso
                System.out.println("hay base de datos");
                break;
            case "martes":
                System.out.println("Toca tutoria con carmen");
                break;
            case "miercoles":
                System.out.println("Hay clase de hardware");
                break;
            case "jueves":
                System.out.println("Hay clase de HTML");
            case "viernes":
                System.out.println("Hay Programación JAVA");
                break;
            case "sabado":
            case "domingo":
                System.out.println("¡ES FIESTA!, vete a casa a descansar");
                
            default:
                System.out.println("por favor, introduce bien el día");
        }
    }
}

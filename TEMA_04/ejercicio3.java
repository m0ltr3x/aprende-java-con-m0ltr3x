package gitHub4;

import java.util.Scanner;

/**
 *     EJERCICIO 3 | TEMA_04 | ESTRUCTURAS CONDICIONALES (I)
 * 
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
 *
 * @author m0ltr3x
 */
public class ejercicio3 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        /* Recoge número */
        System.out.print("Por favor, Introduce un numero: (del 1 al 7): ");
        int diaSemana = keyboard.nextInt();
        switch (diaSemana) { //COMO EL EJERCICIO ANTERIOR VAMOS A CREAR EL SWITCH PARA LUEGO PODER HACER LOS CASOS DE LOS DÍAS DE LA SEMANA
            case 1: //los casos son para poder escoger una selecion de los días de la semana en este caso
                System.out.println("Lunes");
                break;
            case 2: //los casos son para poder escoger una selecion de los días de la semana en este caso
                System.out.println("Martes");
                break;
            case 3: //los casos son para poder escoger una selecion de los días de la semana en este caso
                System.out.println("Miercoles");
                break;
            case 4: //los casos son para poder escoger una selecion de los días de la semana en este caso
                System.out.println("Jueves");
                break;
            case 5: //los casos son para poder escoger una selecion de los días de la semana en este caso
                System.out.println("Viernes");
                break;
            case 6: //los casos son para poder escoger una selecion de los días de la semana en este caso
                System.out.println("Sabado");
                break;
            case 7: //los casos son para poder escoger una selecion de los días de la semana en este caso
                System.out.println("Domingo");
                break;

            default:
                System.out.println("Por favor, introduce bien el día de la semana");
        }
    }
}

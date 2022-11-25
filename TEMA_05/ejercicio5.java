package gitHub5;

import java.util.Scanner;

/**
 *
 *               EJERCICIO 5 | TEMA_05 | ESTRUCTURAS CONDICIONALES (II)
 * Codifica un programa que calcule los minutos que faltan para el fin de semana. Ten en cuenta
 * que consideramos que el fin de semana empieza el viernes a las 3 p.m. El usuario deberá
 * introducir un día de la semana (de lunes a viernes), una hora y unos minutos.
 * 
 * 
 * @author m0ltr3x
 */
public class ejercicio5 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese un dia de la semana (de lunes a viernes en letras minusculas): ");
        String dia = keyboard.next();

        int diaNumerico = 0;

        switch (dia) {
            case "lunes":
                diaNumerico = 0;
                break;
            case "martes":
                diaNumerico = 1;
                break;
            case "miercoles":
                diaNumerico = 2;
                break;
            case "jueves":
                diaNumerico = 3;
                break;
            case "viernes":
                diaNumerico = 4;
                break;
            default:
                System.out.println("¡El día ingresado no es correcto, por favor introducelo bien!");
        }

        System.out.println("Ahora ingrese la hora (hora y minutos)");

        System.out.print("Introduzca la hora: ");
        int horas = keyboard.nextInt();

        System.out.print("Introduzca los minutos: ");
        int minutos = keyboard.nextInt();

        int minutosTotales = (4 * 24 * 60) + (15 * 60);
        int minutosActuales = (diaNumerico * 24 * 60) + (horas * 60) + minutos;

        System.out.println("faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
    }
}

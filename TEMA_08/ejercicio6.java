package gitHub8;

import java.util.Scanner;

/**
 *
 *                      EJERCICIO 6 | TEMA_07 | BUCLES (II)
 * Realiza un programa que calcule las horas transcurridas entre dos horas de dos días de la semana. No se tendrán en cuenta los minutos 
 * ni los segundos. El día de la semana se puede pedir como un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”).
 * Se debe comprobar que el usuario introduce los datos correctamente y que el segundo día es posterior al primero.
 * 
 * @author m0ltr3x
 */
public class ejercicio6 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        boolean datos = true;
        String diaUnos;
        int horaUnoi;
        String diaDoss;
        int horaDosi;
        int diaUno1 = 0;
        int diaDos2 = 0;
        int horas = 0;
        System.out.println("por favor, introduzca la primera hora.");
        System.out.print("Día: ");
        diaUnos = keyboard.next();
        System.out.print("Hora: ");
        horaUnoi = keyboard.nextInt();
        System.out.println("por favor, introduzca la segunda hora.");
        System.out.print("Día: ");
        diaDoss = keyboard.next();
        System.out.print("Hora: ");
        horaDosi = keyboard.nextInt();

        //UNA VEZ CREADO LOS INT Y DANDOLE UN VALOR CREAMOS UN SWITCH DONDE POSTERIORMENTE VAMOS A 
        //PODER ELEGIR LOS DIAS DE CADA DIA Y PODREMOS COMPROBAR DATOS
        switch (diaUnos) {
            case "1":
            case "lunes":
                diaUno1 = 1;
                break;
            case "2":
            case "martes":
                diaUno1 = 2;
                break;
            case "3":
            case "miercoles":
                diaUno1 = 3;
                break;
            case "4":
            case "jueves":
                diaUno1 = 4;
                break;
            case "5":
            case "viernes":
                diaUno1 = 5;
                break;
            case "6":
            case "sabado":
                diaUno1 = 6;
                break;
            case "7":
            case "domingo":
                diaUno1 = 7;
                break;
            default:
                datos = false;
        }
        switch (diaDoss) {
            case "1":
            case "lunes":
                diaDos2 = 1;
                break;
            case "2":
            case "martes":
                diaDos2 = 2;
                break;
            case "3":
            case "miercoles":
                diaDos2 = 3;
                break;
            case "4":
            case "jueves":
                diaDos2 = 4;
                break;
            case "5":
            case "viernes":
                diaDos2 = 5;
                break;
            case "6":
            case "sabado":
                diaDos2 = 6;
                break;
            case "7":
            case "domingo":
                diaDos2 = 7;
                break;
            default:
                datos = false;
        }
        if ((horaUnoi < 0) || (horaUnoi > 23) || (horaUnoi < 0) || (horaUnoi > 23)) {
            datos = false;
        }
        if (diaUno1 == diaDos2) {
            if (horaUnoi > horaDosi) {
                datos = false;
            } else {
                horas = horaDosi - horaUnoi;
            }
        } else {
            horas = (24 - horaDosi) + (horaUnoi) + ((diaDos2 - diaUno1 - 1) * 24);
        }
        if (datos) {
            System.out.print("entre las " + horaUnoi + "h del " + diaUnos + " y las " + horaDosi + "h del día " + diaDoss + " hay una diferencia de " + horas + " horas/s\n");
        } else {
            System.out.print("por favor, ten cuidado a la hora de introducir los datos. Son incorrectos.");
        }
    }
}

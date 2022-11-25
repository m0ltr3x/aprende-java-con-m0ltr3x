package gitHub4;

import java.util.Scanner;

/**
 *              EJERCICIO 2 | TEMA_04 | ESTRUCTURAS CONDICIONALES (I)
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas
 * tardes o noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5.
 * respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
 *
 * @author m0ltr3x
 */
public class ejercicio2 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Por favor, introduce la hora: "); // AQUÍ PREGUNTAREMOS LA HORA QUE QUEREMOS HORA OCCIDENTAL DE 1 A 24
        int pideHora = keyboard.nextInt();
        // EN ESTE APARTADO VAMOS A CREAR LOS IF PARA PODER PEDIR LA HORA CON INTERVALOS DE LOS NUMEROS QUE VAYAMOS A PEDIR POR PANTALLA
        if ((pideHora >= 6) && (pideHora <= 12)) { //EN ESTE CASO CUANDO INTRODUZCAS LOS NUMEROS DE ENTRE 6 AL 12 SERÁN BUENOS DÍAS
            System.out.println("BUENOS DÍAS!");
        } else if ((pideHora >= 13) && (pideHora <= 19)) { //EN ESTE CASO CUANDO INTRODUZCAS LOS NUMEROS DE ENTRE 13 AL 19 SERÁN BUENAS TARDES
            System.out.println("BUENAS TARDES!");
        } else if ((pideHora >= 20) && (pideHora <= 24)) { //EN ESTE CASO CUANDO INTRODUZCAS LOS NUMEROS DE ENTRE 20 AL 24 SERÁN BUENAS NOCHES
            System.out.println("BUENAS NOCHES!");
        } else if ((pideHora >= 0) && (pideHora <= 5)) { //EN ESTE CASO CUANDO INTRODUZCAS LOS NUMEROS DE ENTRE 0 AL 5 SALDRA MENSAJE DE QUE ES MUY TEMPRANO
            System.out.println("Que haces despierto?");
        } else {
            System.out.println("the time you entered is not valid");
        }
    }
}

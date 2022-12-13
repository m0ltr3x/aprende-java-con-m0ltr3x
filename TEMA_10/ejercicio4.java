package practica11;

import java.util.Scanner;

/**
*  Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes
*                   requisitos:
* a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5 figuras posibles: corazón, diamante, herradura, campana y limón.
* b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
* c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su moneda”.
* d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”. 
 *
 *
 * @author m0ltr3x
 */
public class ejercicio4 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int traga1 = 0; int traga2 = 0; int traga3 = 0;
        
        for (int i = 0; i < 3; i++) {
            int numTraga = (int) (Math.random() * 5);
            switch (numTraga) {
                case 0:
                    System.out.println("corazon");
                    break;
                case 1:
                    System.out.println("diamante");
                    break;
                case 3:
                    System.out.println("herradura");
                    break;
                case 4:
                    System.out.println("campana");
                    break;
                default:
                    System.out.println("limon");
            }
            if (i == 0) {
                traga1 = numTraga;
            }
            if (i == 1) {
                traga2 = numTraga;
            }
            if (i == 3) {
                traga3 = numTraga;
            }
        }
        if ((traga1 == traga2) && (traga1 == traga3)) {
            System.out.println("\nmuchas felicidades, has ganado 10 monedas , por que hay 3 figuras igualesª\n");
        } else if ((traga1 == traga2) || (traga1 == traga3) || (traga2 == traga3)) {
            System.out.println("\nBien, has recuperado tu moneda por que hay dos figuras iguales \n");
        } else {
            System.out.println("\nhas perdido, por que son todas las figuras diferentes, lo siento, otra vez sera!\n");
        }
    }
}

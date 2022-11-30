package practica10;

import java.util.Scanner;

/**
 *              PRACTICA 10 | EJERCICIO 5 | BUCLES (III).
 * 
 * Implementa un juego en el que las reglas son las siguientes:
 *              • Al comenzar la partida, el jugador introduce la cantidad de dinero que quiere apostar.
 *              • Se muestra la tirada aleatoria de dos dados.
 *              • Si entre los dos dados suman 7 u 11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej. si apostó 1000 €, gana otros 1000 € 
 *              y acaba con 2000 €.
 *              • Si entre los dos dados suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida.
 *              • Si no se da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego entra en una segunda etapa. En esta etapa, el jugador 
 *              buscará volver a obtener ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7, pierde. Si sale otro número, tiene que seguir tirando.
 * 
 * @author M0ltr3x
 */
public class ejercicio5 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Por favor, Introduce la cantidad de dinero que quieres apostar: ");
        int dinero = keyboard.nextInt();
        boolean juegoAcabado = false;

        int dado1 = (int) (Math.random() * 6) + 1; //TIRAMOS EL DADO 1 Y NOS DARA UN NUMERO ALEATORIAMENTE
        int dado2 = (int) (Math.random() * 6) + 1; //TIRAMOS EL DADO 2 Y NOS DARA UN NUMERO ALEATORIAMENTE
        int suma = dado1 + dado2;

        System.out.println("Número del DADO 1: " + dado1);

        switch (suma) { //CREAMOS EL SWITCH DE LOS DIFERENTES CASOS DE LOS DADOS
            case 7:
            case 11:
                System.out.println("Enhorabuena, has ganado otros: " + dinero + " Eurazos!");
                System.out.println("Ahora tienes la cantidad de: " + dinero * 2 + " Euros!");
                break;
            case 2:
            case 3:
            case 12:
                System.out.println("UPS... HAS PERDIDO TU DINERO, LO SIENTO! ");
                break;
            default:
                System.out.print("Tiene que seguir tirando, debe conseguir el ");
                System.out.println(suma + " para ganar.");
                System.out.println("Si obtienes un 7 la partida habrá finalizado");
                System.out.println("POR FAVOR, DALE AL ENTER PARA SEGUIR TIRANDO LOS DADOS!");
                keyboard.nextLine();
                boolean partidaTerminada = false; //LA PARTIDA NO TERMINA POR QUE HEMOS GANADO
                do {
                    dado1 = (int) (Math.random() * 6 + 1); //CON ESTO CREAMOS QUE TIRE EL 1 DADO ALEATORIAMENTE
                    dado2 = (int) (Math.random() * 6 + 1); //CON ESTO CREAMOS QUE TIRE EL 2 DADO ALEATORIAMENTE
                    System.out.println("Número del DADO 1: " + dado1); //NUMERO DEL DADO 1
                    System.out.println("Número del DADO 2: " + dado2); //NUMERO DEL DADO 2
                    System.out.println("Suma: " + (dado1 + dado2)); //SUMAMOS LOS DADOS 1 Y 2
                    if ((dado1 + dado2) == suma) { //UN IF SI LA SUMA DEL DADO HACE EL CASO CORRECTO GANAR EL DINERO
                        System.out.println("Enhorabuena, has ganado otros: " + dinero + " eurazos!"); //GANAMOS EL DINERO
                        System.out.println("Ahora tienes la cantidad de:  " + dinero * 2 + " eurazos!"); //NOMBRAMOS LA CANTIDAD
                        partidaTerminada = true; //PARTIDA TERMINADA POR QUE HEMOS GANADO
                    } else if ((dado1 + dado2) == 7) { //SI LA SUMA DEL DADO 1 Y 2 EQUIVALE A 7 PERDEMOS EL DINERO
                        System.out.println("UPS... HAS PERDIDO TU DINERO, LO SIENTO! "); 
                        partidaTerminada = true; //TRUE POR QUE LA PARTIDA A TERMINADO
                    } else { //SIN EMBARGO GANAMOS LA PARTIDA CONTINUAREMOS JUGANDO ES DECIR SI EL BOLEEAN ES FALSO
                        System.out.println("CONTINUAMOS JUGANDO!");
                        System.out.println("POR FAVOR, DALE AL ENTER PARA SEGUIR TIRANDO LOS DADOS!");
                        keyboard.nextLine();
                    }
                } while (!partidaTerminada);
        }

    }
}

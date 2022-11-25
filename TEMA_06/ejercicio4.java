package gitHub6;

import java.util.Scanner;

/**
 *              EJERCICIO 4 | TEMA_06 | ESTRUCTURAS CONDICIONALES (III)
 * Evoluciona el ejercicio anterior de forma que podamos jugar a Piedra, Papel, Tijera, Lagarto,Spock
 * @author josebartor
 */
public class ejercicio4 {
     static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int jugador10k = 0;
        int jugador20k = 0;

        System.out.print("Turno del jugador 2: (piedra, papel tijera, lagarto o spock): ");
        String juego = keyboard.next();

        switch (juego) {
            case "piedra":
                jugador10k = 1;
                break;
            case "papel":
                jugador10k = 2;
                break;
            case "tijera":
                jugador10k = 3;
                break;
            case "lagarto":
                jugador10k = 4;
                break;
            case "spock":
                jugador10k = 5;
                break;
            default:
                System.out.println("opcion no valida amigo mio!"); //SI NO PONEMOS UNO DE LOS CASOS QUE HEMOS CREADO NO FUNCIONARA
        }

        if (jugador10k == 1) {
            System.out.println("La jugada del personaje10k es Piedra");
        }
        if (jugador10k == 2) {
            System.out.println("La jugada del personaje10k es Papel");
        }
        if (jugador10k == 3) {
            System.out.println("La jugada del personaje10k es Tijera");
        }
        if (jugador10k == 4) {
            System.out.println("La jugada del personaje10k es lagarto");
        }
        if (jugador10k == 5) {
            System.out.println("La jugada del personaje10k es spock");
        }

        System.out.print("Turno del jugador 2: (piedra, papel,tijera, lagarto o spock): ");
        String juego2 = keyboard.next();

        switch (juego2) {
            case "piedra":
                jugador20k = 1;
                break;
            case "papel":
                jugador20k = 2;
                break;
            case "tijera":
                jugador20k = 3;
                break;
            case "lagarto":
                jugador20k = 4;
                break;
            case "spock":
                jugador20k = 5;
                break;
            default:
                System.out.println("opcion no valida amigo mio!"); //SI NO PONEMOS UNO DE LOS CASOS QUE HEMOS CREADO NO FUNCIONARA
        }

        if (jugador20k == 1) {
            System.out.println("La jugada del jugador 20k es Piedra");
        }
        if (jugador20k == 2) {
            System.out.println("La jugada del jugador 20k es Papel");
        }
        if (jugador20k == 3) {
            System.out.println("La jugada del jugador 20k es Tijera");
        }
        if (jugador20k == 4) {
            System.out.println("La jugada del jugador 20k es lagarto");
        }
        if (jugador20k == 5) {
            System.out.println("La jugada del jugador 20k es spock");
        }

        if (jugador10k == jugador20k) {
            System.out.println("Empate");
        }
        if ((jugador10k == 1 && jugador20k == 3) || (jugador10k == 2 && jugador20k == 1) || (jugador10k == 3 && jugador20k == 2)) {
            System.out.println("Gana el jugador 10k!");
        }
        if ((jugador10k == 1 && jugador20k == 4) || (jugador10k == 4 && jugador20k == 5) || (jugador10k == 5 && jugador20k == 3) || (jugador10k == 3 && jugador20k == 4|| (jugador10k == 4 && jugador20k == 2)|| (jugador10k == 2 && jugador20k == 5|| (jugador10k == 5 && jugador20k == 1)))) {
            System.out.println("Gana el jugador 10k!");
        }
        if ((jugador10k == 3 && jugador20k == 1) || (jugador10k == 1 && jugador20k == 2) || (jugador10k == 2 && jugador20k == 3)) {
            System.out.println("Gana el jugador 20k!");
        }
        if ((jugador10k == 4 && jugador20k == 1) || (jugador10k == 5 && jugador20k == 4) || (jugador10k == 3 && jugador20k == 4) || (jugador10k == 4 && jugador20k == 3|| (jugador10k == 2 && jugador20k == 4)|| (jugador10k == 5 && jugador20k == 2|| (jugador10k == 1 && jugador20k == 5)))) {
            System.out.println("Gana el jugador 20k!");
        }
        }
    }


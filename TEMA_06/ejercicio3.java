package gitHub6;

import java.util.Scanner;

/**
 *                  EJERCICIO 3 | TEMA_06 | ESTRUCTURAS CONDICIONALES (III)
 * A partir del siguiente fichero, que contiene un diagrama de flujo, implementa el código siguiendo las indicaciones.
 * @author josebartor
 */
public class ejercicio3 {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int jugador10k = 0;
        int jugador20k = 0;

        System.out.print("Turno del jugador 1: (piedra, papel o tijera): ");
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
            default:
                System.out.println("opcion no valida amigo mio!"); //SI NO PONEMOS UNO DE LOS CASOS QUE HEMOS CREADO NO FUNCIONARA
        }

        if (jugador10k == 1) {
            System.out.println("La jugada del personaje10k escoge Piedra");
        }
        if (jugador10k == 2) {
            System.out.println("La jugada del personaje10k escoge Papel");
        }
        if (jugador10k == 3) {
            System.out.println("La jugada del personaje10k escoge Tijera");
        }

        System.out.print("Turno del jugador 2: (piedra, papel o tijera): ");
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
            default:
                System.out.println("opcion no valida amigo mio!"); //SI NO PONEMOS UNO DE LOS CASOS QUE HEMOS CREADO NO FUNCIONARA
        }

        if (jugador20k == 1) {
            System.out.println("La jugada del ordenador escoge Piedra");
        }
        if (jugador20k == 2) {
            System.out.println("La jugada del ordenador escoge Papel");
        }
        if (jugador20k == 3) {
            System.out.println("La jugada del ordenador escoge Tijera");
        }

        if (jugador10k == jugador20k) {
            System.out.println("Empate");
        }
        if ((jugador10k == 1 && jugador20k == 3) || (jugador10k == 2 && jugador20k == 1) || (jugador10k == 3 && jugador20k == 2)) {
            System.out.println("Gana el jugador 1!"); //CON TODAS ESTAS OPCIONES EL JUGADOR 1 HACE TODAS LAS COMPARATIVAS CON OPCIONES DEL
                                                        //JUGADOR 2 Y LAS GANA
        }
        if ((jugador10k == 3 && jugador20k == 1) || (jugador10k == 1 && jugador20k == 2) || (jugador10k == 2 && jugador20k == 3)) {
            System.out.println("Gana el jugador 2!"); //ESTO ES LO MISMO QUE LA EXPLICACION ANTERIOR PERO CON EL JUGADOR 2
        }
    }
}

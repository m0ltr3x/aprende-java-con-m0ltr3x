package gitHub6;

import java.util.Scanner;

/**
 *
 *      EJERCICIO 1 | TEMA_06 | ESTRUCTURAS CONDICIONALES (III)
 * A partir del siguiente pseudocódigo implementa el código tal y como se indica
 * @author josebartor
 */
public class ejercicio1 {
   static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("por favor ingrese una vocal (a,e,i,o,u): "); 
        char letter = keyboard.next().charAt(0); //CREAMOS UN CHAR

        letter = Character.toLowerCase(letter); //ESTE METODO LO USAMOS PARA QUE NUESTROS METODOS NO CAMBIE YA SEA MINUSCULA O MAYUSCULA
                                                   //CREAMOS LOS DIFERENTES CASOS CON LAS VOCALES Y EL CARACTER RESPECTIVO
        switch (letter) {
            case 'a':
                letter = 'a';
                break;
            case 'e':
                letter = 'e';
                break;
            case 'i':
                letter = 'i';
                break;
            case 'o':
                letter = 'o';
                break;
            case 'u':
                letter = 'u';
                break;

            default:
                System.out.println("no puedes escribir consonantes, solo vocales. "); //ESTE ES EL ERROR SI INTRODUCIMOS UNA CONSONANTE
        }
        
        System.out.println("\nla vocal que has ingresado es:" + letter);

    }
}

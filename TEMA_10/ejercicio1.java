package practica11;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
*
*   Crea un programa que pida al usuario un String y:
* • Reemplace todas las ‘a’ minúsculas por ‘A’ mayúsculas, excepto si están precedidas por un espacio
* • Muestre las iniciales de cada palabra
* • Muestre las letras pares en mayúsculas y las impares en minúsculas El programa debe mostrar todos los String generados en los puntos anteriores
*
* @author m0ltr3x
*/
public class ejercicio1 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        keyboard.useDelimiter("\n");



        System.out.print("------>PRIMER APARTADO<------" + "\n\n");
        //Reemplace todas las ‘a’ minúsculas por ‘A’ mayúsculas, excepto si están precedidas por un espacio
        System.out.print("por favor introduzca una frase: ");
        String frase = keyboard.next();
        String nuevaFrase = "";

        for (int i = 0; i < frase.length(); i++) {
            char ch = frase.charAt(i);
            if (ch == 'a' && i ==0) {
                nuevaFrase += Character.toUpperCase(ch);
            } else if (ch == 'a' && frase.charAt(i - 1) != ' ') {
                nuevaFrase += Character.toUpperCase(ch);

            }else{
                nuevaFrase+=ch;
            }
            
        }
        System.out.println(nuevaFrase);
        //---------------------------------/
        
        System.out.print("------>SEGUNDO APARTADO<------" + "\n\n");
        //Muestre las iniciales de cada palabra
        StringTokenizer iniciales = new StringTokenizer(frase); //String tokenizer  permite que nuestro programa divida una cadena en tokens
        while (iniciales.hasMoreTokens()) { //nombramos el while de iniciales tokens para la delimitación de nuestro string
            System.out.print(iniciales.nextToken().charAt(0) + "\n"); //esto lo que hace es que pasa a la siguiente palabra que introducimos
            //o tambien conocido como tokens y introduce la primera letra de la frase
        }
        System.out.print("------>TERCER APARTADO<------" + "\n\n");
        //Muestre las letras pares en mayúsculas y las impares en minúsculas
        String frase2;
        String fra = "";

        System.out.print("por favor introduce una frase: ");
        frase2 = keyboard.next();

        for (int i = 0; i < frase2.length(); i++) {
            char ch = frase2.charAt(i);

            if (i % 2 == 1) {
                fra += Character.toUpperCase(ch);

            } else if (i % 2 == 0) {
                fra += Character.toLowerCase(ch);

            }

        }
        System.out.println("tercer apartado:" + fra);
    }
}

package gitHub5;

import java.util.Scanner;

/**
 *
 *              EJERCICIO 3 | TEMA_05 | ESTRUCTURAS CONDICIONALES (II)
 * Escribe un programa en que se pida un número de 3 cifras y a continuación se muestre por
 * pantalla un mensaje indicando si el número es capicúa o no. Valida que el número introducido
 * efectivamente tiene 3 cifras. En caso contrario muestra un mensaje de error.
 * (Un número capicúa es aquel que se lee igual de izquierda a derecha, que de derecha a izquierda)
 * 
 * @author m0ltr3x
 */
public class ejercicio3 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;
        boolean capicua = false;

        System.out.print("Introduzca un número entero (3 números como máximo): ");
        numero = keyboard.nextInt();

        // ESTO HACEMOS EL NUMERO DE UNA CIFRA, NUMERO(QUE ES EL QUE DAMOS) SI ES MENOR A
        if (numero < 10) {
            capicua = true; //SERA SI CAPICUA
        }

        // número de dos cifras
        if ((numero >= 10) && (numero < 100)) {
            if ((numero / 10) == (numero % 10)) { //ESTO HACEMOS UNA COMPARATIVA PARA VER SI A LA IZQUIERDA SE LEE IGUAL QUE A LA DERECHA
                capicua = true; //SERA SI CAPICUA
            }
        }

        // número de tres cifras
        if ((numero >= 100) && (numero < 1000)) { //ESTA FORMULA ES SI NUESTRO NUMERO ES MAYOR O IGUAL QUE 100 Y NUMERO ES MENOR QUE 1000
            if ((numero / 100) == (numero % 10)) { //ESTO HACEMOS UNA COMPARATIVA PARA VER SI A LA IZQUIERDA SE LEE IGUAL QUE A LA DERECHA
                capicua = true; //SERA SI CAPICUA
            }
        }

        if (capicua) {
            System.out.println("el numero introducido es capicua"); //AQUI PONEMOS QUE SI EL NUMERO ES CAPICUA PUES OBVIAMENTE DIRA QUE SI
        } else {
            System.out.println("Tel numero introducido no es capicua"); //CREAMOS ESTE ELSE DE QUE EN CASO QUE NO SEA CAPICUA PUES DARA NEGATIVO EN CAPICUA
        }
    }

}

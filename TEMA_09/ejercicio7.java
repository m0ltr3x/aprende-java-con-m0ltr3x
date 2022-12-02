package practica10;

import java.util.Scanner;

/**
 *          PRACTICA 10 | EJERCICIO 7 | BUCLES (III)
 * En este ejercicio vamos a seguir el diagrama de numeros primos hecho por el profesor y pasarlo a java, tenemos que poner un numero entero y decir
 * si el numero introducido es un numero primo o no
 * 
 * @author josebartor
 */
public class ejercicio7 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        boolean es_Primo = true; //CREAMOS LA VARIABLE BOLEAN PARA DECIR SI ES PRIMO O NO PARA USARLO POSTERIORMENTE EN EL FOR Y IF
        System.out.print("por favor, Introduce un número entero: ");
        int num = keyboard.nextInt();

        for (int i = 2; i <= num/2; i++) { //VAMOS A CREAR UN FOR PARA HACER DIVISIBLE ENTRE 2 PARA SACAR EL NUMERO SI ES PRIMO O NO
            if ((num % i) == 0) { //SI EL NUMERO NO ES PRIMO ES TRUE Y SI ES PRIMO ES FALSE LA CONDICION DEL IF
                es_Primo = false;
            } else {
                es_Primo = true;
            }
        }
        System.out.print("el numero entero que has introducido ");
        if (es_Primo == true) { //LA CONDICION DEL IF CREAMOS SI EL NUMERO ES PRIMO SERA TRUE 
            System.out.print("es primo\n");
        } else {//EL ELSE ES PARA DECIR LO CONTRARIO
            System.out.print("no es primo\n");
        }
    }
}

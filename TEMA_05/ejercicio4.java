package gitHub5;

import java.util.Scanner;

/**
 *
 *              EJERCICIO 4 | TEMA_05 | ESTRUCTURAS CONDICIONALES (II)
 * Crea un programa que calcule el número de dígitos que tiene un número. Se aceptarán
 * números de como máximo 5 cifras. El número puede ser positivo o negativo.
 * 
 * @author m0ltr3x
 */
public class ejercicio4 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduzca un número entero (máximo cinco cifras): ");
        int numero = keyboard.nextInt();
        if (numero > 1000009999) {
            System.out.print("La cifra que debemos introducir es de 5 números como máximo: ");
            // Divide hasta que num < 10) 
        } else {
            int cuenta = 1; //AQUI LE DAMOS SIEMPRE UN VALOR YA QUE PARA IR SUMANDO CON CUENTA++ SIEMPRE TENEMOS QUE DARLE UN VALOR EN ESTE CASO ES 1
            numero = numero / 10;
            if (numero < 10) { //ESTO DIVIDE HASTA QUE NUMERO MAS GRANDE QUE 10
                cuenta++; // ESTO ES PARA IR AUMENTANDO LAS CIFRAS CONFORME PONGAMOS MAS DIGITOS
                System.out.println("el numero tiene" + cuenta + " digitos");
            } else {
                cuenta++;
                numero = numero / 10;
                if (numero < 10) {
                    cuenta++;
                    System.out.println("el numero tiene" + cuenta + " digitos");
                } else {
                    cuenta++;
                    numero = numero / 10;
                    if (numero < 10) {
                        cuenta++;
                        System.out.println("el numero tiene " + cuenta + " digitos.");
                    } else {
                        cuenta++;
                        numero = numero / 10;
                        if (numero < 10) {
                            cuenta++;
                            System.out.println("el numero tiene " + cuenta + " digitos."); //AQUÍ TERMINAMOS YA QUE SOLO TENEMOS QUE HACER HASTA 5 DIGITOS
                        }
                    }
                }
            }
        }
    }
}

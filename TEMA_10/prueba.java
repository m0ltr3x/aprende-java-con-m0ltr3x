package practica11;

import java.util.Scanner;

/**
 *
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código ascii entre el 32 y el 126. 
 * Puedes hacer casting con (char) para convertir un entero en un carácter
 *
 * @author m0ltr3x
 */
public class ejercicio2 {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
    for (int i = 1; i < 100; i++) {
            for (int j = 1; j < 300; j++) {
               char random = ((char)((Math.random() * 126) + 32));
                System.out.print(random);
            }
            System.out.println();
            }
            
        }
    }
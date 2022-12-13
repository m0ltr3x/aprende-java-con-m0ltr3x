package practica11;

import java.util.Scanner;

/**
 *
 * @author josebartor
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

  


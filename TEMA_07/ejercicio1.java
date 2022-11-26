package gitHub7;

import java.util.Scanner;

/**
 *
 * EJERCICIO 1 | TEMA_07 | BUCLES (I)
 * Crea un programa que haga lo siguiente:
 *      • Solicitarás un número entero por pantalla
 *      • Mostrarás un menú con 3 opciones:
 *              [1] Usando for
 *              [2] Usando while
 *              [3] Usando do-while
 *      • En función de la opción escogida deberás resolver el ejercicio usando la estructura seleccionada
 *      • Se deben mostrar únicamente los múltiplos del número introducido por el usuario comprendidos entre el 0 y el 100
 * 
 * @author m0ltr3x
 */
public class ejercicio1 {
    
        static Scanner keyboard = new Scanner(System.in);
        
    public static void main(String[] args) {

      keyboard.useDelimiter("\n");
        int option; 
        
        do{

        System.out.println("MENU"); //Creamos el menu
        System.out.println("[1] - USANDO FOR");
        System.out.println("[2] - USANDO WHILE");
        System.out.println("[3] - USANDO DO-WHILE");
        System.out.println("[0] - SALIR");

        System.out.print("ESCOGE UNA OPCION: ");
        option = keyboard.nextInt();

        switch (option) {
            case 1:
                UsandoFor();
                break;
            case 2:
                While();
                break;
            case 3:
                doWhile();
                break;
            case 0:
                System.out.println("SALIR DE TU PROGRAMA");
                break;
            default:
                System.out.println("ERROR DE CARACTER");
        }
        
         }while (option != 0);
    }

    static void UsandoFor() {
        int numero;
        System.out.print("Introduce tu numero entero: ");
        numero = keyboard.nextInt();

        for (int i = 1; i <= 100; i++) {
            if (i % numero == 0) {
                System.out.print(i + " ");
            }
        }
    }
    static void While() {
        int numero;
        int i = 0;
        System.out.print("Introduce tu numero entero: ");
        numero = keyboard.nextInt();

        while (i <= 100) {
            if (i % numero == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
    static void doWhile() {
        int numero;
        int i=0;
        System.out.print("Introduce tu numero entero: ");
        numero = keyboard.nextInt();

        do {
            if (i % numero == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 100);
    }
}


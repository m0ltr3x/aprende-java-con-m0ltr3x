package gitHub6;

import java.util.Scanner;

/**
 *              EJERCICIO 2 | TEMA_06 | ESTRUCTURAS CONDICIONALES (III)
 *      Codifica el siguiente programa:
 *      • Pide al usuario que introduzca 3 números (en la misma línea)
 *      • Muestra los números ordenados ascendentemente (de menor a mayor)
 *      • Muestra los números ordenados descendentemente (de mayor a menor)
 * 
 * @author josebartor
 */
public class ejercicio2 {
      static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Por favor, introduce 3 numeros enteros: "); 

        int numeroEntero1 = keyboard.nextInt(); //AQUI VAMOS INTRODUCIR LOS 3 INT DE NUMEROS ENTEROS QUE NOS REQUIERE EL EJERCICIO
        int numeroEntero2 = keyboard.nextInt();
        int numeroEntero3 = keyboard.nextInt();

        // AHORA VAMOS A ORDENAR LOS 3 NUMEROS ENTEROS QUE HEMOS INTRODUCIDO
        if ((numeroEntero1 <= numeroEntero2) && (numeroEntero1 <= numeroEntero3)) { //AQUI VAMOS A COMPARAR EL NUMERO ENTERO 1 CON EL 2 
                                                                                    //Y EL NUMERO ENTERO 1 Y CON EL NUMERO ENTERO 3
            System.out.print(numeroEntero1 + " < ");
            if (numeroEntero2 <= numeroEntero3) { //COMO HE DICHO COMPARAMOS SI NUMERO ENTERO 2 ES MAYOR O IGUAL A NUMEROENTERO 3 
                System.out.print(numeroEntero2 + " < " + numeroEntero3 + "\n") ;
            } else {
                System.out.print(numeroEntero3 + " < " + numeroEntero2 + "\n");
            }
            
        } else if ((numeroEntero2 <= numeroEntero1) && (numeroEntero2 <= numeroEntero3)) { //AQUI VAMOS A COMPARAR EL NUMERO ENTERO 2 CON EL 1
                                                                                            //Y EL NUMERO ENTERO 2 Y CON EL NUMERO ENTERO 3
            System.out.print(numeroEntero2 + " < ");
            if (numeroEntero1 <= numeroEntero3) { //COMO HE DICHO COMPARAMOS SI NUMERO ENTERO 1 ES MAYOR O IGUAL A NUMEROENTERO 3
                System.out.print(numeroEntero1 + " < " + numeroEntero3+ "\n");
            } else {
                System.out.print(numeroEntero3 + " < " + numeroEntero1 + "\n");
            }
        } else if ((numeroEntero3 <= numeroEntero1) && (numeroEntero3 <= numeroEntero2)) {//AQUI VAMOS A COMPARAR EL NUMERO ENTERO 3 CON EL 1
                                                                                          //Y EL NUMERO ENTERO 3 Y CON EL NUMERO ENTERO 2
            System.out.print(numeroEntero3 + " < ");
            if (numeroEntero1 <= numeroEntero2) { //COMO HE DICHO COMPARAMOS SI NUMERO ENTERO 1 ES MAYOR O IGUAL A NUMEROENTERO2
                System.out.print(numeroEntero1 + " < " + numeroEntero2 + "\n");
            } else {
                System.out.print(numeroEntero2 + " < " + numeroEntero1 + "\n");
            }
        }
    }
}

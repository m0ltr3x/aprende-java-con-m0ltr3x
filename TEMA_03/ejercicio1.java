package gitHub3;

import java.util.Scanner;

/**
 *
 *          EJERCICIO 1 | TEMA_03 | LECTURA DE DATOS DESDE TECLADO
 * Adapta el código del ejercicio 1 de la práctica 2 para que en lugar de asignar a las variables
 * enteras x e y los valores 144 y 999 respectivamente, los solicite por pantalla al usuario, que
 * podrá introducir cualquier valor. A continuación, se mostrará por pantalla los valores leídos,
 * la suma, la resta, la división y la multiplicación
 * 
 * @author M0ltr3X
 */
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        int x;
        int y;
        System.out.print("Introduce el primer valor: ");
        x = keyboard.nextInt();
        System.out.print("Introduce el segundo valor: ");
        y = keyboard.nextInt();
        System.out.print("La Suma de variable X e Y es: ");
        System.out.println(x + y); //aquí sumamos las variables X y Y
        System.out.print("La Resta de variable X e Y es: ");
        System.out.println(x - y); //aquí restamos las variables X y Y
        System.out.print("La Division de variable X e Y es: ");
        System.out.println(x / y);//aquí dividimos las variables X y Y
        System.out.print("La Multiplicacion de variable X e Y es: ");
        System.out.println(x * y); //aquí multiplicamos las variables X y Y
    }
}

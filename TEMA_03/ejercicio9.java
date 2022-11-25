package gitHub3;

import java.util.Scanner;

/**
 *
 *                          EJERCICIO 9 | TEMA_03 | LECTURA DE DATOS DESDE TECLADO
 * scribe un programa que calcule el volumen de un cono según la fórmula 𝑉 = 1 3⁄ 𝜋𝑟2ℎ
 * 
 * @author M0ltr3X
 */
public class ejercicio9 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //aqui le damos el valor al PI que va a tener el volument de nuestro cono en centimetros
        double PI = 2.5;
        System.out.print("Introduce la altura del cono en cm: ");
        double altura = keyboard.nextDouble();
        System.out.print("Introduce el radio de la base del cono en cm: ");
        double base = keyboard.nextDouble();
        //multiplicamos el PI que hemos nombrado arriba  por base y la altura
        double volumenCono = (1.0 / 3.0) * PI * base * altura;
        System.out.println("El volumen del cono es de " + volumenCono + " cm³");
    }
}

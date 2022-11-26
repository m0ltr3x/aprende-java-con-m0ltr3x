package gitHub7;

import java.util.Scanner;

/**
 *
 *                          EJERCICIO 7 | TEMA_07 | BUCLES (I)
 * Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia. NO USAR java.lang.Math .pow ()
 * REGLAS:
 *              • Si un número tiene exponente CERO, el resultado es UNO. (Ej. 𝑎 0 = 1).
 *              • Si un número tiene exponente POSITIVO, el resultado es la base multiplicada por si misma tantas veces como indique el exponente. 
 *              • Si el número está elevado a un exponente NEGATIVO, la expresión de este tipo se convierte en una FRACCIÓN, donde en el NUMERADOR 
 *                          se escribe un UNO y en el denominador se escribe la misma potencia, pero con exponente POSITIVO.
 * 
 * @author m0ltr3x
 */
public class ejercicio7 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce la BASE: ");
        double base = keyboard.nextDouble();
        System.out.print("Introduce el EXPONENTE: ");
        int exponente = keyboard.nextInt();
        double total = 1;
        for (int i = 0; i < exponente; i++) {
            total = base * total;
        }
        System.out.print(base + " elevado a " + exponente + " = es " + total);
        System.out.println("\n");
    }
}

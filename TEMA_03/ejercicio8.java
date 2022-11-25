package gitHub3;

import java.util.Scanner;

/**
 *
 *                          EJERCICIO 8 | TEMA_03 | LECTURA DE DATOS DESDE TECLADO
 * Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora.
 * 
 * @author M0ltr3X
 */
public class ejercicio8 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        int horasTrabajadas = keyboard.nextInt();
        //calculamos las horas trabajadas semanalmente por 9 € que cobramos la hora
        System.out.println("Su salario semanal es de " + (horasTrabajadas * 9) + " euros.");
    }
}

package gitHub4;

import java.util.Scanner;

/**
 *     EJERCICIO 4 | TEMA_04 | ESTRUCTURAS CONDICIONALES (I)
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas extras.
 * Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que
 * las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
 *
 * @author m0ltr3x
 */
public class ejercicio4 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int eurosHora = 12;
        int eurosExtra = 16;
        int sueldoTotal;
        int horasExtra;

        System.out.print("Por favor ingrese las horas trabajadas: "); //VAMOS A INTRODUCIR LAS HORAS TRABAJADAS
        int horasTrabajadas = keyboard.nextInt();

        if (horasTrabajadas <= 40) {// ESTO CALCULA LAS HORASTRABAJADAS JUNTO CON EL SUELDO EXTRA
            sueldoTotal = horasTrabajadas * eurosHora; //SUELDO TOTAL ES IGUAL A HORAS TRABAJADAS POR EUROSHORA
            System.out.printf("El salario correspondiente a %d horas de trabajo es %d euros", horasTrabajadas, sueldoTotal);
        } else if (horasTrabajadas > 40) {
            horasExtra = horasTrabajadas - 40;
            sueldoTotal = 40 * eurosHora + horasExtra * eurosExtra; //ESTE CALCULO NOS HARA SABER LAS HORAS EXTRAS CUANDO PASAN DE LAS 40 
            System.out.printf("El salario correspondiente a %d horas de trabajo es %d euros", horasTrabajadas, sueldoTotal);
        }
    }
}

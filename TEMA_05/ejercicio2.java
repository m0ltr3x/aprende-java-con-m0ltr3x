package gitHub5;

import java.util.Scanner;

/**
 *
 *              EJERCICIO 2 | TEMA_05 | ESTRUCTURAS CONDICIONALES (II)
 * Realiza un programa que pida el nombre completo de 3 alumnos y los muestre ordenados alfabéticamente.
 * El formato de los nombres introducidos deberá ser: apellido1 apellido2, nombre 
 * Para comparar usa el método compareTo de la clase String
 * 
 * @author m0ltr3x
 */
public class ejercicio2 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("por favor ingrese su primer apellido: "); //INTRODUCE TU PRIMER APELLIDO
        String apellido1 = keyboard.next();
        System.out.print("por favor ingrese su segundo apellido: "); //INTRODUCE TU SEGUNDO APELLIDO
        String apellido2 = keyboard.next();
        System.out.print("por favor, escriba su nombre: "); //INTRODUCE TU NOMBRE
        String nombre = keyboard.next();

        //AHORA CON TODO LO SIGUIENTES IF VAMOS A COMPROBAR CON EL COMPARETO VAMOS A COMPARAR Y COMPROBAR PARA PODER ORDENAR 
        //ALFABETICAMENTE LO QUE HEMOS INTRODUCIDO
        
        if ((apellido1.compareTo(apellido2) < 0) && (apellido1.compareTo(nombre) < 0)) {

            if (apellido2.compareTo(nombre) < 0) {
                System.out.println(apellido1 + "\n" + apellido2 + "\n" + nombre);
            } else {
                System.out.println(apellido1 + "\n" + nombre + "\n" + apellido2);
            }
        }

        if ((apellido2.compareTo(apellido1) < 0) && (apellido2.compareTo(nombre) < 0)) {

            if (apellido2.compareTo(nombre) < 0) {
                System.out.println(apellido2 + "\n" + apellido1 + "\n" + nombre);
            } else {
                System.out.println(apellido2 + "\n" + nombre + "\n" + apellido1);
            }
        }

        if ((nombre.compareTo(apellido1) < 0) && (nombre.compareTo(apellido2) < 0)) {

            if (apellido2.compareTo(nombre) < 0) {
                System.out.println(nombre + "\n" + apellido2 + "\n" + apellido1);
            } else {
                System.out.println(nombre + "\n" + apellido1 + "\n" + apellido2);
            }
        }
    }
}

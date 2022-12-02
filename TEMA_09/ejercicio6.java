package practica10;

import java.util.Scanner;

/**
 *                    PRACTICA 10 | EJERCICIO 6 | BUCLES (III)
 * 
 * Sigue el algoritmo del diagrama de la imagen y pasamelo a java con las notas medias de los alumnos.   
 * 
 * @author josebartor
 */
public class ejercicio6 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int numAlumno=1;
        double sumaNotas; //CREAMOS LOS DOUBLE PARA QUE DE EL NUMERO EXACTO CON DECIMALES DE LAS NOTAS QUE SUMAREMOS
        double maximo=0; 
        
        do {
            System.out.print("POR FAVOR, INTRODUZCA EL NÚMERO DE ESTUDIANTES EN LA CLASE: ");
            numAlumno = keyboard.nextInt();  //EL NumAlumno CONTIENE EL NUMERO DE ALUMNOS QUE PONEMOS EN CLASE
        } while (numAlumno <= 0); //ESTE WHILE SE REPETIRA HASTA QUE NO CONTENGA EL NUMERO DE ALUMNOS ES DECIR NO PODEMOS PONER 0 ALUMNOS

        System.out.print("NOTA DEL ALUMNO 1: ");
        sumaNotas = keyboard.nextDouble(); // LEEMOS LA NOTA DEL ALUMNO 1

        maximo = maximo + sumaNotas; //VAMOS SUMANDOLO AL ACUMULADOR DE NOTAS


        for (int i = 2; i <= numAlumno; i++) {  //AQUI LEEREMOS EL RESTO DE NOTAS DE LOS ALUMNOS EMPEZADO POR EL 2 YA QUE SI NO EMPEZARIAMOS DOS VECES
                                                //POR EL ALUMNO 1 Y ASÍ VAMOS SUMANDO HASTA EL NUMERO DE ALUMNOS QUE HAYAMOS PUESTO QUE HAY EN CLASE         
            System.out.print("La nota del alumno " + i + " es: "); //AQUI LA VARIABLE i ES EL NUMERO DE ALUMNOS QUE HEMOS PUESTO Y TENEMOS QUE PONER
                                                                   //LAS NOTAS
            sumaNotas = keyboard.nextDouble(); 
            maximo = maximo + sumaNotas; // LA SUMAMOS AL ACUMULADO0R DE NOTAS
        }

        // mostrar resultados
        System.out.printf("La nota media de los alumnos es: %.2f %n", maximo /numAlumno); //CALCULAMOS LA SUMA DE NOTAS QUE HEMOS PUESTO
                                                                                              // DIVIDIENDO CON EL NUMERO DE ALUMNOS
    }

}

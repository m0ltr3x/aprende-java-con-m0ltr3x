package github;

/** 
 *      EJERCICIO 3 | TEMA_01 | SALIDA DE DATOS POR PANTALLA
 *Escribe un programa que muestre por pantalla 10 palabras en inglés junto a su
 *correspondiente traducción al castellano. Las palabras deben estar distribuidas en dos columnas y alineadas a 
 *la izquierda.
 * @author M0ltr3X
 */
public class ejercicio3 {
    public static void main(String[] args) {
        System.out.printf("%-10s%15s","Computer", "Ordenador");
        System.out.printf("%-10s%13s","\nStudent", "Alumn@");
        System.out.printf("%-10s%11s","\nCat", "Gato");
        System.out.printf("%-10s%15s","\nPenguin", "Pinguino");
        System.out.printf("%-10s%14s","\nMachine", "Maquina");
        System.out.printf("%-10s%17s","\nNature", "Naturaleza");
        System.out.printf("%-10s%10s","\nLight", "Luz");
        System.out.printf("%-10s%12s","\nGreen", "Verde");
        System.out.printf("%-10s%12s","\nBook", "Libro");
        System.out.printf("%-10s%16s","\nPyramid", "Piramide" + "\n");        
    }
}

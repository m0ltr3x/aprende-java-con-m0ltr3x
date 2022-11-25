package github;

/**                     EJERCICIO 5 | TEMA_01 | SALIDA DE DATOS POR PANTALLA
 *Modifica el programaanterior, es decir el horario añadiendo colores. Puedes mostrar cada asignatura de un color diferente.
 * @author M0ltr3X
 */
public class ejercicio5 {
    public static void main(String[] args) {
        System.out.printf("\033[33m%5s%10s%18s%13s%9s", "Lunes", "Martes", "Miercoles","Jueves", "Viernes");
        System.out.printf("\n\033[30m%5s%10s%18s%13s%9s", "=====", "======", "=========","======", "=======");
        System.out.printf("\n\033[32m%5s%10s%18s%13s\033[31m%9s", "===", "BBDD", "PRG","SO", "===");
        System.out.printf("\n\033[34m%5s\033[31m%10s%18s\033[35m%13s%9s", "SO", "BBDD", "PRG","SO", "BBDD");
        System.out.printf("\n\033[33m%5s\033[31m%10s\033[34m%18s%13s\033[36m%9s", "SO", "BBDD", "ED","HTML", "BBDD");
        System.out.printf("\n\t========== DESCANS ==========");
        System.out.printf("\n\033[32m%5s%10s\033[33m%18s%13s%9s", "PRG", "ED", "BBDD","HTML", "HARDWARE");
        System.out.printf("\n\033[31m%5s%10s\033[34m%18s%13s\033[36m%9s", "PRG", "TUT", "HTML","BBDD", "HARDWARE");
    }
}

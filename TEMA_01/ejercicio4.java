package github;

/**     EJERCICIO 4 | TEMA_01 | SALIDA DE DATOS POR PANTALLA
 * Escribe un programa que muestre tu horario de clase, en nuestro caso es lo siguiente:
 * @author M0ltr3X
 */
public class ejercicio4 {
    public static void main(String[] args) {
        System.out.printf("%5s%10s%18s%13s%9s", "Lunes", "Martes", "Miercoles","Jueves", "Viernes");
        System.out.printf("\n%5s%10s%18s%13s%9s", "=====", "======", "=========","======", "=======");
        System.out.printf("\n%5s%10s%18s%13s%9s", "===", "BBDD", "PRG","SO", "===");
        System.out.printf("\n%5s%10s%18s%13s%9s", "SO", "BBDD", "PRG","SO", "BBDD");
        System.out.printf("\n%5s%10s%18s%13s%9s", "SO", "BBDD", "ED","HTML", "BBDD");
        System.out.printf("\n\t========== DESCANS ==========");
        System.out.printf("\n%5s%10s%18s%13s%9s", "PRG", "ED", "BBDD","HTML", "HARDWARE");
        System.out.printf("\n%5s%10s%18s%13s%9s", "PRG", "TUT", "HTML","BBDD", "HARDWARE");

    }
    
}


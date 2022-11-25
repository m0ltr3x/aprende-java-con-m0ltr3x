package gitHub2;

/**
 *                                          EJERCICIO 6 | TEMA_02 | VARIABLES 
 * Escribe un programa que declare variables de tipo char y de tipo String. Intenta mostrarlas por pantalla todas juntas en la misma línea 
 * y con una sola sentencia de Java (con un solo println) ¿es posible?
 * @author M0ltr3X
 */
public class ejercicio6 {
    public static void main(String[] args) {
        char tipo1 ='S'; //declaramos los charss
        char tipo2 ='o';
        char tipo3 ='y';
        char tipo4 ='c';
        char tipo5 ='h';
        char tipo6 ='a';
        char tipo7 ='r';
        String miPalabra="M0ltr3x"; // declaramos nuestro primer string
        String continuoPalabra="y es una prueba para demostrar que se puede compaginar string con "; //declaramos nuestro segundo string
        System.out.println("Bienvenidos, " + tipo1 + tipo2 + tipo3 + " " + miPalabra + " " + continuoPalabra  + tipo4 + tipo5 + tipo6 + tipo7);
        //en este ultimo es obligatorio poner las comillas donde se encuentra el lugar "Bienvenidos", no e sobligatorio ponerle nada, con solo las comillas
        //es suficiente
    }
}

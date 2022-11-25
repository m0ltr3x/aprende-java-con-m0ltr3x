package gitHub2;

/**
 *                                              EJERCICIO 7 | TEMA_02 | VARIABLES 
 * Escribe un programa que declare 7 variables de tipo char. A continuación, crea otra variable como cadena de caracteres y asígnale como 
 * valor la concatenación de las anteriores 7 variables. Por último, muestra la cadena de caracteres por pantalla ¿Qué problemas te 
 * encuentras? ¿cómo lo has solucionado?
 * 
 * @author M0ltr3X
 */
public class ejercicio7 {
    public static void main(String[] args) {
        char tipo1 ='M'; //creamos los 5 chars que dice el anuncio
        char tipo2 ='o';
        char tipo3 ='l';
        char tipo4 ='t';
        char tipo5 ='r';
        char tipo6 ='e';
        char tipo7 ='x';
        
        String tipos="" + tipo1 + tipo2 + tipo3 + tipo4 + tipo5 + tipo6 + tipo7; //hay que nombrar el string tipos para luego poder llamarlo con println y sumarlo
                                                                //por que en el caso de no hacerlo, se transformaria en caracteres ASCII y saldrian numeros
        System.out.println(tipos);
    }
}

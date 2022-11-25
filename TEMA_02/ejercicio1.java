package gitHub2;

/**
 *                      EJERCICIO 1 | TEMA_02 | VARIABLES
 * Escribe un programa en el que se declaren las variables enteras x e y. Asígnales los valores 144 y 999 respectivamente. A continuación, muestra 
 * por pantalla el valor de cada variable, la suma, la resta, la división y la multiplicación.
 * @author M0ltr3X
 */
public class ejercicio1 {
    public static void main(String[] args) {
        int variableX = 144; //creamos la primera variable 
        int variableY = 999; //creamos la segunda variable
        double yl=variableY; //con este double haremos que salgan decimales del Y
        double xl=variableX; //con este double haremos que salgan decimales del X
        
        System.out.print("La Suma de variable X e Y es: ");
        System.out.println(variableX + variableY); //aquí sumamos las variables X y Y
        System.out.print("La Resta de variable X e Y es: ");
        System.out.println(variableX - variableY); //aquí restamos las variables X y Y
        System.out.print("La Division de variable X e Y es: ");
        System.out.println(xl / yl);//aquí dividimos las variables X y Y
        System.out.print("La Multiplicacion de variable X e Y es: ");
        System.out.println(variableX * variableY); //aquí multiplicamos las variables X y Y
        
    }
    
}

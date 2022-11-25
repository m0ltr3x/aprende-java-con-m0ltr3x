package gitHub2;

/**
 *                          EJERCICIO 4 | TEMA_02 | VARIABLES 
 * Realiza un conversor de euros a otra moneda. La cantidad en euros que se quiere convertir deberá estar almacenadaen una variable.
 *
 * @author M0ltr3X
 */
public class ejercicio4 {

    public static void main(String[] args) {
        int euros = 60;
        int dolares = (int) (euros * 0.96); //llamamos el valor de euros y lo multiplicamos como esta el dolar respecto al euro hoy para hacer conversion
                                            // El 0.96 es al precio que esta el dolar actualmente
        System.out.println("60 euros en dolares son: " + dolares + "$");
    }
}

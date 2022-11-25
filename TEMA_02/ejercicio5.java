package gitHub2;

/**
 *                                      EJERCICIO 5 | TEMA_02 | VARIABLES 
 * Escribe un programa que calcule el total de una factura a partir de la base imponible (precio sin IVA). La base imponible estará almacenada 
 * en una variable.
 *
 * @author M0ltr3X
 */
public class ejercicio5 {

    public static void main(String[] args) {
        double baseImponible = 63.5; //Creamos la base imposible con un numero de factura cualquiera
        double iva = 2.21; //aquí adjuntamos el iva que nosotros creamos

        System.out.println("Base imponible es: " + baseImponible); // aquí nombramos cuanto es de factura normal
        System.out.println("IVA es: " + iva); //aquí nombramos cuanto es de IVA

        System.out.print("\nel resultado total de esta factura sería: "); // Aqui hacemos un print para adjuntar la frase
        System.out.println(baseImponible * iva); //con este println sumamos el iva y la baseimponible y tendremos el resultado
    }
}

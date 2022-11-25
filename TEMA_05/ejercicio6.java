package gitHub5;

import java.util.Scanner;

/**
 *                      EJERCICIO 6 | TEMA_05 | ESTRUCTURAS CONDICIONALES (II)
 * 
 * Escribe un programa que calcule el precio final de un producto según:
 *              • La base imponible (precio antes de impuestos)
 *              • El tipo de IVA aplicado. Puede ser: general (21%), reducido (10%) o superreducido (4%).
 *              • El código promocional. Los códigos promocionales pueden ser: sinpromo (no se
 * aplica promoción), mitad (el precio se reduce a la mitad), descfijo (se descuentan 5 euros) o porcentaje (se descuenta el 5%).
 * 
 * @author m0ltr3x
 */
public class ejercicio6 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Por favor, Introduce la base imponible: ");
        double baseImponible = keyboard.nextDouble();

        System.out.print("Por favor, Introduce el tipo de IVA (general, reducido o superreducido): ");
        String tipoIVA = keyboard.next();

        System.out.print("Por favor, Introduce el código promocional (nopromo, mitad, descfijo o porcentaje): ");
        String codigoPromocional = keyboard.next();

        // AQUI VAMOS A CALCULAR EL IVA ANTES DEL DESCUENTO
        int ivaNumerico = 0;

        switch (tipoIVA) {
            case "general":
                ivaNumerico = 21; //AQUI PONEMOS EL 21% DE DESCUENTO GENERAL
                break;
            case "reducido":
                ivaNumerico = 10; //AQUI PONEMOS EL 10% DE DESCUENTO
                break;
            case "superreducido":
                ivaNumerico = 4; //AQUI PONEMOS EL CASO DEL DESCUENTO DEL 4%
                break;
            default:
                System.out.println("El tipo de IVA introducido no es correcto."); //SI NO PONEMOS UNO DE LOS CASOS QUE HEMOS CREADO NO FUNCIONARA
        }

        double iva = baseImponible * ivaNumerico / 100; //ESTE APARTADO ES PARA CALCULAR EL IVA
        double precioSinDescuento = baseImponible + iva; //AQUI VAMOS A CALCULAR EL PRECIO SIN CODIGO DE DESCUENTO

        // AQUI VAMOS A PROCEDER A CALCULAR EL CODIGO DE DESCUENTO
        double descuento = 0;

        switch (codigoPromocional) {
            case "nopromo":
                break;
            case "mitad": //AQUÍ DESCONTAREMOS EL PRECIO A LA MITAD
                descuento = precioSinDescuento / 2;
                break;
            case "descfijo": // SE DESCUENTA 5 EUROS
                descuento = 5;
                break;
            case "porcentaje": //AQUÍ DESCONTAMOS EL 5%
                descuento = precioSinDescuento * 0.05;
                break;
            default:
                System.out.println("El código promocional introducido no es correcto.");
        }

        // AQUÍ VAMOS A MOSTRAR EL PRECIO FINAL CON TODA LA INFORMACIÓN DESGLOSADA
        double total = precioSinDescuento - descuento; //AQUI EL TOTAL OBVIAMENTE TENEMOS QUE RTESTAR EL PRECIO SIN DESCUENTO CON EL DESCUENTO

        System.out.printf("Base imponible       %6.2f\n", baseImponible); //EL RESULTADO DE LA BASE IMPONIBLE
        System.out.printf("IVA (%2d%%)            %6.2f\n", ivaNumerico, iva); //EL RESULTADO DEL IVA
        System.out.printf("Precio con IVA       %6.2f\n", precioSinDescuento); //EL RESULTADO DEL PRECIO SIN DESCUENTO
        System.out.printf("Cod.promo. (%5s) -%6.2f\n", codigoPromocional, descuento); //AQUÍ ES EL DESCUENTO CON EL CODIGOPROMOCIONAL 
        //Y EL "%5s" NOMBRA LO QUE SELECIONAMOS DEL CODIGO PROMOCIONAL
        System.out.println("TOTAL:                 " + total + " €"); //AQUÍ ADJUNTAMOS EL TOTAL DESPUES DE REALIZAR LOS PASOS ANTERIORES
    }
}

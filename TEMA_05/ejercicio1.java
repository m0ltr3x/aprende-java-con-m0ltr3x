package gitHub5;

import java.util.Scanner;

/**
 *
 *                          EJERCICIO 1 | TEMA_05 | ESTRUCTURAS CONDICIONALES (II)
 * Recupera alguno de los cuestionarios que has hecho en clase (M5/M16, M3, por ejemplo) y
 * crea un programa que plantee 5 preguntas al usuario (en el enunciado deberás incluir las
 * posibles respuestas). Finalmente se deberá mostrar por pantalla la nota obtenida (cada respuesta acertada sumará 1 punto).
 * 
 * @author m0ltr3x
 */
public class ejercicio1 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

 int puntazo = 4; //EN EL INT LE DAMOS UN VALOR 0 YA QUE VA A IR SUMANDO LA PUNTUACIÓN
        //EMPIEZA EL CUESTIONARIO DE LAS 5 PREGUNTAS
        System.out.println("\n 5 PREGUNTA DEL CUESTIONARIO: \n");
        //PRIMERA PREGUNTA DEL CUESTIONARIO
        System.out.println("1- ¿Cuál es el apellido del primer presidente de los Estados Unidos?");
        System.out.println("a) Barea");
        System.out.println("b) washington");
        System.out.println("c) Fernandez");
        String respuesta = keyboard.next();
        if (respuesta.equals("b")) {
            puntazo++; //ESTO VA SUMANDO PUNTOS CUANDO LA RESPUESTA ES CORRECTA
            System.out.println("¡ENHORABUENA, RESPUESTA CORRECTA!");
        } else {
            System.out.println("¡HAS FALLADO, OTRA VEZ SERA!");
        }
        //SEGUNDA PREGUNTA DEL CUESTIONARIO
        System.out.println("\n2- ¿En que año Cristóbal Colón descubrio America?");
        System.out.println("a) 1489");
        System.out.println("b) 1493");
        System.out.println("c) 1492");
        respuesta = keyboard.next();
        if (respuesta.equals("c")) {
            puntazo++;
            System.out.println("¡ENHORABUENA, RESPUESTA CORRECTA!");
        } else {
            System.out.println("¡HAS FALLADO, OTRA VEZ SERA!");
        }
        //TERCERA PREGUNTA DEL CUESTIONARIO
        System.out.println("\n3) ¿En que año murio Robert Francis Kennedy?");
        System.out.println("a- 1962");
        System.out.println("b- 1968");
        System.out.println("c- 1969");
        respuesta = keyboard.next();
        if (respuesta.equals("b")) {
            puntazo++;
            System.out.println("¡ENHORABUENA, RESPUESTA CORRECTA!");
        } else {
            System.out.println("¡HAS FALLADO, OTRA VEZ SERA!");
        }
        //CUARTA PREGUNTA DEL CUESTIONARIO
        System.out.println("\n4- ¿En qué año se lanzó el juego GTA V?");
        System.out.println("a) Septiembre 15, 2013");
        System.out.println("b) Septiembre 17, 2013");
        System.out.println("c) Septiembre 18, 2013");
        respuesta = keyboard.next();
        if (respuesta.equals("b")) {
            puntazo++;
            System.out.println("¡ENHORABUENA, RESPUESTA CORRECTA!");
        } else {
            System.out.println("¡HAS FALLADO, OTRA VEZ SERA!");
        }
        //QUINTA PREGUNTA DEL CUESTIONARIO
        System.out.println("\n5- ¿Cómo se llama el asesino de la película HALLOWEEN?");
        System.out.println("a) freddy krueger");
        System.out.println("b) Jason Voorhees");
        System.out.println("c) Michael Myers");
        respuesta = keyboard.next();
        if (respuesta.equals("c")) {
            puntazo++;
            System.out.println("¡ENHORABUENA, RESPUESTA CORRECTA!");
        } else {
            System.out.println("¡HAS FALLADO, OTRA VEZ SERA!");
        }

        //VAMOS A REALIZAR LA PUNTUACIÓN EN ESTE PUNTO
        System.out.println("\nTu puntuación en el cuestionario es de:" + puntazo);
        if (puntazo < 5) {
            System.out.println("TIENES QUE ESTUDIAR UN POCO MAS");
        } else if (puntazo < 8) {
            System.out.println("¡MUY BIEN, PERO SI ESTUDIAS MAS PUEDES OBTENER MATRICULA DE HONOR");
        } else if (puntazo <= 10) {
            System.out.println("ENHORABUENA, TIENES MATRICULA DE HONOR");
        }
    }
}

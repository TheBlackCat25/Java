import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import org.graalvm.compiler.nodes.PiArrayNode.Placeholder;

/**
 * paraulesencadenades
 */
public class paraulesencadenades {

    static String jugador1;
    static String jugador2;
    static String word;
    static int[] rondajugador1;
    static int[] rondajugador2;
    static int[] contador_ronda = 5;
    static Scanner player1 = new Scanner(System.in);
    static Scanner player2 = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Introduce tú nombre, Jugador 1= ");
        
        jugador1 = player1.nextLine();

        System.out.println("El teu nom és = " + player1);

        System.out.println("Introduce tú nombre, Jugador 2= ");
        
        jugador2 = player2.nextLine();

        System.out.println("El teu nom és = " + player2);

        Scanner paraula = new Scanner(System.in);

        System.out.println("Introdueix la primera paraula: ");

        word = paraula.nextLine();

        System.out.println("Es comença amb la paraula " + paraula);

        
    }
}
/**
 * repas
 */

import java.util.Random;

public class repas {

    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(10);
        int contador = 0;
        boolean x = false;
        while (!x) {
            int num = Integer.parseInt(System.console().readLine("Introdueix un numero: "));
            contador++;
            if (num != i) {
                System.out.println("Error ");
            } else {
                System.out.println("Correcte ");
                System.out.println("Has tardat " + contador + " Intents");
                x=true;
            }
        System.out.println("El número premiat és " + i);
        }
    }
}
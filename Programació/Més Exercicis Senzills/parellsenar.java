/**
 * parellsenar
 */
public class parellsenar {

    public static void main(String[] args) {
        /**Variables*/
        int s1 = 0, s2 = 0, b, a[] = new int[100];

        /*Establir números array*/

        for (int i = 0; i < a.length; i++){
            a[i]=i;
        }

        /* Introduïr el límit */

        b = Integer.parseInt(System.console().readLine("Introdueix número: "));

        /* Calcular Suma Parells i Suma Senars */

        for (int i = 0; i <= b; i++) {
            if (a[i]%2==0) {
                s1=s1+a[i];
            } else {
                s2=s2+a[i];
            }
        }

        /* Escriure resultats */

        System.out.println("El resultat és: " + s1);
        System.out.println("El resultat és: " + s2);
    }
}
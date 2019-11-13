/**
 * numinvertit
 */
public class Ex4numinvertit {

    public static void main(String[] args) {

        int arraypregunta[] = new int[5];
        int suma = 0;

        for (int num = 0; num < arraypregunta.length; num++) {
            arraypregunta[num] = Integer.parseInt(System.console().readLine("Introdueix num: "));
        }

        System.out.println("Ordre ascendent: ");
        for (int num = 0; num < arraypregunta.length; num++) {
            System.out.println(arraypregunta[num]);
        }

        for (int num = 0; num < arraypregunta.length; num++) {
            suma += arraypregunta[num];
        }
        System.out.println("Resultat: " + suma);

        System.out.println("Ordre descendent: ");
        for (int num = arraypregunta.length-1; num >=0; num--) {
            System.out.println(arraypregunta[num]);
        }
    }
}
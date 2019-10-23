/**
 * numinvertit
 */
public class numinvertit {

    public static void main(String[] args) {

        int arraypregunta[] = new int[5];
        int suma = 0;

        for (int num = 0; num < arraypregunta.length; num++) {
            arraypregunta[num] = Integer.parseInt(System.console().readLine("Introdueix num: "));
        }

        for (int num = 0; num < arraypregunta.length; num++) {
            System.out.println(arraypregunta[num]);
        }

        for (int num = 0; num < arraypregunta.length; num++) {
            suma += arraypregunta[num];
        }
        System.out.println(suma);
    }
}
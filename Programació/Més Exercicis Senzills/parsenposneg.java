/**
 * parsenposneg
 */
public class parsenposneg {

    public static void main(String[] args) {
        /* Variables */

        int b = Integer.parseInt(System.console().readLine("Introdueïx num: "));

        if (b>0) {
            System.out.println(b + " és positiu");
        } else {
            System.out.println(b + " és negatiu");
        }

        if (b%2==0) {
            System.out.println(b + " és parell");
        } else {
            System.out.println(b + " és senar");
        }

    }
}
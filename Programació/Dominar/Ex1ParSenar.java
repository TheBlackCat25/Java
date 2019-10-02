/**
 * Ex1ParSenar
 */
public class Ex1ParSenar {

    public static void main(String[] args) {
        
        int num = System.console().readLine("Introdueix num: ");

        if (num%2==0) {
            System.out.println("Es par");
        }
    }   else {
        System.out.println("Es senar");
    }
}
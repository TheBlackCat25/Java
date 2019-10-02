/**
 * numeros
 */
public class numeros {

    public static void main(String[] args) {
        int num = 0;
        
        Boolean parell = false;

        System.console().read("Introdueix numero: ");

        if (num %2 == 0) {
            System.out.println("És parell");
        }   else {
            System.out.println("Es senar");
        }
    }
}
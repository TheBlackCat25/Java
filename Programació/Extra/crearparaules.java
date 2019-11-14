import java.util.ArrayList;
import java.util.Scanner;


/**
 * crearparaules
 */
public class crearparaules {

    public static void main(String[] args) {
        ArrayList <String> al = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<2;i++){
            System.out.println("Introdueix el nom del jugador "+(i+1));
            al.add(sc.next());
        }
    }
}
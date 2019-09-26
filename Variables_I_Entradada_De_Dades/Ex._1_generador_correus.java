/**
 * generador_correus
 */
public class generador_correus {

    public static void main(String[] args) {
        String nom;
        String cognom;
        String domini;

        nom = System.console().readLine("Introdueix el nom: ");
        cognom = System.console().readLine("Introdueix el cognom: ");
        domini = System.console().readLine("Introdueix el domini desitjat: ");
        
        System.out.println("Hola "+nom+", el teu correu sirà "+nom+cognom+"@"+domini);
    }
}
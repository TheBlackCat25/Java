/**
 * Ex._2_icm
 */
public class Ex2icm {

    public static void main(String[] args) {
        Float pes;
        Float altura;
        Float imc;

        System.out.println("Introdueix el pes:");
        pes = Float.parseFloat(System.console().readLine());
        System.out.println("Introdueix la teua altura: ");
        altura = Float.parseFloat(System.console().readLine());
        imc = pes/(altura*2);
        if (imc<=18.5) {
            System.out.println("Tens baix pes");
        }
        else if (imc<=24.9) {
            System.out.println("Pes saludable");
        }
        else if (imc<=29.9) {
            System.out.println("Tens sobrepes");
        }
        else {
            System.out.println("Obesitat");
        }
    }
}
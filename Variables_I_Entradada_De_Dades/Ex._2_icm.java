/**
 * Ex._2_icm
 */
public class Ex._2_icm {

    public static void main(String[] args) {
        Float pes;
        Float altura;
        Float imc;

        pes = System.console().readLine("Introdueix el teu pes: ");
        altura = System.console().readLine("Introdueix la teua altura: ");
        imc = pes/(altura*2);
        if (imc>18.5) {
            System.out.println("Tens baix pes");
        }

        else if (imc) {
            
        }
    }
}
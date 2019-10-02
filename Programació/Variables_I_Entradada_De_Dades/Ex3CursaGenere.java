/**
 * Ex3_CursaGènere
 */
public class Ex3CursaGenere {

    public static void main(String[] args) {

        int edat;
        String nom,sexo,categoria,genere;

        nom = System.console().readLine("Introdueix el nom: ");

        edat = Integer.parseInt(System.console().readLine("Introdueix la edat: "));

        sexo = System.console().readLine("Introdueix el sexo (M/F): ");

        //String completo = "Hola " + nom + ", ets " + edat + " " + sexo;

        if (edat < 16) {
            //System.out.println("Juvenil");
            categoria="Juvenil";
        }   else if (edat < 65) {
            categoria="Sènior";
            //System.out.println("Senior");
        }   else {
            categoria="Veterà";
            //System.out.println("Veterano");
        }
        
        if (sexo.equalsIgnoreCase("M")) {
            //System.out.println("Masculí");
            genere="Masculí";
        }   else if (sexo.equalsIgnoreCase("F")) {
            //System.out.println("Femení");
            genere="Femení";
        } else {
            //System.out.println("Dada mal introduïda");
            genere="Dades de gènere mal introduïdes";
        }

        String completo = "Hola " + nom + ", ets " + categoria + " " + genere;

        System.out.println(completo);

        //System.out.format("Hola %s tens %d i ets %s\n", nom, edat, sexo);

    }
}
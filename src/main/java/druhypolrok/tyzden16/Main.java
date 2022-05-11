package druhypolrok.tyzden16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Muz muz = new Muz(12,"Jano", 189);
        Zena zena = new Zena(12, "Edita",155);

        //uloha: vytvorte si 5 objektov typu Muz a 5 objektov typu zena.
        //vytvorte si polia pre muzov a pre zeny.
        //potom vypiste mena vsetkych muzov co maju viac ako 18 rokov.
        //dalej vypiste mena vsetkych zien co maju viac ako 18 rokov.

        Muz muz1 = new Muz(16, "Fero", 175);
        Muz muz2 = new Muz(17, "Juraj", 180);
        Muz muz3 = new Muz(14, "Gregor", 170);
        Muz muz4 = new Muz(21, "Krystof", 185);
        Muz muz5 = new Muz(25, "Julián", 169);

        Zena zena1 = new Zena(18, "Tereza", 160);
        Zena zena2 = new Zena(17, "Róza", 155);
        Zena zena3 = new Zena(21, "Diana", 165);
        Zena zena4 = new Zena(20, "Natalia", 163);
        Zena zena5 = new Zena(19, "Erika", 156);

        List<Zena> zeny = Arrays.asList(zena1, zena2, zena3, zena4, zena5);
        List<Muz> muzi = new ArrayList<>();
        muzi.add(muz1);
        muzi.add(muz2);
        muzi.add(muz3);
        muzi.add(muz4);
        muzi.add(muz5);

        Zena[] test = new Zena[10];

        List<Entita> entita = new ArrayList<>(); //entita: size = 10
            entita.addAll(zeny); //zeny: size = 5
            entita.addAll(muzi); //muzi: size = 5
        System.out.println(entita.toString()); //entita: size = 10



    }
}
package druhypolrok.tyzden11.pornofilm;

import java.util.ArrayList;
import java.util.List;

public class NaseFilmy {
    public static void main(String[] args) {

        Pornoherec jarko = new Pornoherec("Jaro Slavik", "Hulibrk",
                19, 9, 100);
        Pornoherec Fero = new Pornoherec("Fero Mrkva", "Pele4",
                20, 10, 75);

        Pornoherecka evka = new Pornoherecka("Jane Doe", "HmmmMlask", 50.6, 21);
        Pornoherecka erika = new Pornoherecka("Jane Boo", "huhucoctail", 2.1, 19);

        List<Pornoherec> pornoherci = new ArrayList<>();
            pornoherci.add(jarko);
            pornoherci.add(Fero);

        List<Pornoherecka> pornoherecky = new ArrayList<>();
            pornoherecky.add(evka);
            pornoherecky.add(erika);


        for (Pornoherec pornoherec : pornoherci){
            System.out.println("dlzka ciciny " + pornoherec.menoPriezvisko + " je " + pornoherec.dlzkaCiciny);
        }

        for (Pornoherecka phky : pornoherecky){
            System.out.println("hlbka chacharuse " + phky.menoPriezvisko + " je " + phky.hlbkaChacharuse);
        }

        System.out.println("Objem = " + jarko.getObjemVacku());
        System.out.println("Dĺžka = " + jarko.getDlzkaCiciny());
        System.out.println("Dostrek = " + jarko.getDostrek());
        System.out.println("Meno a Priezvisko = " + jarko.getMenoPriezvisko());
        System.out.println("Pseudonym = " + jarko.getPseudonym());

        System.out.println("Meno = " + evka.getMenoPriezvisko());
        System.out.println("Dostrik = " + evka.getDostrik());
        System.out.println("Hlbka = " + evka.getHlbka());
        System.out.println("Pseudonym = " + evka.getPseudonym());
    }
}
package druhypolrok.tyzden10;

import java.util.ArrayList;

public class TestovaciaTrieda {

    public static void main(String[] args) {

        Osoba defaultnaOsoba = new Osoba();

        Osoba jedna = new Osoba("Pišta", "Ignác", 150 );
        Osoba dva = new Osoba("Fero", "Blažek", 160 );
        Osoba tri = new Osoba("Gregor", "Zelený", 170 );

        ArrayList<Osoba> zoznamOsob = new ArrayList<>();
        zoznamOsob.add(defaultnaOsoba);
        zoznamOsob.add(jedna);
        zoznamOsob.add(dva);
        zoznamOsob.add(tri);
        zoznamOsob.add(new Osoba());

        for (Osoba osobaVCykle : zoznamOsob){
            System.out.println(osobaVCykle.uciSaJavu());
        }
        //System.out.println(defaultnaOsoba);

    }
}

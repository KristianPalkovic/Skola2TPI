package prvypolrok.tyzden39.september29;

public class String01 {

    public static void main(String... args) {

        String meno;

        String priezvisko;

        String celeMeno;

        boolean jeVacsi;

        int nahodneCislo = (int)Math.random()*30;



        meno = "Kristian";
        priezvisko = "Palkovic";
        celeMeno = meno + " " + priezvisko;

        jeVacsi = celeMeno.length() > nahodneCislo;

        System.out.println("dlzka mojho mena je: " + celeMeno.length());
        System.out.println(nahodneCislo);
        System.out.println("je dlzka mojho mena vacsia ako nahodne cislo ?: " + jeVacsi);

        System.out.println(celeMeno);

        String prazdnyString = " ";
        System.out.println(prazdnyString);

    }
}
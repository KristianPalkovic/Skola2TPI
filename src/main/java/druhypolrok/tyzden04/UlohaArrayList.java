package druhypolrok.tyzden04;

import com.sun.deploy.panel.ExceptionListDialog;

import java.util.ArrayList;

public class UlohaArrayList {

    static ArrayList<String> testovaciePole = new ArrayList<>();

    public static void main(String[] args) {

        pridanie(testovaciePole, "prvý záznam");
        System.out.println(testovaciePole);

    }

    public static void pridanie(ArrayList<String> pole, String stringNaPridanie){
        pole.add(stringNaPridanie);
    }

    public static boolean jePrazdnePole1(ArrayList<String> pole){

        boolean jePrazdna = testovaciePole.isEmpty();

        return jePrazdna;
    }

    public static String jePrazdnePole2(ArrayList<String> pole){
    // aby na miesto true alebo false pot text: nie je tam nic" alebo "obsahuje elementy"

        if(pole.isEmpty()){
            return "Je prazdne";
        }
        else{
            return "ma elementy";
        }
    }

    public static String velkostPola(ArrayList<String> pole){

        //vráti text so znenim "Velkost pola je: XXXX "
        return null;
    }

    public static String vlozenieElementu(ArrayList<String> pole, int index, String element){
        //set sa pouzije ale najprv treba skontrolovat ci dany index patri do rozmedzia daneho
        //pola. ak bude vacsi vypisete "chybny index mimo rozsahu pola" ak to bude ok:
        //" vlozeny XXXX na index XXXX"

        return element;
    }

    public static <E> void test (ArrayList<E> pole){

    }
}
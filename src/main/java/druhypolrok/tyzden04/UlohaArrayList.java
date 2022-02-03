package druhypolrok.tyzden04;

import com.sun.deploy.panel.ExceptionListDialog;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class UlohaArrayList {

    static ArrayList<String> testovaciePole = new ArrayList<>();

    public static void main(String[] args) {

        pridanie(testovaciePole, "prvý záznam");
        System.out.println(testovaciePole);
        zmenaElementu(testovaciePole,0,"druhy zaznam");
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
        //int velkostPola = pole.size();
        //vráti text so znenim "Velkost pola je: XXXX "
        return "Velkost pola je: " + pole.size();
    }

    public static String obsahujeElement(ArrayList<String> pole, String element){

        boolean x = pole.contains(element);
        String y = "";
        if(x){
            y = ("obsahuje " + element);
        }else{
            y = ("neobsahuje " + element);
        }

       return y;
    }
    public static String zmenaElementu(ArrayList<String> pole, int index, String element){

        /*pole.add("Fero");
        pole.add("Gregor");
        pole.add("Robert");
        pole.add("Roman");
        pole.add("Erik");
        pole.add("Adam");

        boolean x = pole.contains("Fero");

        if(x){
            System.out.println("vlozeny na index");
        }else{
            System.out.println("chybny index mimo rozsahu pola");
        }

        x = pole.contains("Matej");

        if(x){
            System.out.println("vlozeny na index");
        }else{
            System.out.println("chybny index mimo rozsahu pola");
        }*/

        if(pole.size() > index){
            pole.set(index,element);
            return "Vlozeny" + element + " index";
        }else{
            return "Chybny index mimo rozsahu pola";
        }

        //set sa pouzije ale najprv treba skontrolovat ci dany index patri do rozmedzia daneho
        //pola. ak bude vacsi vypisete "chybny index mimo rozsahu pola" ak to bude ok:
        //" vlozeny XXXX na index XXXX"
    }

    public static <E> void test (ArrayList<E> pole){

    }
}
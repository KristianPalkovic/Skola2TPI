package prvypolrok.tyzden47;

public class NavratoveTypy {

    public static void main(String[] args) {

        String fero01 = vratiString("Fero");
        vratiString("dalsie Meno");
        vratiString("Mrkva");
        System.out.println(vratiInt("AB633"));

        System.out.println(fero01);
        System.out.println(vratiString("dalsie Meno"));
        ///////////////////////////////
        //nefunguje lebo metoda nic nevracia
        vratiNic("Honza");
        vratiNic("dalsie meno");
        vratiNic("Čech");

    }
    static void vratiNic(String x){

    }

    static String vratiString(String x){
        String uprava = x +"01";
        return uprava;
    }

    static int vratiInt(String x){
        String uprava = x +"niecoPridame"; x: //"AB" uprava: "ABniecoPridame"
        System.out.println(uprava); //uprava: "ABniecoPridame"
        int dlzkaSlova = uprava.length();
        return dlzkaSlova;
    }
}
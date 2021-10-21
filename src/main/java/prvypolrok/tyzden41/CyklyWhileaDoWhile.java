package prvypolrok.tyzden41;

public class CyklyWhileaDoWhile {

    static int spolocneI = 10;

    public static void main(String[] args) {

        ukazkaWhile("Kristian");
        System.out.println("===============================================");
        ukazkaDoWhile("Kristian");

    }

    public static void ukazkaWhile(String meno){
        int i = spolocneI;
        //nekonecna slucka while (true) {
        while ( i < 11){

            System.out.println(i + " " + meno);
                i++;
        }
    }

    public static void ukazkaDoWhile(String meno){
        int i = spolocneI;
     do{
         System.out.println(i + " " + meno);
         i++;
     }while ( i < 11);

    }
}

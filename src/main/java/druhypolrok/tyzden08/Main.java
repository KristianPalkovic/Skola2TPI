package druhypolrok.tyzden08;

public class Main {
    public static void main(String[] args) {

    //vytvorili sme si objekt stvoruholnik a ulozili sme si ho do premennej stvoruholniky;
    Stvoruholnik stvoruholnik = new Stvoruholnik();

    Trojuholnik trojuholnik = new Trojuholnik();

    Kruh kruh = new Kruh();

    KontrolaPrimitivnychDatovychTypovAString kontrola= new KontrolaPrimitivnychDatovychTypovAString();

    Kruh druhyKruh = new Kruh(2.4);

    Stvoruholnik druhyStvoruholnik = new Stvoruholnik(5,7);

    Trojuholnik druhyTrojuholnik = new Trojuholnik(3,5,4);

        System.out.println("Obsah trojuholníka sa rovná " + druhyTrojuholnik.obsahT());
        System.out.println("Obvod trojuholníka sa rovná " + druhyTrojuholnik.obvodT());
        System.out.println("Obsah kruhu sa rovná " + druhyKruh.obsahK());
        System.out.println("Obvod kruhu sa rovná " + druhyKruh.obvodK());
        System.out.println("Obsah stvoruholnika sa rovná " + druhyStvoruholnik.obsah());
        System.out.println("Obvod stvoruholnika sa rovná " + druhyStvoruholnik.obvod());
        System.out.println("------------------------------------------------");

        System.out.println(stvoruholnik.toString());
        System.out.println(trojuholnik.toString());
        System.out.println(kruh.toString());
        System.out.println(kontrola.toString());
        System.out.println(druhyKruh.toString());
        System.out.println(druhyStvoruholnik.toString());
        System.out.println(druhyTrojuholnik.toString());

    }
}
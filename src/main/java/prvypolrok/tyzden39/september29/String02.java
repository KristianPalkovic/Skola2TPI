package prvypolrok.tyzden39.september29;

import javax.xml.bind.SchemaOutputResolver;

public class String02 {

    public static void main(String[] args) {

        String meno = "Kristian";
        String priezvisko = "Palkovic";
        String celeMeno = meno + " " + priezvisko;

        celeMeno.indexOf(" ");

        System.out.println(celeMeno.indexOf(" "));
        System.out.println(celeMeno.substring(0,5));
        System.out.println(celeMeno.substring(8, celeMeno.length()));
        System.out.println(celeMeno.substring(8));
        System.out.println(celeMeno.substring(celeMeno.indexOf(priezvisko)));
        int indexPriezviska = celeMeno.indexOf(priezvisko);
        celeMeno.indexOf("Palkovic");
        System.out.println(celeMeno.substring(indexPriezviska));

        System.out.println("================================================");

        char charakter = celeMeno.charAt(4);
        System.out.println(charakter);
        System.out.println(charakter + 1 );
    }
}

//emtpy
//lenght
//substring
//indexOf
//toUpperCase
//toLowerCase
//substring(,);
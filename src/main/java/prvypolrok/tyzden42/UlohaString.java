package prvypolrok.tyzden42;

import java.util.Arrays;

public class UlohaString {

    public static void main(String[] args) {
         test();
         osemPoli();
         jePalindrom("Kristian");
    }
    static String text = " Clovek mierou svojeho chápania pracuje na seba, " + "a mierou nechápania na tých, kto chápe viac";

    static void test(){

            char[] poleZnakov = text.toCharArray();
int pocet = 0;
        for(int i=0; i < text.length(); i++){
            if(text.charAt(i) ==' '){
                pocet = pocet +1;
            }

        }
    }

    static void osemPoli(){

        char p = 'p';
        int nieco = p + 1;
        int pecko = nieco -1;

        System.out.println(p + " " + pecko);

        char[] test = new char[4];

        //int [] x = new int[s];
        //check[] y = {0,8,10,10};
        //char u = y[0];
        //y[0] = 'Z';
        //java.util.Arrays;

        int [] test1 = new int[] {2,5,66,77,898,34,2433,5676,367,-653};
        int vysledok1= Arrays.binarySearch(test1,367);
        System.out.println(vysledok1);

        Arrays.sort(test1);
        vysledok1=Arrays.binarySearch(test1,367);
        System.out.println(vysledok1);

        System.out.println(Arrays.toString(test1));
    }
    static boolean jePalindrom (String SlovoNaKontrolu){

        for(int x = 0;SlovoNaKontrolu.length()>x; x++){

            System.out.println(SlovoNaKontrolu.charAt(x));
        }
        String slovo ="";
        for( int x = SlovoNaKontrolu.length()-1; x >=0; x--){

            //System.out.println(SlovoNaKontrolu.charAt(x));
            //String slovo ="";
            slovo = slovo + SlovoNaKontrolu.charAt(x);
            System.out.println(slovo);
        }



        return SlovoNaKontrolu == slovo;
    }
}

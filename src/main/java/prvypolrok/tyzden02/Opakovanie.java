package prvypolrok.tyzden02;

import java.util.Arrays;

public class Opakovanie {
    public static void main(String[] args) {

        ulohy1_11();
        int[] t = {12,8,0,7,54};
        int[] t1 = new int[]{12,8,0,7,54};
        maxCislo(t);
        System.out.println(t);
        int[] e = {12,8,0,7,54};
        int[] e1 = new int[]{12,8,0,7,54};
        parneNeparne(e);

        //-------------------------------------------

        long velkeCislo = 3_000_000_000L; //64b
        int x = 5; // 32b
        short y = 7; // 16b
        byte z = 127; // 8b
        float f = 5.45f;
        double d = 5.43;

        //--------------------------------------------

        String meno;

        meno = "Kristian";

        for (int i = 0; i < meno.length(); i++){
            System.out.println(meno.charAt(i));
        }

        char[] menoPole = meno.toCharArray();
        char[] poleCharakterov = new char[]{'K','r','i','s','t','i','a','n'};
        boolean[] u = new boolean[]{};
        //u[1] = true;
        boolean[] u1 = new boolean[8];
        u1[0] = true;
        System.out.println(Arrays.toString(u1));
        /*for (int i = 0; i < poleCharakterov.length; i++){
            System.out.println(poleCharakterov[i]);
        }*/

        //------------------------------------------------------------------------

        boolean[] more = new boolean[5];
        char[] nerob = new char[5];
        int[] nevim = new int [5];
        String[] nevim2 = new String[5];
        System.out.println(Arrays.toString(more));
        System.out.println(Arrays.toString(nerob));
        System.out.println(Arrays.toString(nevim));
        System.out.println(Arrays.toString(nevim2));

        System.out.println(more.toString());
        System.out.println(nerob.toString());

    }

    public static void ulohy1_11(){
        String meno = "Kristian";

        for(int l = 0; l < meno.length(); l++){
            char ch = meno.charAt(l);
            System.out.println(ch);
        }

    }

    public static int maxCislo(int[] i){
        int max = 0;
        for (int o = 0; o<i.length; o++){
            if(i[o]>max){
                max=i[o];
            }
        }
        return max;
    }

    public static String parneNeparne(int[] i){
        int parne = 0;
        int neparne = 0;
        for (int r = 0; r<i.length; r++){
            if(i[r]%2 == 0){
                parne=parne +1;
                //alebo parne ++
            }else{
                neparne=neparne +1;
            }
        }
     return "Parne cisla: "+ parne + "Neparne cisla: "+ neparne;
    }

    //druhá možnost ako predošlý kód napísať skrátene
    public static String parnaNeparna2(int[] i){
        long parne = Arrays.stream(i).filter(a -> a%2==0).count();
        return "Parne cisla: "+parne + "Neparne cisla: " + (i.length-parne);
    }
}
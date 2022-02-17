package druhypolrok.tyzden07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UlohyOpakovanie {

    public static void main(String[] args) {
    List<Integer> pole01 = Arrays.asList(1,5,3,6,4,3,4,6,3,6);
        List<Integer> pole02 = Arrays.asList(0,0,0,0,30,0,0,0,0,0);
        List<Integer> pole03 = Arrays.asList(15,0,0,0,0,15,0,0,0,0);
        List<Integer> pole04 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> pole05 = Arrays.asList(1,5,3,6,4,3,8,9,3,6);
        List<Integer> pole06 = Arrays.asList(1,5,0,6,0,3,4,6,11,6);
        System.out.println(kontrola30(pole01));
        System.out.println(kontrola30(pole02));
        System.out.println(kontrola30(pole03));
        System.out.println(kontrola30(pole04));
        System.out.println(kontrola30(pole05));
        System.out.println(kontrola30(pole06));
        System.out.println(neparneCisla(pole01));
    }

    /*
    Napiste metodu ktora kontroluje sucet vsetkych desiatich hodnôt ci je presne 30.
    vrati true ak ano ak ine false.
    */

    static boolean kontrola30(List<Integer>pole){

            if (pole.size() == 10) {
                int sucet = 0;
                for (int i : pole) {
                    sucet = sucet + i;
                }
                if (sucet == 30) {
                    return true;
                } else {
                    return false;
                }
            }
        else {return false;}
    }
    /*
    Z danneho pola vyberiete len parne cisla a druha metoda z danneho cisla vyberie len neparne cisla
    */
    static List<Integer> neparneCisla(List<Integer> pole){
        ArrayList<Integer>parneCisla = new ArrayList<>();
      for(int i = 0; pole.size()>i; i++) {
          if (pole.get(i) % 2 == 0) {
              parneCisla.add(pole.get(i));
          }
      }
        return parneCisla;
    }
    static List<Integer> parneCisla(List<Integer> pole){
        return null;
    }
}
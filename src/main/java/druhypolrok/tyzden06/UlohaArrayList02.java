package druhypolrok.tyzden06;

import java.util.ArrayList;
import java.util.Arrays;

public class UlohaArrayList02 {
 static ArrayList<Integer> pole = new ArrayList<>();
    public static void main(String[] args) {


        pridanieDoPola(3);
        pridanieDoPola(4);
        pridanieDoPola(3);
        pridanieDoPola(5);
        pridanieDoPola(2);
        zoradeniePola();
        vypisaniePola();
    }
    private static void vypisaniePola(){
        //vypiste pole do konzoly
        System.out.println();
    }

    private static void zoradeniePola(){
        //zoradenie pola pouzi metodu sort
    }

    private static void pridanieDoPola(int i){
        //pridanie do pola len vtedy ak je element unikatny
        //ak je unikatny prida sa do pola a do konzoly vypise: element X pridany
        //ak nie je  unikatny tak sa len vypise do konzoly: element X uz existuje v poli

        if(pole.contains(i)){

            System.out.println("element " + "už existuje v poli");
        }else{
            //pole.add();
            System.out.println("element " + "pridaný");

        }
    }
}

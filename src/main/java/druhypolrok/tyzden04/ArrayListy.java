package druhypolrok.tyzden04;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListy {
    public static void main(String[] args) {
        listy();
    }

    void zaklady(){
        int[] pol1 = {1,1,2,2,23,4};
        int[] pole2 = new int[]{1,2,23,3};

        int element = pol1[2];
        pol1[2] = 5000;
        System.out.println(Arrays.toString(pol1));
        Arrays.sort(pol1);
        boolean rovnajusa = Arrays.equals(pol1,pole2);
    }

    static void listy(){

        ArrayList<String> poleArrayList = new ArrayList<>();
        System.out.println(poleArrayList.size());
        poleArrayList.add(0,"Fero");
        poleArrayList.add(1,"Gregor");
        poleArrayList.add(2,"Robert");
        poleArrayList.add(3,"Roman");
        poleArrayList.add(4,"Erik");
        poleArrayList.add(5,"Adam");
        poleArrayList.remove(2);
        poleArrayList.toString();
        poleArrayList.set(1,"Zmena");
        System.out.println(poleArrayList);


        int[] pole2 = new int[]{};
        System.out.println(pole2.length);
    }

    static void listy2(){

        ArrayList<Integer> poleArrayList2 = new ArrayList<>();
        System.out.println(poleArrayList2.size());
        poleArrayList2.add(8);
        poleArrayList2.add(1);
        poleArrayList2.add(4);
        poleArrayList2.add(7);
        poleArrayList2.add(8);
        poleArrayList2.add(5);
        poleArrayList2.toString();
        System.out.println(poleArrayList2);
    }
}


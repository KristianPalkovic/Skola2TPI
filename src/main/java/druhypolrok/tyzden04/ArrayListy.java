package druhypolrok.tyzden04;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListy {
    public static void main(String[] args) {
        listy();
        listy2();
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
        //poleArrayList.add(0,"Fero");
        //poleArrayList.add(1,"Gregor");
        //poleArrayList.add(2,"Robert");
        //poleArrayList.add(3,"Roman");
        //poleArrayList.add(4,"Erik");
        //poleArrayList.add(5,"Adam");
        poleArrayList.add("Fero");
        poleArrayList.add("Gregor");
        poleArrayList.add("Robert");
        poleArrayList.add("Roman");
        poleArrayList.add("Erik");
        poleArrayList.add("Adam");
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

        //---------------------------------------------------------------

        boolean jePrazdna = poleArrayList2.isEmpty();
        System.out.println(" je prázdne :" + jePrazdna);

        String vysledok = jePrazdna ? "nie je tam nic" : "obsahuje elementy";
        System.out.println(" je prazdne :" + vysledok);
        System.out.println("/////////////////////////");
        poleArrayList2.clear();
        jePrazdna = poleArrayList2.isEmpty();
        System.out.println(" je prazdne :" + jePrazdna);
        vysledok = jePrazdna ? " nie je tam nic" : "obsahuje elementy";
        System.out.println(" je prazdne :" + vysledok);
        System.out.println("velkost pola je :" +poleArrayList2.size());

        //String[] starePole = new String[10];

        poleArrayList2.add(45);
        poleArrayList2.add(44);
        poleArrayList2.add(43);
        poleArrayList2.add(42);
        System.out.println("obsahuje dané slovo :" +poleArrayList2.contains("dva"));

        ArrayList<String> pole1= new ArrayList<>();
        pole1.add("pes");
        pole1.add("macka");

        ArrayList<String> pole2 = new ArrayList<>();
        pole2.add("macka");
        pole2.add("pes");

        System.out.println(" su polia rovnake: "+pole1.equals(pole2));
        System.out.println(pole1);
        System.out.println(pole2);


    }
}

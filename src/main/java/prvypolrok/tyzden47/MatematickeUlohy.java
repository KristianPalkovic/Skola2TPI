package prvypolrok.tyzden47;

public class MatematickeUlohy {

    public static void main(String[] args) {

        int vysledok = 0;
        int[] pole = new int[]{1, 46, 4, 34, 5, 76, 44, 34, 5, 6, 6, 77,9,81,74,4 ,41,21,11,2,3,9,0,88,54,32,990,1258,2,4745,295};
        for (int i =0; i < pole.length; i++){
            if (pole[i] %2==0) {
                if (Math.sqrt(pole[i]) < 4) {
                    System.out.println(pole[i]);
                }
            }
        }
    }
}
//uloha: sucet cisiel takych ktore su parne a ich odmocnina je mensia ako 4
//odmocnina Math.
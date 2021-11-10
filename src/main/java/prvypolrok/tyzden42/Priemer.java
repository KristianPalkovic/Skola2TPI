package prvypolrok.tyzden42;

public class Priemer {

    public static void main(String[] args) {
        int[] pole = new int[]{1,46,4,34,5,76,44,34,5,6,6,77,};

    }

    static double priemer(){
        int pole[] = new int[] { 23, 1, 5, 78, 22};
        double vysledok = 0;
        for(int i=0; i < pole.length; i++){
            vysledok += pole[i];
            System.out.println("Scitanie cisiel v poli je : " + vysledok + " a priemer cisiel v poli je: " + vysledok/pole.length);
        }
        return vysledok;
    }
}

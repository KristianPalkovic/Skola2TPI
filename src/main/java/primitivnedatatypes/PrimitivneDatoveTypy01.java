package primitivnedatatypes;

public class PrimitivneDatoveTypy01 {

    public static void main(String[] args) {

        int nasaPrvaPremenna = 10;
        int nasaDruhaPremenna = 20;

        int vysledok = nasaPrvaPremenna + nasaDruhaPremenna;

        int den = 16;
        int mesiac = 9;
        int rok = 2021;

        int vysledok1 = den + mesiac + rok;

        long velkeCislo = 3_000_000_000L; //64b
        int x; // 32b
        short y; // 16b
        byte z; // 8b
        float f = 5.45f;
        double d = 5.43;

        int maxCislo = Integer.MAX_VALUE;

        int superVelkeCislo = maxCislo +1;
    System.out.println(vysledok);
    System.out.println(vysledok1);

    }

}

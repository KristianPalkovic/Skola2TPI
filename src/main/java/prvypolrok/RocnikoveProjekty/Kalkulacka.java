package prvypolrok.RocnikoveProjekty;

public class Kalkulacka {

    public static void main(String[] args) {
        scitanie(3,5);
        odcitanie(7,1);
        nasobenie(5,odcitanie(4,6));
    }

    static double scitanie(double a,double b) {

        double c = a + b;
        System.out.println(c);
        return c;
    }

     static double odcitanie(double a,double b) {

        double c = a - b;
        System.out.println(c);
        return c;
    }

    void delenie(double a, double b){

        double c = a / b;
        System.out.println(c);
    }

    static void nasobenie(double a, double b){

        double c = a * b;
        System.out.println(c);
    }

}

package prvypolrok.Opakovanie;

public class ulohy {

    public static void main(String[] args) {


        int a = 34;
        int b = 21;
        int c = a++ + ++b;

        System.out.println(a + b + c);

        int x = 1;
        int y = 1;
        int sum = x++*2 + x + ++y/2;

        System.out.println(x + y + sum);

        int f = 10;
        int g = 5;
        int sumPre = f%++g;
        int sumPOST= f%g++;

        System.out.println(f + g + sumPre + sumPOST);

    }

}

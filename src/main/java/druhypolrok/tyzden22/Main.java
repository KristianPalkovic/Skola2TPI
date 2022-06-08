package druhypolrok.tyzden22;

public class Main {
    public static void main(String[] args) {

        Calculate vypocet = new Calculate(null, null);
        Floor s = new Floor(10,8);
        Carpet w = new Carpet(5);
        Calculate e = new Calculate(new Floor(10,8), new Carpet(5));
        Calculate v = new Calculate(s,w);
    }
}



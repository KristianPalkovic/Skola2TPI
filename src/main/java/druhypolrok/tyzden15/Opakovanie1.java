package druhypolrok.tyzden15;

import java.util.ArrayList;

public class Opakovanie1 {

    public static void main(String[] args) {
        TestovaciaTrieda meno = new TestovaciaTrieda();
        System.out.println(meno.toString());
        TestovaciaTrieda test = new TestovaciaTrieda(4, "neco", 3.5);
        //test.neco = 8;
        System.out.println(test.toString());
        System.out.println(test.toString());

        ArrayList<TestovaciaTrieda> mojePole = new ArrayList<>();
        mojePole.add(meno);
        mojePole.add(test);

        for(int neco = 0; mojePole.size() > neco; neco++){
            System.out.println(meno);
        }
    }
}
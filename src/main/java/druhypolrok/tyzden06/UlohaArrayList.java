package druhypolrok.tyzden06;

import java.util.ArrayList;
import java.util.Arrays;

public class UlohaArrayList {
    //Arrays slúži na manipuláciu s poľami
    //vytvor ArrayList a pole[] na vsetky primitivne datove typy

    public static void main(String[] args) {

        polia();
    }

    static void polia(){

        boolean[] myBoolean = new boolean[]{false,true,false};
        ArrayList<Boolean> myBoolean2 = new ArrayList<>();
        myBoolean2.add(false);
        myBoolean2.add(true);
        myBoolean2.add(false);
        System.out.println(myBoolean2);

        // List<Boolean> test = new ArrayList(Arrays.asList(myBoolean));

        long L[] = new long []{3_000_000_000L};
        ArrayList<Long> x = new ArrayList<>();
        x.add(6_000_000_000L);
        x.add(84_000_000_000L);
        x.add(47_000_000_000L);
        System.out.println(x);

        //--------------------------------------------------------------------

        int[] y = new int[]{1,2,3,4,5,6};
        ArrayList<Integer> u = new ArrayList<>();
        u.add(7);
        u.add(8);
        u.add(9);
        System.out.println(u);

        //--------------------------------------------------------------------

        short[] i = new short[]{1,2,3,4,5};
        ArrayList<Short> o = new ArrayList<>();
        o.add((short) 6);
        o.add((short) 7);
        o.add((short) 8);
        System.out.println(o);

        //--------------------------------------------------------------------

        float[] p = new float[]{45F,25F};
        ArrayList<Float> k = new ArrayList<>();
        k.add(7F);
        k.add(8F);
        k.add(74F);
        System.out.println(k);

        //--------------------------------------------------------------------

        double[] j = new double[]{8.45,4.85,7.13};
        ArrayList<Double> m = new ArrayList<>();
        m.add(7.5);
        m.add(8.44);
        m.add(74.04);
        System.out.println(m);

        //--------------------------------------------------------------------

        char[] h = new char[]{};
        ArrayList<Character> n = new ArrayList<>();
        n.add('K');
        n.add('P');
        n.add('I');
        System.out.println(n);

        //--------------------------------------------------------------------

        byte[] b = new byte[]{15,81,100};
        ArrayList<Byte> g = new ArrayList<>();
        g.add((byte) 25);
        g.add((byte) 47);
        g.add((byte) 10);
        System.out.println(g);
    }
    /*
            *boolean[] myBoolean1 = new boolean[]{false,true,false};

           System.out.println("Zle " + myBoolean1.toString());

           System.out.println("Dobre " + Arrays.toString(myBoolean1));

           ArrayList<Boolean> test01 = new ArrayList(Arrays.asList(true,false,true));

           ArrayList<Boolean> test02 = new ArrayList(Arrays.asList(myBoolean1)); */

}

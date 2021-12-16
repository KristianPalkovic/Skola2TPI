package prvypolrok.tyzden47;

public class VytvaranieMetod {

    static void metoda1(int x){

    }
    static String metoda2(int y , String c){

        return "text";
    }
    static String metoda3(boolean u , String j){

        return "nejakyText";
    }
    static long metoda4(){

        return 789456213;
    }
    static String[] metoda5(int[] nieco){

        String[] x = new String[] {"text","text2","text3"};
        return x;
    }
    static void metoda6(boolean[]d , int x){

    }
    static boolean metoda7(String a , char b , long c ){
        return true;
    }
    static float metoda8(float x){
        return 4587;
    }
    static boolean[] metoda9(){

        boolean v[] =  {true, false, true, false};
        return v;

    }
    static void metoda10(boolean l ){

    }

    static void premenne(){
        int a = 4;
        boolean u = true;
        long l =456789123L;
        String c = "text";
        float x =  4578.47f;
        double d = 12.5;
        char ch = 'f';
    }
    static void polia(){
        String[] x = new String[] {"dva","tri","štyri","päť","jeden"};
        char[] chars = new char[] {'f'};
        boolean [] g = new boolean[] {true,false,true,false,true};
        float [] floats = new float[] {12.545f,12.545f,12.545f,12.545f,12.545f};
        long [] longs = new long[] {15165L,15165L,15165L,24890L,47654L};

        for(int u=0;u<x.length ;u++){
            System.out.println(x[u]);
        }
        for(int l=0;l<chars.length ;l++){
            System.out.println(chars[l]);
        }
        for(int u=0;u<x.length ;u++){
            System.out.println(g[u]);
        }
        for(int j=0;j<floats.length ;j++){
            System.out.println(floats[j]);
        }
        for(int z=0;z<longs.length ;z++){
            System.out.println(g[z]);
        }
    }


}
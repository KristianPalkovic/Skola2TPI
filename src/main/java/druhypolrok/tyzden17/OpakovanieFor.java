package druhypolrok.tyzden17;

public class OpakovanieFor {
    public static void main(String[] args) {
        obycajnyFor();
        nekonecnaSlucka();
        inicializacia();
    }
    public static void obycajnyFor(){

        for(int i = 10; i<20; i++){
            System.out.println("cyklus cislo " + i);
        }
    }

    public static void nekonecnaSlucka(){
        for(int i =10; i<20;){
            System.out.println("nekonecna slucka ");
        }
    }

    public static void inicializacia(){
        int i =0;
        for(String t = "test"; t== "test";){
            System.out.println("nekonecna slucka ");
            i++;
            if(i ==10){
                t = "test1";
            }
        }
    }
}
package druhypolrok.tyzden17;

public class OpakovanieIfElse {
    public static void main(String[] args) {
        naseIfElse(10);
        naseIfElse(14);
        naseIfElse(20);
    }

    public static void naseIfElse(int neco){
        int hodina = neco;
        if(hodina < 12){
            System.out.println("je " + hodina + " hodín" + " a je dopoludnia");
        }else if (hodina < 15){
            System.out.println("je " + hodina + " hodín" + " a je popoludní");
        }else{
            System.out.println("noc");
        }
    }
}
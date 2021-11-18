package prvypolrok.Ulohy;

public class macka {

    public static void main(String[] args) {
        macka(true, 54);
    }

    private static void macka(boolean b, int i) {

        if(b){
            if(i > 25){
                if(i< 45){
                    System.out.println("macka sa hra");
                }else {
                    System.out.println("macka sa nehra");
                }

            }else {
                System.out.println("macka sa nehra");
            }
        }else {
            if(i > 25){
                if(i< 35){
                    System.out.println("macka sa hra");
                }else {
                    System.out.println("macka sa nehra");
                }

            }else {
                System.out.println("macka sa nehra");
            }
        }
    }
}

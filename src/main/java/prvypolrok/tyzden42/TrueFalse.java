package prvypolrok.tyzden42;
;

public class TrueFalse {

    public static void main(String[] args) {
        trueAleboFalse();
        vypis();
    }
    public static void trueAleboFalse(){

        for(int i = 1;i<=5;i++){

            if(i%2 ==0){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    }
    public static void vypis(){
        boolean test = true;
        for(int x = 0; x>5; x++){
            System.out.println(test);
            test = !test;
        }
    }
    public static void dlzkaMena(String meno){

        if(!(meno.length() > 10)){
            System.out.println("moje meno je mensie ako 15 znakov");
        }else {
            System.out.println("moje meno je vacsie ako 15 znakov");
        }
    }
}

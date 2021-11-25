package prvypolrok.tyzden47;

public class SwitchDniVtyzdni {

    public static void main(String[] args) {
        System.out.println("danny den v tyzdni je: "+ denVtyzdni(2));
    }
    static String denVtyzdni(int x){

        if( x == 1){
            return "Pondelok";
        }else if(x == 2){
            return "Utorok";
        }else if (x == 3){
            return "Streda";
        }else if(x == 4){
            return "Štvrtok";
        }else if(x == 5){
            return "Piatok";
        }else if(x == 6){
            return "Sobota";
        }else if(x == 7){
            return "Nedela";
        }else{
            return "Neplatne cislo";
        }
    }

    static String denVtyzdniSwitch(int x){

        switch (x) {
            case 1:
                return "Pondelok";
            case 2:
                return "Utorok";
            case 3:
                return "Streda";
            case 4:
                return "Štvrtok";
            case 5:
                return "Piatok";
            case 6:
                return "Sobota";
            case 7:
                return "Nedela";
            default:
                return "Neplatne cislo";
        }
    }
}

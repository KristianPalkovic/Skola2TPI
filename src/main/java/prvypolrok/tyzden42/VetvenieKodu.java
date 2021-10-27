package prvypolrok.tyzden42;

public class VetvenieKodu {

    public static void main(String[] args) {

        dlzkaMena("Kristian Palkovic");
    }

    public static void dlzkaMena(String meno){


        if(meno.length() > 15){
            System.out.println("moje meno je vacsie ako 15 znakov");
        }else{
            System.out.println("moje meno je mensie ako 15 znakov");
        }
    }

    public static void lenIf(boolean vieJavu, String meno){

        if(vieJavu){
            meno = meno + " vie Javu";
        }

        meno = meno + " vie matematiku";

        System.out.println(meno);
    }

    public static void lenElse(boolean vieJavu, String meno) {

        if (vieJavu) {
            meno = meno + " vie Javu";
        }

        meno = meno + " vie matematiku";

        System.out.println(meno);
    }
}

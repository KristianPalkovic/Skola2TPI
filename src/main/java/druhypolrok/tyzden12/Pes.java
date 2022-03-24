package druhypolrok.tyzden12;

public class Pes {
    String rasa;
    double vek;
    String pohlavie;
    String meno;

    public Pes(){

    }

    public Pes(String rasaConstructor, int vekConstructor, String pohlavieConstructor, String menoConstructor){
        rasa = rasaConstructor;
        vek = vekConstructor;
        pohlavie = pohlavieConstructor;
        meno = menoConstructor;
    }

    public void HraSa(){
        System.out.println(meno + " sa hrá");
    }

    @Override
    public String toString() {
        return "Pes{" +
                "rasa='" + rasa + '\'' +
                ", vek=" + vek +
                ", pohlavie='" + pohlavie + '\'' +
                ", meno='" + meno + '\'' +
                '}';
    }

    public void hraSaSFenou(Pes pes){
        if(pes.pohlavie== "fena"){
            System.out.println(meno + " sa hrá s " + pes.meno);
        }else{
            System.out.println(meno + " pokusal " + pes.meno);
        }
    }
}

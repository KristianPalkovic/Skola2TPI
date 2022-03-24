package druhypolrok.tyzden12;

public class Pes {
    private String rasa;
    private double vek;
    private String pohlavie;
    private String meno;

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

    public String getRasa(){
        return this.rasa;
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

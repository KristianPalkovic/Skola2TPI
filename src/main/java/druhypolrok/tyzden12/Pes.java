package druhypolrok.tyzden12;

public class Pes {
    private String rasa;
    private int vek;
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

    public int getVek(){
        return vek;
    }

    public String getMeno(){ return meno;}

    public String getPohlavie(){return pohlavie;}

    public void setVek(int vek){
        if(vek < 0){
            System.out.println("Vek " + meno + " nie je platný");
        }else{
           // System.out.println("Vek je: " + vek);
            this.vek = vek;
        }
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

package druhypolrok.tyzden11.pornofilm;

import java.util.ArrayList;
import java.util.List;

public class Pornoherec {

    public String menoPriezvisko;
    public String pseudonym;
    public double dlzkaCiciny;
    public double objemVacku;
    public double dostrek;
    List<String> filmy = new ArrayList<>();
    double objemjednehoStriku = 6.0;

    public void hraVofilme(String nazovFilmu) {
        filmy.add(nazovFilmu);
        objemVacku = objemVacku - objemjednehoStriku;
    }

    public Pornoherec(){

    }

    public Pornoherec(String menoPriezviskoConstructor, String pseudonymConstructor, double dlzkaConstructor,
                      double objemCosntructor, double dostrekConstructor){
        menoPriezvisko = menoPriezviskoConstructor;
        pseudonym = pseudonymConstructor;
        dlzkaCiciny = dlzkaConstructor;
        objemVacku = objemCosntructor;
        dostrek = dostrekConstructor;
    }

    public String getMenoPriezvisko(){
        return menoPriezvisko;
    }
    public String getPseudonym(){
        return pseudonym;
    }
    public double getDlzkaCiciny(){
        return dlzkaCiciny;
    }
    public double getObjemVacku(){
        return objemVacku;
    }
    public double getDostrek(){
        return dostrek;
    }

    @Override
    public String toString() {
        return "Pornoherec{" +
                "menoPriezvisko='" + menoPriezvisko + '\'' +
                ", pseudonym='" + pseudonym + '\'' +
                ", dlzkaCiciny=" + dlzkaCiciny +
                ", objemVacku=" + objemVacku +
                ", dostrek=" + dostrek +
                ", filmy=" + filmy +
                '}';
    }
}
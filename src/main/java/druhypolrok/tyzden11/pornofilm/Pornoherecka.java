package druhypolrok.tyzden11.pornofilm;

import java.util.ArrayList;
import java.util.List;

public class Pornoherecka {

    String menoPriezvisko;
    String pseudonym;
    double dostrik;
    double hlbkaChacharuse;
    List<String> filmy = new ArrayList<>();

    public void hraVofilme(String nazovFilmu){
        filmy.add(nazovFilmu);
    }

    public Pornoherecka(){

    }

    public Pornoherecka(String menoPriezvisko, String pseudonym, double dostrik, double hlbkaChacharuse){
        this.menoPriezvisko = menoPriezvisko;
        this.pseudonym = pseudonym;
        this.dostrik = dostrik;
        this.hlbkaChacharuse = hlbkaChacharuse;
    }
    public double getDostrik(){
        return dostrik;
    }
    public double getHlbka(){
        return hlbkaChacharuse;
    }
    public String getMenoPriezvisko(){
        return menoPriezvisko;
    }
    public String getPseudonym(){
        return pseudonym;
    }

    @Override
    public String toString() {
        return "Pornoherecka{" +
                "menoPriezvisko='" + menoPriezvisko + '\'' +
                ", pseudonym='" + pseudonym + '\'' +
                ", dostrik=" + dostrik +
                ", hlbkaChacharuse=" + hlbkaChacharuse +
                '}';
    }
}

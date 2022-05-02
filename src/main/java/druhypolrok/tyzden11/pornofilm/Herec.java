package druhypolrok.tyzden11.pornofilm;

import java.util.ArrayList;
import java.util.List;

public class Herec {

    private String menoPriezvisko;
    private String pseudonym;
    List<String> filmy = new ArrayList<>();

    public Herec(){
        super();
    }

  public Herec(String menoPriezvisko, String pseudonym){
      this.menoPriezvisko = menoPriezvisko;
      this.pseudonym = pseudonym;

  }

    public String getMenoPriezvisko(){return menoPriezvisko;}
    public String getPseudonym(){return pseudonym;}
    public void setMenoPriezvisko(String menoPriezvisko) {this.menoPriezvisko = menoPriezvisko;}
    public void setPseudonym(String pseudonym) {this.pseudonym = pseudonym;}

    public void pridatFilm(String nazovFilmu){
        List<String> filmy = new ArrayList<>();
        filmy.add("Film1");
        filmy.add("Film2");
        filmy.add("Film3");
        filmy.add("Film4");

        System.out.println(filmy);

    }

    public boolean odobratFilm(String nazovFilmu){
        //zistite najprv ci sa film nachadza v zozname
        //pokial sa film zmaze zo zoznamu navratova hodnota je true
        //inak false.

        if(filmy.contains(filmy)){
            System.out.println("Film sa nachádza v zozname");
            return true;
        }else{
            System.out.println("Film sa v zozname nenachadza");
            return false;
        }
    }
}


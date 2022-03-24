package druhypolrok.tyzden12;

public class Main {
    public static void main(String[] args) {

        Pes dunco = new Pes("dobrman", 3, "pes", "Dunco");
        Pes max = new Pes("jazvečík", 8, "pes", "Max");
        Pes fifinka = new Pes("pudl", 2, "fena", "Fifinka");

        dunco.HraSa();
        max.HraSa();
        fifinka.HraSa();
        dunco.hraSaSFenou(max);
        dunco.hraSaSFenou(fifinka);
    }
}

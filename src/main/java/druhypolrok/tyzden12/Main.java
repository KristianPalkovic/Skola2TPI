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
        System.out.println(dunco.getRasa());
        System.out.println(fifinka.getRasa());

        dunco.setVek(-2);
        fifinka.setVek(60);

        System.out.println(dunco.getRasa());
        System.out.println(dunco.getVek());
        System.out.println(dunco.getMeno());
        System.out.println(dunco.getPohlavie());
    }
}
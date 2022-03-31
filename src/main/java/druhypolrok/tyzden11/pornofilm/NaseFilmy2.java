package druhypolrok.tyzden11.pornofilm;

import java.util.List;
public class NaseFilmy2 {

    public static void main(String[] args) {

        List<Pornoherecka> Pornoherecka = pornoherecky();

        Pornoherecka pornoherecka = pornohereckas.get(0);

        pornoherecka.robiGangbang(pornoherci());

    }

    private static void getObjemVacku(){
        pornoherci().forEach(ph -> System.out.println(ph.getObjemVacku()));

        //sout bude "xyz sa zucastnil na obstastneni pornoherecky menom...."
        //trba odcitat 6.0 z objemu vacku kazdeho pornoherca.
    }
}
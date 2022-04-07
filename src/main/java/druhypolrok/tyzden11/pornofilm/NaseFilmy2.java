package druhypolrok.tyzden11.pornofilm;

import static druhypolrok.tyzden11.pornofilm.Commons.pornoHerci;
import static druhypolrok.tyzden11.pornofilm.Commons.pornoHerecky;

public class NaseFilmy2 {

    public static class Nasefilmy2 {

        public static void main(String[] args) {

            druhypolrok.tyzden11.pornofilm.PornoHerecka pornoHerecka = pornoHerecky().get(0);


            getObjemVacku();

            pornoHerecka.robiGangbang(pornoHerci());

            getObjemVacku();

        }

        private static void getObjemVacku() {
            pornoHerci().forEach(ph -> System.out.println(ph.getObjemVacku()));

        }
    }
}
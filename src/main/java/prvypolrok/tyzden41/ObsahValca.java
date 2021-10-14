package prvypolrok.tyzden41;

public class ObsahValca {

    public static void main(String[] args){

            double polomer = 4.3;
            double PI = Math.PI;
            double vyska = 4.5;
            double vysledok = PI*Math.pow(polomer,2)*vyska;

            System.out.println(" objem valca s polomerom " + polomer + " je " + vysledok);

            //povrch valca
            int Sp = 8;
            int Spl = 20;
            int vysledok1 =2*Sp+Spl;

            System.out.println("Povrch valca je " + vysledok1);

            //obsah elipsy
            double p = 3.14;
            int a = 6;
            int b = 4;
            double vysledok2 = p*a*b;

            System.out.println("Obsah elipsy je " + vysledok2);

            //obsah trojuholnika
            int c = 5;
            int vc = 8;
            int vysledok3 = (c*vc)/2;

            System.out.println("Obsah trojuholnika je " + vysledok3);


            //Obvod trojuholnika
            int z = 10;
            int u = 15;
            int i = 7;
            int vysledok4 = z+u+i;

            System.out.println("Obvod trojuholnika je " + vysledok4);

            //obvod sestuholnika
            int t = 5;
            int vysledok5 = t*6;
            System.out.println("Obvod sestuholnika je " + vysledok5);

            //obsah sestuholnika
            int r =3;
            int e = 3;
            int w = 20;
            int vysledok6;

            System.out.println("Obsah sestuholnika je " );


        }
        //du povrchu valaca, obsah elipsy, obsah obvod trojuholnika, obvod a obsah 6uholnika


}

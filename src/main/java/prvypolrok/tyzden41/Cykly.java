package prvypolrok.tyzden41;

public class Cykly {

    public static void main(String[] args) {

        vypisanie10Cisiel();
        prepisanieNaWhile();

        //inicializacia pola typu int a naplnenie desiatimi cislami
    }

    static void cyklusApole(){

        int[] poleCisel = new int[]{1,2,3,4,5,6,7,8,9,10};

        int nultyindex =poleCisel[0];
        //vypisanie dlzky pola
        System.out.println(poleCisel.length);
        for (int i = 0; i < poleCisel.length; i++){
            System.out.println(poleCisel[i]);
        }
    }

    static void vypisanie10Cisiel(){
        int x=0;
        int vysledok = 0;
        for (int i = 1; i <= 10; i++) {
           System.out.println("pred ulozenim: " +x);
            x=i;
            System.out.println("po ulozeni: " + x);
            vysledok = vysledok + i;
        }
        System.out.println(vysledok);
    }

     static void prepisanieNaWhile(){

        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
    }
}


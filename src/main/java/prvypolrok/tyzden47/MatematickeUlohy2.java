package prvypolrok.tyzden47;

public class MatematickeUlohy2 {

    public static void main(String[] args) {
        int[] pole = new int[]{1, 46, 4, 34, 5, 76, 44, 34, 5, 6, 6, 77,9,81,74,4 ,41,21,11,2,3,9,0,88,54,32,990,1258,2,4745,295};
        nic(pole);
        System.out.println(nic(pole));
        System.out.println(nic(new int[]{1, 46, 4, 34, 5, 76, 44, 34, 5, 6, 6, 77,9,81,74,4 ,41,21,11,2,3,9,0,88,54,32,990,1258,2,4745,295}));
    }

    int[] pole = new int[]{1, 46, 4, 34, 5, 76, 44, 34, 5, 6, 6, 77,9,81,74,4 ,41,21,11,2,3,9,0,88,54,32,990,1258,2,4745,295};
    static  int nic(int[] poleTejtoMetody){
        int vysledok = 0;
        for(int i =0; i < poleTejtoMetody.length; i++){
            if (poleTejtoMetody[i] %2==0) {
                if (Math.sqrt(poleTejtoMetody[i]) < 4) {
                    vysledok = vysledok + poleTejtoMetody[i];
                }
            }
        }
       //System.out.println(vysledok);
        return vysledok;
    }
}

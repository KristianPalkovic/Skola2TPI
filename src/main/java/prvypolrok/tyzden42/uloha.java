package prvypolrok.tyzden42;

public class uloha {

    public static void main(String[] args) {
        JeNieje(2000);
    }
    static void JeNieje(int x){
        if(x % 2 ==0)
        {
            System.out.println("Cislo " + x + " je parne ");
        }
        else
        {
            System.out.println("Cislo je neparne");
        }
    }
}

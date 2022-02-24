package druhypolrok.tyzden08;

public class Stvoruholnik {

    double stranaA;
    double stranaB;
    public Stvoruholnik(){}

    public Stvoruholnik( double vstupnyAtribut,double vstupnyAtributB) {

        stranaA = vstupnyAtribut;
        stranaB = vstupnyAtributB;

        if (vstupnyAtribut > 0) {
            stranaA = vstupnyAtribut;
            stranaB = vstupnyAtributB;
        } else {
            stranaA = 0;
            stranaB = 0;
        }
    }

    public double obvod(){
        return 2*(stranaA + stranaB);

    }

    public double obsah(){
        return(stranaB * stranaA);
    }

    @Override
    public String toString() {
        return "Stvoruholnik{" +
                "stranaA=" + stranaA +
                ", stranaB=" + stranaB +
                '}';
    }
}

package druhypolrok.tyzden08;

public class Trojuholnik {

    double stranaA;
    double stranaB;
    double stranaC;
    public Trojuholnik(){}

    public Trojuholnik( double vstupnyAtribut, double vstupnyAtribut1, double vstupnyAtributC) {

        stranaA = vstupnyAtribut;
        stranaB = vstupnyAtribut1;
        stranaC = vstupnyAtributC;

        if (vstupnyAtribut > 0) {
            stranaA = vstupnyAtribut;
            stranaB = vstupnyAtribut1;
            stranaC = vstupnyAtributC;
        } else {
            stranaA = 0;
            stranaB = 0;
            stranaC = 0;
        }
    }

    public double obvodT(){
        return (stranaA + stranaB + stranaC);

    }

    public double obsahT(){
        return (stranaA + stranaB + stranaC)/2;
    }

    @Override
    public String toString() {
        return "Trojuholnik{" +
                "stranaA=" + stranaA +
                ", stranaB=" + stranaB +
                ", stranaC=" + stranaC +
                '}';
    }
}

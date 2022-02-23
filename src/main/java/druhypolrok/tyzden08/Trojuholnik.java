package druhypolrok.tyzden08;

public class Trojuholnik {

    double stranaA;
    double stranaB;
    double stranaC;
    double vyskaA;

    public double obvodT(){
        return (stranaA + stranaB + stranaC);

    }

    public double obsahT(){
        return (stranaA * vyskaA)/2;
    }

    @Override
    public String toString() {
        return "Trojuholnik{" +
                "stranaA=" + stranaA +
                ", stranaB=" + stranaB +
                ", stranaC=" + stranaC +
                ", vyskaA=" + vyskaA +
                '}';
    }
}

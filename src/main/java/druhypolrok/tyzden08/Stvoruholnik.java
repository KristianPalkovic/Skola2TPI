package druhypolrok.tyzden08;

public class Stvoruholnik {

    double stranaA;
    double stranaB;

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

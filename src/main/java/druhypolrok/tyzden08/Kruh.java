package druhypolrok.tyzden08;

public class Kruh {

    double polomerR;
    double pí;

    public double obvodK(){
        return 2* (pí * polomerR);

    }

    public double obsah(){
        return 2*(pí *(polomerR * polomerR));

    }

    @Override
    public String toString() {
        return "Kruh{" +
                "polomerR=" + polomerR +
                ", pí=" + pí +
                '}';
    }
}

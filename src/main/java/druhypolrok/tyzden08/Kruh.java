package druhypolrok.tyzden08;

public class Kruh {

    double polomerR;
    double pí = Math.PI;
    public Kruh(){}

    public Kruh( double vstupnyAtribut) {

        polomerR = vstupnyAtribut;

        if (vstupnyAtribut > 0) {
            polomerR = vstupnyAtribut;
        } else {
            polomerR = 0;
        }
    }

    public double obvodK(){
        return 2* (pí * polomerR);

    }

    public double obsahK(){
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

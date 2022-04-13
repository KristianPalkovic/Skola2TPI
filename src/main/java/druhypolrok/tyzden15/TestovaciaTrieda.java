package druhypolrok.tyzden15;

public class TestovaciaTrieda {

    int neco;
    String y;
    double i;

    public TestovaciaTrieda(){

    }

    public TestovaciaTrieda(int neco, String y, double i){
        if(neco > 0){
            this.neco = neco;
        }else{
            this.neco=0;
        }
        this.neco = neco;
        this.y = y;
        this.i = i;
    }
}
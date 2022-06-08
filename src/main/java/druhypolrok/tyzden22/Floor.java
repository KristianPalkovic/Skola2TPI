package druhypolrok.tyzden22;

public class Floor {

    double width;
    double length;

    public double getArea(){
        double obsah;
        obsah = length * width;

        return obsah;
    }

    public Floor(double dlzka, double sirka){

        length = dlzka;
        width = sirka;

        if(dlzka < 0){
             length = 0;
        }else{
            length = dlzka;
        }

        if(sirka < 0){
            width = 0;
        }else{
            width = sirka;
        }

    }
}
import java.util.ArrayList;
import java.util.List;

public class Truck extends PhuongTien{

    private float loadWeight;

    public Truck(String ID, String brand, int publishYear, float price, String color,float loadWeight) {
        super(ID, brand, publishYear, price, color);
        this.loadWeight=loadWeight;
    }

    public float getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(float loadWeight) {
        this.loadWeight = loadWeight;
    }

    private List<PhuongTien> xeList;
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Load Weight" + loadWeight);




    }



}

import java.util.ArrayList;
import java.util.List;

public class Motorbike extends PhuongTien{

    private  String capacity;

    public Motorbike(String ID, String brand, int publishYear, float price, String color,String capacity) {
        super(ID, brand, publishYear, price, color);
    this.capacity=capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Capacity" + capacity);




    }
}

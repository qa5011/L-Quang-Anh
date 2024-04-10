import java.util.ArrayList;
import java.util.List;

public class PhuongTien implements Icar {

    protected String ID;

    protected String brand;

    protected int publishYear;

    protected float price;

    protected String color;

    public PhuongTien(String ID, String brand, int publishYear, float price, String color) {
        this.ID = ID;
        this.brand = brand;
        this.publishYear = publishYear;
        this.price = price;
        this.color = color;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void showInfo() {
        System.out.println("ID" + ID);
        System.out.println("brand" + brand);
        System.out.println("Publish year" + publishYear);
        System.out.println("Price" + price);
        System.out.println("Color" + color);


    }

    private List<PhuongTien> xeList;


    public PhuongTien() {


        xeList = new ArrayList<>();
    }

    public void addXe(PhuongTien xe) {
        xeList.add(xe);
    }


    public void displayAllEmployees() {
        for (PhuongTien xe : xeList) {
            xe.showInfo();
            System.out.println();
        }
    }




    public void deleteXe(String ID) {
        for (int i = 0; i < xeList.size(); i++) {
            if (xeList.get(i).getID().equals(ID)) {
                xeList.remove(i);
                return;
            }
        }
        System.out.println("Phuong tien with ID " + ID + " not found.");
    }
}

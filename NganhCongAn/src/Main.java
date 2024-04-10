import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Car car= new Car("Wonyoung1234","Senka",2004,1000000000,"Black",9,"Ko bieest");
Motorbike motorbike = new Motorbike("Linda1234","PapaRecipe",2004,1000000000,"Black","Strong");
Truck truck = new Truck("Linda1234","PapaRecipe",2004,1000000000,"Black",100);

car.showInfo();
        System.out.println();
motorbike.showInfo();
        System.out.println();
truck.showInfo();
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        PhuongTien pt = new PhuongTien();

        char choice;

        do {
            System.out.println("\nChương trình quản lý sinh viên");
            System.out.println("a.Add ");
            System.out.println("b.Read");
            System.out.println("c. Delete");
            System.out.println("d. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case 'a':
                    System.out.println("Nhập ID: ");
                    String ID = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Nhập brand: ");
                    String brand = scanner.nextLine();
                    System.out.println("Nhập nam san xuat: ");
                    int publishYear = scanner.nextInt();
                    System.out.println("Nhập gia: ");
                    float price = scanner.nextFloat();
                    System.out.println("Nhập mau: ");
                    String color = scanner.nextLine();
                    pt.addXe(new PhuongTien(ID,brand,publishYear,price,color));
                    break;

                case 'b':
                    pt.displayAllEmployees();
                    break;


                case 'c':
                    System.out.println("Nhập ID cần tìm: ");
                    String id = scanner.next();
                  pt.deleteXe(id);
                    break;

                case 'd':
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ");
            }
        } while (choice != 'e');

        scanner.close();
    }



    }

package class10;

import java.util.Scanner;

public class ThuVien {
    String id;
    String name;
    int number;

    public ThuVien(String id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public ThuVien() {
        this.id = "";
        this.name = "";
        this.number = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        id = input.nextLine();
        System.out.println("Nhap ten: ");
        name = input.nextLine();
        System.out.println("Nhap so ban hanh: ");
        number = input.nextInt();

    }
    public void display(){
        System.out.println("Ma : "+ id);
        System.out.println("Ten : "+ name);
        System.out.println("So ban : "+ number);

    }

    public void display(ThuVien thuVien){
        System.out.println("Ma : "+ id);
        System.out.println("Ten : "+ name);
        System.out.println("So ban : "+ number);

    }

}

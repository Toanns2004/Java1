package class10;

import java.util.Scanner;

public class Bao extends ThuVien {
    int ngay;
    public Bao() {
        super();
        this.ngay =0;
    }

    @Override
    public void input() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ngay phat hanh: ");
        ngay = input.nextInt();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Ngay phat hanh: "+ngay);
    }
}

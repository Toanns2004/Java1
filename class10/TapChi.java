package class10;

import java.util.Scanner;

public class TapChi extends ThuVien{
    int soPhatHanh;
    int thang;

    public TapChi() {
        super();
        this.soPhatHanh =0;
        this.thang = 0;
    }
    @Override
    public void input() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so phat hanh: ");
        soPhatHanh = input.nextInt();
        System.out.println("Nhap thang phat hanh: ");
        thang = input.nextInt();

    }

    @Override
    public void display(){
        super.display();
        System.out.println("So phat hanh: "+soPhatHanh);
        System.out.println("Thang phat hanh: "+thang);
    }


}
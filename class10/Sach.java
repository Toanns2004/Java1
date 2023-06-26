package class10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sach extends ThuVien{

    String tacGia;
    int soTrang;

    public Sach() {
        super();
        this.tacGia = "";
        this.soTrang = 0;
    }
    @Override
    public void input() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten tac gia: ");
        tacGia = input.nextLine();
        System.out.println("Nhap so trang: ");
        soTrang = input.nextInt();

    }
    @Override
    public void display(){
        super.display();
        System.out.println("Ten tac gia "+tacGia);
        System.out.println("So trang: "+soTrang);
    }

}

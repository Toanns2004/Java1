package class10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLy {
    List<ThuVien> list = new ArrayList<ThuVien>();
    List<Sach> sachList = new ArrayList<Sach>();
    List<TapChi> tapChiList = new ArrayList<TapChi>();
    List<Bao> baoList = new ArrayList<Bao>();

    public void add() throws Exception {
        try {
            Scanner input = new Scanner(System.in);


            int a = 0;
            do {
                System.out.println("1. Them sach");
                System.out.println("2. Them tap chi");
                System.out.println("3. Them bao");
                System.out.println("4. Thoat");
                System.out.print("Chon: ");
                a = input.nextInt();
                if (a == 1) {
                    Sach sach = new Sach();
                    sach.input();
                    list.add(sach);
                    sachList.add(sach);
                } else if (a == 2) {
                    TapChi tapChi = new TapChi();
                    tapChi.input();
                    list.add(tapChi);
                    tapChiList.add(tapChi);
                } else if (a == 3) {
                    Bao bao = new Bao();
                    bao.input();
                    list.add(bao);
                    baoList.add(bao);
                }
            } while (a != 4);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(String id)  {
        try {
            for (ThuVien i : list) {
                if (id.equals(i.getId())) {
                    list.remove(i);
                    System.out.println("Xoa thanh cong");
                }else {
                    System.out.println("Khong ton tai");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void diplayAll() {
        try {
            for (ThuVien i: list){
                i.display();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void search() throws Exception {
        try {
            Scanner input = new Scanner(System.in);
            int c = 0;
            do {
                System.out.println("1. Xem sach");
                System.out.println("2. Xem tap chi");
                System.out.println("3. Xem bao");
                System.out.println("4. Thoat");
                System.out.print("Chon: ");
                c = input.nextInt();
                switch (c) {
                    case 1: {
                        for (Sach sach: sachList){
                            sach.display();
                        }
                    }
                    break;
                    case 2: {
                        for (TapChi tapChi: tapChiList){
                            tapChi.display();
                        }
                    }
                    break;
                    case 3: {
                        for (Bao bao: baoList){
                            bao.display();
                        }
                    }
                    break;
                }
            } while (c != 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

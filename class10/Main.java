package class10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy();
        try {
            Scanner input = new Scanner(System.in);
            int a;
            do {
                System.out.println("1. Them moi ta lieu");
                System.out.println("2. Xoa tai lieu");
                System.out.println("3. Hien thi thong tin tai lieu");
                System.out.println("4. Tim kiem tai lieu theo loai");
                System.out.println("5.Thoat");
                System.out.print("Chon: ");
                a = input.nextInt();
                switch (a) {
                    case 1: {
                        quanLy.add();
                        break;
                    }
                    case 2: {
                        System.out.print("Nhap ID: ");
                        Scanner in = new Scanner(System.in);
                        String id = in.nextLine();
                        quanLy.delete(id);
                    }
                        break;
                    case 3: {
                        quanLy.diplayAll();
                    }
                        break;
                    case 4: {
                        quanLy.search();
                    }
                        break;
                    case 5:{
                        return;
                    }

                }
            } while (true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

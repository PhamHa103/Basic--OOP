package Bai5;

import java.sql.SQLOutput;

public class MainRun {
    public static void main(String[] args) {
        System.out.println("Nhập phân số thứ nhất: ");
        PhanSo ps1 = new PhanSo();
        System.out.println("Nhập phân số thứ hai: ");
        PhanSo ps2 = new PhanSo();
        System.out.println( ps1.cong(ps2));
        System.out.println( ps1.tru(ps2));
        System.out.println( ps1.nhan(ps2));
        System.out.println( ps1.chia(ps2));
        System.out.println(ps1.toiGian("nhất"));
        System.out.println(ps2.toiGian("hai"));
        System.out.println("---------------------");
        soSanhHaiPhanSo(ps1,ps2);
    }

    private static void soSanhHaiPhanSo(PhanSo ps1,PhanSo ps2) {
        System.out.println("SO SÁNH HAI PHÂN SỐ");
        if (ps1.lonHon(ps2)>0)
            System.out.println("Phân số thứ nhất lớn hơn phân số thứ hai");
        else if (ps1.lonHon(ps2)<0)
            System.out.println("Phân số thứ nhất nhỏ hơn phân số thứ hai");
        else
            System.out.println("Hai phân số bằng nhau");
    }
}

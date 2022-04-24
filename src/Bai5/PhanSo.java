package Bai5;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PhanSo {
    private int ts;
    private int ms;

    public PhanSo(String message) {
        System.out.println(message);
    }

    public PhanSo() {
        System.out.println("Nhập vào tử số: ");
        this.ts = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào mẫu số: ");
        this.ms = new Scanner(System.in).nextInt();
    }

    public PhanSo(int ts, int ms) {
        this.ts = ts;
        this.ms = ms;
    }
    public PhanSo cong(PhanSo sp2){
        PhanSo phanSo = new PhanSo("Tổng hai phân số là: ");
        if (this.ms==sp2.ms) {
            phanSo.ms = this.ms;
            phanSo.ts = this.ts + sp2.ts;
        }
        else {
            phanSo.ts = this.ts * sp2.ms + this.ms * sp2.ts;
            phanSo.ms = this.ms * sp2.ms;
        }
        int temp = (phanSo.ts>phanSo.ms)?phanSo.ms:phanSo.ts;
        int ucln = 1;
        for (int i = 1; i <= temp; i++) {
            if (phanSo.ts%i==0&&phanSo.ms%i==0){
                ucln = i;
            }
        }
        phanSo.ts/=ucln;
        phanSo.ms/=ucln;
        return phanSo;
    }
    public PhanSo tru(PhanSo sp2){
        PhanSo phanSo = new PhanSo("Hiệu hai phân số là: ");
        if (this.ms==sp2.ms) {
            phanSo.ms = this.ms;
            phanSo.ts = this.ts - sp2.ts;
        }
        else {
            phanSo.ts = this.ts * sp2.ms - this.ms * sp2.ts;
            phanSo.ms = this.ms * sp2.ms;
        }
        int temp = (phanSo.ts>phanSo.ms)?phanSo.ms:phanSo.ts;
        int ucln = 1;
        for (int i = 1; i <= temp; i++) {
            if (phanSo.ts%i==0&&phanSo.ms%i==0){
                ucln = i;
            }
        }
        phanSo.ts/=ucln;
        phanSo.ms/=ucln;
        return phanSo;
    }
    public PhanSo nhan(PhanSo sp2){
        PhanSo phanSo = new PhanSo("Phân số tích là: ");
            phanSo.ts = this.ts * sp2.ts ;
            phanSo.ms = this.ms * sp2.ms;
        int temp = (phanSo.ts>phanSo.ms)?phanSo.ms:phanSo.ts;
        int ucln = 1;
        for (int i = 1; i <= temp; i++) {
            if (phanSo.ts%i==0&&phanSo.ms%i==0){
                ucln = i;
            }
        }
        phanSo.ts/=ucln;
        phanSo.ms/=ucln;
        return phanSo;
    }
    public PhanSo chia(PhanSo sp2){
        PhanSo phanSo = new PhanSo("Phân số thương là: ");
            phanSo.ts = this.ts * sp2.ms;
            phanSo.ms = this.ms * sp2.ts;
        int temp = (phanSo.ts>phanSo.ms)?phanSo.ms:phanSo.ts;
        int ucln = 1;
        for (int i = 1; i <= temp; i++) {
            if (phanSo.ts%i==0&&phanSo.ms%i==0){
                ucln = i;
            }
        }
        phanSo.ts/=ucln;
        phanSo.ms/=ucln;
        return phanSo;
    }
    public PhanSo toiGian(String index){
        PhanSo phanSo = new PhanSo("Phân số tối giản của phân số thứ "+index+" là: ");
        phanSo.ts = this.ts;
        phanSo.ms = this.ms;
         int temp = (phanSo.ts>phanSo.ms)?ms:ts;
         int ucln = 1;
        for (int i = 1; i <= temp; i++) {
            if (phanSo.ts%i==0&&phanSo.ms%i==0){
                ucln = i;
            }
        }
        phanSo.ts/=ucln;
        phanSo.ms/=ucln;
        return phanSo;
    }
    public int lonHon(PhanSo sp2){
        if (this.ms==sp2.ms) {
            if (this.ts>sp2.ts)
                return 1;
            else if (this.ts<sp2.ts)
                return -1;
            else
                return 0;
        }
        else {
            if (this.ts*sp2.ms>sp2.ts*this.ms)
                return 1;
            else if (this.ts*sp2.ms<sp2.ts*this.ms)
                return -1;
            else
                return 0;
        }
    }

    public void hien(){
        System.out.println("Phân số là: "+this.ts +"/"+this.ms);
    }
    public void nhap(){
        System.out.print("Nhập vào phân số dưới dạng ts/ms: ");
        String inputPs = new Scanner(System.in).nextLine();
        String tu = inputPs.substring(0,inputPs.indexOf('/'));
        int ts = Integer.parseInt(tu);
        String mau = inputPs.substring(inputPs.indexOf('/')+1,inputPs.length());
        int ms = Integer.parseInt(mau);
        System.out.println("Phân số vừa nhập là: "+ts+"/"+ms);
    }


    @Override
    public String toString() {
        return "PhanSo{" +
                "ts=" + ts +
                ", ms=" + ms +
                '}';
    }
}

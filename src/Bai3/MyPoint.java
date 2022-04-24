package Bai3;

import java.util.Scanner;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){

    }
    public MyPoint(int index) {
        System.out.println("Nhập vào tọa độ điểm p "+ (index+1));
        System.out.println("Tọa độ x của điểm p " + (index+1)+ " là: ");
        this.x = new Scanner(System.in).nextDouble();
        System.out.println("Tọa độ y của điểm p " + (index+1)+ " là: ");
        this.y = new Scanner(System.in).nextDouble();
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public MyPoint(MyPoint p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(MyPoint secondPoint){
        return Math.sqrt(Math.pow(this.x-secondPoint.getX(),2)+Math.pow(this.y-secondPoint.getY(),2));
    }

    public double distance(MyPoint p1, MyPoint p2){
        return Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)+Math.pow(p1.getY()-p2.getY(),2));
    }
}

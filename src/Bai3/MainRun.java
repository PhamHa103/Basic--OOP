package Bai3;

import java.util.Scanner;

public class MainRun {
    public static MyPoint[] myPoints = new MyPoint[100];

    public static void main(String[] args) {
        System.out.println("Số điểm bạn muốn nhập vào màn hình là: ");
        int pointNumber = new Scanner(System.in).nextInt();
        createMyPointArray(pointNumber);
        System.out.println("Các điểm đã nhập vào là: ");
        printMyPointArray(myPoints);
        twoPointDistanceMin(myPoints);
        System.out.println(checkTamGiac(myPoints));
    }

    public static void createMyPointArray(int pointNumber) {
        for (int i = 0; i < pointNumber; i++) {
            if (myPoints[i] == null)
                myPoints[i] = new MyPoint(i);
        }
    }

    public static void printMyPointArray(MyPoint[] myPoints) {
        for (int i = 0; i < myPoints.length; i++) {
            if (myPoints[i] != null)
                System.out.println(myPoints[i].toString());
        }
    }

    public static void twoPointDistanceMin(MyPoint[] myPoints) {
        double max = 0;
        MyPoint maxMyPoint1 = new MyPoint();
        MyPoint maxMyPoint2 = new MyPoint();
        for (int i = 0; i < myPoints.length - 1; i++) {
            for (int j = 1; j < myPoints.length; j++) {
                if (myPoints[i] == null || myPoints[j] == null)
                    continue;
                if (myPoints[i].distance(myPoints[i], myPoints[j]) > max) {
                    max = myPoints[i].distance(myPoints[i], myPoints[j]);
                    maxMyPoint1 = myPoints[i];
                    maxMyPoint2 = myPoints[j];
                }
            }
        }
        System.out.println("Hai điểm có khoảng cách lớn nhất là: ");
        System.out.println(maxMyPoint1.toString());
        System.out.println(maxMyPoint2.toString());
        System.out.println("Với khoảng cách lớn nhất là: " + max);
    }

    public static String checkTamGiac(MyPoint[] myPoints) {
        String result = "";
        double a = -1;
        double b = -1;
        double c = -1;
        for (int i = 0; i < myPoints.length - 1; i++) {
            for (int j = i+1; j < myPoints.length; j++) {
                if (myPoints[i] == null || myPoints[j] == null)
                    continue;
                if (a == -1)
                    a = myPoints[i].distance(myPoints[i], myPoints[j]);
                else if (b == -1)
                    b = myPoints[i].distance(myPoints[i], myPoints[j]);
                else {
                    c = myPoints[i].distance(myPoints[i], myPoints[j]);
                    break;
                }
                if (c!=-1)
                    break;
            }
        }
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c)
                result = "Ba điểm đã nhập tạo thành \"tam giac đều\"";
            else if (a == b || b == c || c == a) {
                if ((int)(a * a + b * b) == (int)(c * c) || (int)(a * a + c * c) == (int)(b * b) || (int)(b * b + c * c) == (int)(a * a))
                    result = "Ba điểm đã nhập tạo thành \"tam giac vuông cân\"";
                else
                   result = "Ba điểm đã nhập tạo thành \"tam giac cân\"";
            } else if ((int)(a * a + b * b) == (int)(c * c) || (int)(a * a + c * c) == (int)(b * b) || (int)(b * b + c * c) == (int)(a * a))
                result = "Ba điểm đã nhập tạo thành \"tam giac vuông\"";
            else
                result = "Ba điểm đã nhập tạo thành \"tam giac thường\"";
        } else
            result = "Ba điểm đã nhập tạo thành \"một đường thẳng\"";
        return result;
    }
}


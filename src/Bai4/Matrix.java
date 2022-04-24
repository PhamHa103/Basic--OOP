package Bai4;

import java.util.Scanner;

public class Matrix {
    public float[][] a;

    public Matrix() {
        this.a = a;
    }

    public Matrix(String message){
        System.out.println(message);
        this.input();
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < this.a[0].length; j++) {
                System.out.print("Matrix["+i+","+j+"]=");
                this.a[i][j] = new Scanner(System.in).nextFloat();
            }
        }
    }

    public Matrix(int number) {
        this.a = new float[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matrix["+i+","+j+"]=");
                this.a[i][j] = new Scanner(System.in).nextFloat();
            }
        }
    }

    public float[][] getA() {
        return a;
    }

    public void setA(float[][] a) {
        this.a = a;
    }

    public Matrix(int rows, int cols) {
        this.a = new float[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Matrix["+i+","+j+"]=");
                this.a[i][j] = new Scanner(System.in).nextFloat();
            }
        }
    }

    public Matrix sub(Matrix m){
        if (this.a.length!=m.a.length||this.a[0].length!=m.a[0].length)
            return null;
        Matrix subMatrix = new Matrix();
        subMatrix.setA(new float[m.a.length][m.a[0].length]);
        for (int i = 0; i < m.a.length; i++) {
            for (int j = 0; j < m.a[0].length; j++) {
                subMatrix.a[i][j] = m.a[i][j] - this.a[i][j];
            }
        }
        return subMatrix;
    }
    public Matrix add(Matrix m){
        if (this.a.length!=m.a.length||this.a[0].length!=m.a[0].length)
            return null;
        Matrix addMatrix = new Matrix();
        addMatrix.setA(new float[m.a.length][m.a[0].length]);
        for (int i = 0; i < m.a.length; i++) {
            for (int j = 0; j < m.a[0].length; j++) {
                addMatrix.a[i][j] = m.a[i][j] + this.a[i][j];
            }
        }
        return addMatrix;
    }
    public Matrix neg(){
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < this.a[0].length; j++) {
                this.a[i][j] = - this.a[i][j];
            }
        }
        return this;
    }
    public Matrix transpose(){
        Matrix matrix = new Matrix();
        matrix.setA(new float[this.a[0].length][this.a.length]);
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < this.a[0].length; j++) {
                matrix.a[j][i] = this.a[i][j];
            }
        }
        return matrix;
    }
    public Matrix mul(Matrix m){
        Matrix mulMatrix = new Matrix();
        mulMatrix.setA(new float[this.a.length][m.a[0].length]);
        if(this.a[0].length != m.a.length)
            mulMatrix = null;
        else {
            for (int i = 0; i < mulMatrix.a.length; i++) {
                for (int j = 0; j < mulMatrix.a[0].length; j++) {
                    for (int k = 0; k <this.a[0].length; k++) {
                        mulMatrix.a[i][j] = this.a[i][k]+m.a[k][j];
                    }
                }
            }
        }
        return mulMatrix;
    }
    public void print(String message){
        System.out.println(message);
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < this.a[0].length; j++) {
                System.out.print(this.a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void input(){
        System.out.print("Nhập vào số hàng của ma trận: ");
        int row = new Scanner(System.in).nextInt();
        System.out.print("Nhập vào số cột của ma trận: ");
        int column = new Scanner(System.in).nextInt();
        this.setA(new float[row][column]);
    }
}

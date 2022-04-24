package Bai2;

public class Rectangle {
    private double width;
    private double height;
    private String color;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double findArea(){
        return this.width*this.height;
    }
    public double findPerimeter(){
        return (this.width + this.height)*2;
    }

    @Override
    public String toString() {
        return "Hình chữ nhật vừa nhâp có: " +
                "chiều rộng = " + width +
                ", chiều dài = " + height +
                ", màu '" + color + '\'';
    }
}

package Bai1;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private String classNumber;
    private String group;
    public ClassStudent classStudent;

    public Student() {
        System.out.println("Xin mời nhập mã sinh viên:");
        this.id = new Scanner(System.in).nextLine();
        System.out.println("Xin mời nhập tên của sinh viên:");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Danh sách các lớp của sinh viên");
        System.out.println("1.Lớp 9A");
        System.out.println("2.Lớp 9B");
        System.out.println("3.Lớp 9C");
        int choice;
        do {
            System.out.print("Xin mời bạn chọn số tương ứng với lớp: ");
            choice = new Scanner(System.in).nextInt();
            if (choice > 0 && choice < 4)
                break;
            System.out.println("Bạn nhập sai rồi xin mời bạn nhập lại!");
        } while (choice <= 0 || choice >= 4);
        switch (choice){
            case 1:
                this.classNumber = ClassStudent.LOP_9A.value;
                break;
            case 2:
                this.classNumber = ClassStudent.LOP_9B.value;
                break;
            case 3:
                this.classNumber = ClassStudent.LOP_9C.value;
                break;
        }
        System.out.println("Xin mời nhập khoa:");
        this.group = new Scanner(System.in).nextLine();
    }

    public void showSinhVien(){
        System.out.println("Danh sách sinh viên đã nhập vào là:");
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lop='" + classNumber + '\'' +
                ", khoa='" + group + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassNumber() {
        return this.classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}

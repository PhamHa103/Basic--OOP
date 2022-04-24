package Bai1;

import java.util.Scanner;

public class MainRun {
    public static Student[] students = new Student[100];

    public static void main(String[] args) {
        //Tạo danh sách sinh viên và in ra
        inputStudents();
        printStudents(students, "Danh sach sinh viên vừa nhập là: ");
        //Sắp xếp danh sách theo tên
        String[] nameStudent = addNametoArray(students);
        arrangerStudent(nameStudent, students);
        printStudents(students, "Danh sách sinh viên sau khi sắp xếp theo tên là: ");
        //Sắp xếp in danh sách theo lớp
        printStudentsOfClass(students,ClassStudent.LOP_9A);
        printStudentsOfClass(students,ClassStudent.LOP_9B);
        printStudentsOfClass(students,ClassStudent.LOP_9C);
    }

    public static String[] addNametoArray(Student[] students) {
        String[] nameStudent = new String[students.length];

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null)
                nameStudent[i] = students[i].getName();
        }
        return nameStudent;
    }

    public static void inputStudents() {
        System.out.println("Số lượng sinh viên muốn nhập vào là: ");
        int studentNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < studentNumber; i++) {
            if (students[i] == null) {
                System.out.println("Nhập vào thông tin sinh viên thứ " + (i + 1));
                students[i] = new Student();
            }
        }
    }

    public static void printStudentsOfClass(Student[] students, ClassStudent classValue) {
        System.out.println("Danh sách sinh viên của " + classValue.value );
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            }
            if (students[i].getClassNumber() == classValue.value)
                System.out.println(students[i].toString());
        }
    }

    public static void printStudents(Student[] students, String inputMessage) {
        System.out.println(inputMessage);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            }
            System.out.println(students[i].toString());
        }
    }

    public static void arrangerStudent(String[] strings, Student[] students) {
        int index = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null) {
                index = i;
                break;
            }
        }
        for (int i = 0; i < index - 1; i++) {
            for (int j = i + 1; j < index; j++) {
                if (strings[i].compareTo(strings[j]) > 0) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                    // Sắp xếp thứ tự sinh viên theo tên
                    Student tempStudent = students[i];
                    students[i] = students[j];
                    students[j] = tempStudent;
                }
            }
        }
    }

}

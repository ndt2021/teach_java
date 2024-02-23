package chuong3.phan1;

import java.util.Scanner;

public class Lesson31 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Họ và tên sinh viên: ");
        var fullName = scanner.nextLine();
        System.out.println("Nhập điểm gpa: ");
        var gpa = scanner.nextFloat();

        if (gpa >4.0 || gpa <0){
            System.out.println("khong hop le");
        }else if(gpa >= 3.6){
            System.out.println("hoc bong xuat sac");
        } else if (gpa >=3.2) {
            System.out.println("gioi");
        } else if (gpa >=3.0) {
            System.out.println("kha");
        }else {
            System.out.println("khong co hoc bong");
        }


    }
}

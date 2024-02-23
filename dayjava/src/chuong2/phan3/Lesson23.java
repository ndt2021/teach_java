package chuong2.phan3;

import java.util.Scanner;

public class Lesson23 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in); // biến nhập dữ liệu từ bàn phím

        System.out.println("Họ và tên: ");
        var fullName = scanner.nextLine();
        System.out.println("Điểm gpa: ");
        var gpa = scanner.nextFloat();
        System.out.println("Mức lương: ");
        var salary = scanner.nextDouble();

        // hiển thị ra màn hình:
        System.out.println("Họ và tên" + fullName);
        System.out.println("Điểm GPA: " + gpa);
        System.out.println("Mức lương" + salary);


//        System.out.printf("Họ và tên: %-30s\n", fullName);
//        System.out.printf("Điểm GPA: %-10.2f\n", gpa);
//        // định dạng giá trị số phân tách bởi dấu phẩy ở phần nghìn, lẻ thập phân
//        var formatter = new DecimalFormat("#,###.##");
//        System.out.printf("Mức lương: %sđ\n", formatter.format(salary));

    }
}

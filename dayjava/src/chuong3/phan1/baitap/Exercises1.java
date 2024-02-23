package chuong3.phan1.baitap;

import java.util.Scanner;

public class Exercises1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        double number1;
        double number2;

        // nhập dữ liệu vào
        number1 = scanner.nextDouble();
        number2 = scanner.nextDouble();

        // kết luận
        if (number1 < number2) {
            System.out.println(number1 + " < " + number2);
        } else if (number1 == number2) {
            System.out.println(number1 + " = " + number2);
        } else {
            System.out.println(number1 + " > " + number2);
        }
    }
}

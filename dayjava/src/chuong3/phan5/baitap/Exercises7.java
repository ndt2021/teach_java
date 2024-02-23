package chuong3.phan5.baitap;

import java.util.Scanner;

public class Exercises7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var a = input.nextInt(); // nhập a
        var b = input.nextInt(); // nhập b

        // xét lần lượt từng phần tử
        for (int i = a; i <= b; i++) {

            boolean isPrime = true;
            if (i < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) { // nếu i có ước là j
                        isPrime = false;
                    }
                }
            }

            // nếu i là số nguyên tố thì in ra i và phân tách , ngược lại in ra chuỗi rỗng
            System.out.print(isPrime ? i + " " : "");
        }
    }


}
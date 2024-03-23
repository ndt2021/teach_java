package chuong3.phan7.baitap;
import java.util.Scanner;

public class Exercises2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var h = input.nextInt();
        // vẽ tam giác theo hướng: trên hàng thứ i in ra h-i khoảng trắng
        // sau đó trên hàng thứ i in ra i dấu *. Do vuông góc phải dưới
        // nên trên hàng i ta in khoảng trắng nếu chỉ số cột <= h - i
        // ngược lại in dấu *
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h; j++) {
                if (j <= h - i) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
package chuong2.phan8.baitap;
import java.util.Scanner;

public class Exercises5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);


        var a = input.nextInt(); // đọc a
        var b = input.nextInt(); // đọc b

        // tính a / b
        var result = 1.0 * a / b; // ép kiểu để có kết quả chính xác

        // làm tròn kết quả đến số nguyên gần nhất:
        // lẻ >= 0.5 làm tròn lên. ngược lại làm tròn xuống
        System.out.println(Math.round(result));
    }
}
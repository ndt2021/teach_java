package chuong2.phan8.baitap;

import java.util.Scanner;

/*
    Ý tưởng của bài rất đơn giản: Sinh số ngẫu nhiên, nhân kết quả với
    10^(số lượng chữ số của n) để được giá trị có n chữ số. Sau đó ép kiểu sang kiểu nguyên.
    Chia dư của giá trị vừa có cho n được kết quả.
 */

public class Exercises7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt(); // đọc n
        var randNumber = Math.random() * Math.pow(10, countDigitsOfN(n)); // sinh số ngẫu nhiên
        var tmp = (int)randNumber; // ép kiểu sang int
        var result = tmp % n; // lấy dư để đảm bảo kết quả trong [0, n)
        // hiện kết quả:
        System.out.println(result);
    }

    // Phương thức này sử dụng để đếm số chữ số của n,
    // chi tiết về phương thức ta sẽ học ở chương 4
    private static int countDigitsOfN(int n) {
        int count = 1;
        while(n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
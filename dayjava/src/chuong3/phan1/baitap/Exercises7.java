package chuong3.phan1.baitap;

import java.util.Scanner;

/*
    Ý tưởng của bài rất đơn giản: Sinh số ngẫu nhiên, nhân kết quả với
    10^(số lượng chữ số của n) để được giá trị có n chữ số. Sau đó ép kiểu sang kiểu nguyên.
    Chia dư của giá trị vừa có cho n được kết quả.
 */

public class Exercises7 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var fullName = scanner.nextLine().trim();

        // check and print result
        var lastSpaceIndex = fullName.lastIndexOf(" ");
        var firstName = fullName.substring(lastSpaceIndex + 1);
        if (firstName.matches("^[A-Z].*")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
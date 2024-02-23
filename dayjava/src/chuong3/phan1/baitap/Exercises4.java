package chuong3.phan1.baitap;

import java.util.Scanner;

public class Exercises4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();


        // So sánh và kết luận str1 và str2
        var result = str1.compareTo(str2);
        if (result < 0) {
            System.out.println("str1 đứng trước str2");
        } else if (result == 0) {
            System.out.println("str1 tương đương str2");
        } else {
            System.out.println("str1 đứng sau str2");
        }
    }
}

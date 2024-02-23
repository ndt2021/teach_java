package chuong2.phan6.baitap;

import java.util.Scanner;

public class Exercises10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.trim();  // loại bỏ các dấu cách thừa ở đầu và cuối câu
        String[] strSplit = str.split("\\s+"); // tách các từ ra khỏi câu
        for (int i = 0; i < strSplit.length; i++) {
            System.out.println(strSplit[i].toUpperCase() + "-");
        }
    }
}
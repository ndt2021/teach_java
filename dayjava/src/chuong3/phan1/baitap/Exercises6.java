package chuong3.phan1.baitap;

import java.util.Scanner;

public class Exercises6 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = scanner.nextLine();

        // kiểm tra và in ra kết luận
        if(name.matches("^[a-zA-Z\\s]+$")) {
            System.out.println("HỢP LỆ");
        } else {
            System.out.println("KHÔNG HỢP LỆ");
        }
    }
}
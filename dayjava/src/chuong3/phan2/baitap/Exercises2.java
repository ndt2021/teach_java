package chuong3.phan2.baitap;

import java.util.Scanner;

public class Exercises2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var number = input.nextInt();
        var season = ""; // biến lưu tên mùa của năm

        // tiến hành đánh giá với switch
        switch (number) {
            case 1:
            case 2:
            case 3:
                season = "Mùa Xuân";
                break;
            case 4:
            case 5:
            case 6:
                season = "Mùa Hạ";
                break;
            case 7:
            case 8:
            case 9:
                season = "Mùa Thu";
                break;
            case 10:
            case 11:
            case 12:
                season = "Mùa Đông";
                break;
            default:
                System.out.println("KHÔNG HỢP LỆ");
        }

        if (!season.isEmpty()) {
            System.out.println(season);
        }
    }
}
package chuong3.phan2.baitap;

import java.util.Scanner;

public class Exercises3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var day = input.nextInt();
        var month = input.nextInt();

        var zodiac = ""; // biến lưu tên cung hoàng đạo

        // ta xét tháng trước ngày sau vì số tháng ít hơn số ngày
        switch (month) {
            case 1:
                if (0 < day && day < 20) { // 1 - 19/1
                    zodiac = "Ma Kết";
                } else if (day >= 20 && day <= 31) { // 20 - 31/1
                    zodiac = "Bảo Bình";
                } else {
                    System.out.println("Ngày không hợp lệ");
                }
                break;
            case 2:
                if (0 < day && day < 19) { // 1 - 18/2
                    zodiac = "Bảo Bình";
                } else if (day >= 19 && day <= 29) { // 19 - 29/2
                    zodiac = "Song Ngư";
                } else {
                    System.out.println("KHÔNG HỢP LỆ");
                }
                break;
            case 3:
                if (0 < day && day < 21) { // 1 - 20/3
                    zodiac = "Song Ngư";
                } else if (day >= 21 && day <= 31) { // 21 - 31/3
                    zodiac = "Bạch Dương";
                } else {
                    System.out.println("KHÔNG HỢP LỆ");
                }
                break;
            case 4:
                if (0 < day && day < 21) { // 1 - 20/4
                    zodiac = "Bạch Dương";
                } else if (day >= 21 && day <= 30) { // 21 - 30/4
                    zodiac = "Kim Ngưu";
                } else {
                    System.out.println("KHÔNG HỢP LỆ");
                }
                break;
            case 5:
                if (0 < day && day < 21) { // 1 - 20/5
                    zodiac = "Kim Ngưu";
                } else if (day >= 21 && day <= 31) { // 21 - 31/5
                    zodiac = "Song Tử";
                } else {
                    System.out.println("KHÔNG HỢP LỆ");
                }
                break;
            case 6:
                if (0 < day && day < 22) { // 1 - 21/6
                    zodiac = "Song Tử";
                } else if (day >= 22 && day <= 30) { // 22 - 30/6
                    zodiac = "Cự Giải";
                } else {
                    System.out.println("KHÔNG HỢP LỆ");
                }
                break;
            case 7:
                if (0 < day && day < 23) { // 1 - 22/7
                    zodiac = "Cự Giải";
                } else if (day >= 23 && day <= 31) { // 23 - 31/7
                    zodiac = "Sư Tử";
                } else {
                    System.out.println("KHÔNG HỢP LỆ");
                }
                break;
            case 8:
                if (0 < day && day < 23) { // 1 - 22/8
                    zodiac = "Sư Tử";
                } else if (day >= 23 && day <= 31) { // 23 - 31/8
                    zodiac = "Xử Nữ";
                } else {
                    System.out.println("KHÔNG HỢP LỆ");
                }
                break;
            case 9:
                if (0 < day && day < 23) { // 1 - 22/9
                    zodiac = "Xử Nữ";
                } else if (day >= 23 && day <= 30) { // 23 - 30/9
                    zodiac = "Thiên Bình";
                } else {
                    System.out.println("KHÔNG HỢP LỆ");
                }
                break;
            case 10:
                if (0 < day && day < 24) { // 1 - 23/10
                    zodiac = "Thiên Bình";
                } else if (day >= 24 && day <= 31) { // 24 - 31/10
                    zodiac = "Bọ Cạp";
                } else {
                    System.out.println("KHÔNG HỢP LỆ");
                }
                break;
            case 11:
                if (0 < day && day < 23) { // 1 - 22/11
                    zodiac = "Bọ Cạp";
                } else if (day >= 24 && day <= 30) { // 23 - 30/11
                    zodiac = "Nhân Mã";
                } else {
                    System.out.println("KHÔNG HỢP LỆ");
                }
                break;
            case 12:
                if (0 < day && day < 22) { // 1 - 21/12
                    zodiac = "Nhân Mã";
                } else if (day >= 22 && day <= 31) { // 22 - 31/12
                    zodiac = "Ma Kết";
                } else {
                    System.out.println("KHÔNG HỢP LỆ");
                }
                break;
            default:
                System.out.println("KHÔNG HỢP LỆ");
                break;
        }

        if (!zodiac.isEmpty()) {
            System.out.println(zodiac);
        }
    }
}
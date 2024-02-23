package chuong3.phan2.baitap;
import java.util.Scanner;

public class Exercises1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var number = input.nextInt();
        var zodiac = ""; // biến lưu tên con giáp

        // tiến hành đánh giá với switch
        switch (number) {
            case 1:
                zodiac = "Tý";
                break;
            case 2:
                zodiac = "Sửu";
                break;
            case 3:
                zodiac = "Dần";
                break;
            case 4:
                zodiac = "Mão";
                break;
            case 5:
                zodiac = "Thìn";
                break;
            case 6:
                zodiac = "Tỵ";
                break;
            case 7:
                zodiac = "Ngọ";
                break;
            case 8:
                zodiac = "Mùi";
                break;
            case 9:
                zodiac = "Thân";
                break;
            case 10:
                zodiac = "Dậu";
                break;
            case 11:
                zodiac = "Tuất";
                break;
            case 12:
                zodiac = "Hợi";
                break;
            default:
                System.out.println("KHÔNG HỢP LỆ");
        }
        if (!zodiac.isEmpty()) {
            System.out.println(zodiac);
        }
    }
}

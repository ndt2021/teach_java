package chuong3.phan2.baitap;

import java.util.Scanner;

public class Exercises4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var dayOfWeek = input.nextLine();
        var result = ""; // biến lưu kết quả chuyển đổi

        // tiến hành kiểm tra và đánh giá
        dayOfWeek = dayOfWeek.toLowerCase(); // viết thường hết cho dễ so sánh
        dayOfWeek = dayOfWeek.trim(); // loại bỏ hết các dấu cách thừa

        // vào cấu trúc switch
        switch (dayOfWeek) {
            case "thứ hai", "Thứ Hai", "THỨ HAI":
                result = "Monday";
                break;
            case "thứ ba", "Thứ Ba", "THỨ BA":
                result = "Tuesday";
                break;
            case "thứ tư", "Thứ Tư", "THỨ TƯ":
                result = "Wednesday";
                break;
            case "thứ năm", "Thứ Năm", "THỨ NĂM":
                result = "Thursday";
                break;
            case "thứ sáu", "Thứ Sáu", "THỨ SÁU":
                result = "Friday";
                break;
            case "thứ bảy", "Thứ Bảy", "THỨ BẢY":
                result = "Saturday";
                break;
            case "chủ nhật", "Chủ Nhật", "CHỦ NHẬT":
                result = "Sunday";
                break;
            default:
                result = "INVALID DAY OF WEEK";
                break;
        }
        System.out.println(result);
    }
}
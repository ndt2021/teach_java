package bai2.phan6;

import java.util.Locale;

public class Lesson26 {
    public static void main(String[] args) {
        String fullName = "Lê Nguyễn Bảo Ngọc";
        String upperCaseName = fullName.toUpperCase(); // viết hoa toàn bộ chuỗi kí tự
        var lowerCaseName = fullName.toLowerCase(); // viết thường toàn bộ chuỗi kí tự
        // hiển thị kết quả lên màn hình
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Họ và tên viết HOA: " + upperCaseName);
        System.out.println("Họ và tên viết thường: " + lowerCaseName);

   /*     String s = "nguenductu";
        s.toUpperCase();
        System.out.println(s);
*/
        
    }

}

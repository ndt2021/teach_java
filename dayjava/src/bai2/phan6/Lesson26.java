package bai2.phan6;

import java.util.Locale;

public class Lesson26 {
    public static void main(String[] args) {
      /*  String fullName = "Lê Nguyễn Bảo Ngọc";
        String upperCaseName = fullName.toUpperCase(); // viết hoa toàn bộ chuỗi kí tự
        var lowerCaseName = fullName.toLowerCase(); // viết thường toàn bộ chuỗi kí tự
        // hiển thị kết quả lên màn hình
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Họ và tên viết HOA: " + upperCaseName);
        System.out.println("Họ và tên viết thường: " + lowerCaseName);*/

   /*     String s = "nguenductu";
        s.toUpperCase();
        System.out.println(s);
*/

/*        var first = "Tú";
        var last = "Nguyễn";
        var middle = "Đức";
        // cách 1: dùng toán tử +
        var fullName = last + " " + middle + " " + first;
        System.out.println(fullName);
        // cách 2: sử dụng string template
//        fullName = STR."\{last} \{middle} \{first}";
//        System.out.println(fullName);
        // cách 3: sử dụng phương thức nối chuỗi
        fullName = last.concat(" ").concat(middle).concat(" ").concat(first);
        System.out.println(fullName);*/

        // một số kí tự đặc biệt
        var someMessage = "Xin chào bạn 'Hương'";
        System.out.println(someMessage);
        someMessage = "Xin chào bạn \"Hương\"";
        System.out.println(someMessage);
        // \n
        var message = "Where\nare\nyou\nnow?";
        System.out.println(message);
        var tab = "\t";
        System.out.println("tu"+tab+"nguyen");
        // \t
//        message = STR."Welcome\{tab}to\{tab}Branium\{tab}Academy!";
//        System.out.println(message);

        var path = "";
        System.out.println(path);




    }

}

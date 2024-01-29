package bai2.phan6;

import java.util.Locale;

import static java.lang.StringTemplate.STR;

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

/*
        var first = "Tú";
        var last = "Nguyễn";
        var middle = "Đức";
        // cách 1: dùng toán tử +
        var fullName = last + " " + middle + " " + first;
        System.out.println(fullName);
        // cách 2: sử dụng string template
        fullName = STR."\{last} \{middle} \{first}";
        System.out.println(fullName);
        // cách 3: sử dụng phương thức nối chuỗi
        fullName = last.concat(" ").concat(middle).concat(" ").concat(first);
        System.out.println(fullName);
*/

        // một số kí tự đặc biệt
    /*    var someMessage = "Xin chào bạn 'Hương'";
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

        var path = "C:\\Program Files (x86)\\Microsoft SQL Server";
        System.out.println(path);
*/

       /* int A =200;
        int B =600;
        String result = "A+B = " + (A + B);
        System.out.println(result);// "nguyen duc tu"
*/

        var fullName = "Nguyễn Đức Tú";
        System.out.println("do dai cua chuoi fullName: "+ fullName.length());
        System.out.println("Viet Hoa "+ fullName.toUpperCase());
        System.out.println("vi tri" + fullName.indexOf('u'));
        System.out.println("vi tri String"+ fullName.indexOf("gu"));
        System.out.println(fullName.charAt(4));
        String newFullName = fullName.replace('u','h');
        System.out.println(newFullName);

        var message = "           Phong Vân         ";
        System.out.println("Sau khi loại bỏ khoảng trắng thừa:" + message.trim());
        var words = fullName.split("\\s+");
        System.out.println("Số từ trong tên: "+ words.length);

        String nam = "Nam";
        String other = "nam";
        System.out.println(nam.compareTo(other));
        System.out.println(nam.compareToIgnoreCase(other));



    }
}

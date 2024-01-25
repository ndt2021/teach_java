package bai2.phan5;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Lesson25 {
    public static void main(String[] args) {
//        String x = "Hello";
//        String y = x; // tương đương String y = (String)x;
//        System.out.println(y.toUpperCase());

//        int a = 1234567890;
//        float f = a;
//        System.out.println(a - (int)f); // Kết quả -46

//        int x = 200;
//        Integer integer = x;
//        double d = integer.doubleValue();
//        integer.toString();
//        Double doubleX = d;
//        System.out.println(doubleX.longValue());
//        System.out.println(doubleX.isNaN());
//        int y = doubleX.intValue();
//        long l = doubleX.longValue();
//        float f = doubleX.floatValue();
//        double dd = doubleX;

        double x = 2;
        double y = 3;
        double result = x / y; // kết quả 0.6666666(6)
        System.out.println(Math.ceil(result)); // kq = 1.0, lấy phần nguyên được 1
        System.out.println(Math.floor(result)); // kq = 0.0, lấy phần nguyên được 0
        System.out.println(Math.round(result)); // kq = 1
// sử dụng DecimalFormat
        NumberFormat numberFormat = new DecimalFormat("###.#########");
        System.out.println(numberFormat.format(result));
// sử dụng printf và chuỗi chuyển đổi định dạng:
        System.out.printf("%10.9f", result);


    }
}

package chuong2.phan4;

public class Lesson24 {
    public static void main(String[] args) {

//        var sum = a + b; // cộng hai số bình thường
//        var diff = a - b; // trừ số a cho số b
//        // hiện kết quả:
//        System.out.println(a + " + " + b + " = " + sum);
//        System.out.println(a + " - " + b + " = " + diff);
//
//        // cộng âm vô cực với dương vô cực
//        var sumInfinity = Float.NEGATIVE_INFINITY + Float.POSITIVE_INFINITY;
//        System.out.println(sumInfinity);
//        // cộng vô cực cùng dấu -> vô cực cùng dấu
//        System.out.println(Float.NEGATIVE_INFINITY + Float.NEGATIVE_INFINITY);
//        System.out.println(Float.POSITIVE_INFINITY + Float.POSITIVE_INFINITY);
//        // cộng vô cực với số cụ thể -> vô cực
//        System.out.println(Float.POSITIVE_INFINITY + a);
//        System.out.println(Float.NEGATIVE_INFINITY + a);
//        // trừ vô cực cho vô cực đuợc NaN
//        System.out.println(Float.NEGATIVE_INFINITY - Float.NEGATIVE_INFINITY);
//        System.out.println(Float.POSITIVE_INFINITY - Float.POSITIVE_INFINITY);
//        // trừ vô cực với số cụ thể -> vô cực
//        System.out.println(Float.POSITIVE_INFINITY - a);
//        System.out.println(Float.NEGATIVE_INFINITY - a);

//        var a = 100;
//        var b = 250.25;
//        // phép nối chuỗi
//        System.out.println("Result: " + (a + b));
//        System.out.println("Result: " + a + b);
//        var c = -999L; // long
//
//        var result = a * b * c;
//        System.out.println(a + " * " + b + " * " + c + " = " + result);
//        System.out.println(b * Float.NaN);
//        System.out.println(Double.NaN * Float.NaN);
//        System.out.println(Double.POSITIVE_INFINITY * Float.NaN);
//        System.out.println(Double.POSITIVE_INFINITY * Double.NEGATIVE_INFINITY);
//        System.out.println(Double.POSITIVE_INFINITY * Double.POSITIVE_INFINITY);
//        System.out.println(Double.NEGATIVE_INFINITY * Double.NEGATIVE_INFINITY);

//        var a = 100; // int
//        var b = -250.25; // double
//        var c = -999L; // long
//
//        var result = a / b;
//        System.out.println(result);
//        System.out.println("1 / 2 = " + (1 * 1.0 / 2) );
//        System.out.println(-1f/0); // -infinity
//        System.out.println(1f/0);  // +infinity
    //    System.out.println(5 / 0); // error

        //5%2=1

//        var a = 100; // int
//        var b = -250.25; // double
//        var c = -999L; // long
//
//        System.out.println(-20.333 % -3);
//        System.out.println(a % b); // 100%-250.25
//        System.out.println(a % c);
//        System.out.println(b % 0);
//        System.out.println(a % 0);

//        int a =100;
//        int afterA = ++a;
//        // int afterA ; a=a+1; afterA = a = 101
//        System.out.println("afterA = " + afterA);
//
//        int b =200;
//        int afterB = b++; // afterB=b ; b=b+1;
//        // int afterA ; a=a+1; afterA = a = 101
//        System.out.println("afterB = " + afterB);
//
//        a+=5; // a=a+5
//        a/=5; //a=a/5

//        int a = 5;
//        int b = 6;
//        System.out.println("a = " + a);
//        a = a + 5; // tương đương a += 5
//        System.out.println("a = " + a);
//        a = a - 5; // tương đương a -= 5
//        System.out.println("a = " + a);
//        a = a * 5; // tương đương a *= 5
//        System.out.println("a = " + a);
//        a = a / 5; // tương đương a /= 5
//        System.out.println("a = " + a);
//        a = a % 5; // tương đương a %= 5
//        System.out.println("a = " + a);

//        int a = 5;
//        int b = 6;
//        System.out.println("a > b ? " + (a > b));
//        System.out.println("a >= b ? " + (a >= b));
//        System.out.println("a < b ? " + (a < b));
//        System.out.println("a <= b ? " + (a <= b));
//        System.out.println("a == b ? " + (a == b));
//        System.out.println("a != b ? " + (a != b));
        // số thực
//        System.out.println(Float.NaN == Float.NaN); //false
//        System.out.println(Float.POSITIVE_INFINITY  == Float.POSITIVE_INFINITY); // true
//        System.out.println(Float.POSITIVE_INFINITY != Float.POSITIVE_INFINITY); // false
//        System.out.println(Float.POSITIVE_INFINITY != Float.NEGATIVE_INFINITY); //true
//        System.out.println(Float.POSITIVE_INFINITY == Float.NEGATIVE_INFINITY); //false
//        System.out.println(-0 == +0); //true
//        System.out.println(-0 != +0); //false


        int a = 5;
        int b = 6;
        // gpa >= 3.6 && rank(gpa) <= 100 && điểm rèn luyện >= 90đ
        // (gpa >= 3.6 && điểm rèn luyện >= 90đ) || rank(gpa) <= 100 || đạt giải xuất sắc cuộc thi ACM
        // !true  = false; !false = true
        System.out.println(!(a == b));//true
        System.out.println(!(a < b));//false

    }
}

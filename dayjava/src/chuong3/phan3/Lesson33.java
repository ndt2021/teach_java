package chuong3.phan3;
import java.text.DecimalFormat;
import java.util.Scanner;
//  variable = (expression) ? value1: value2;
public class Lesson33 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Your gpa: ");
        var gpa = scanner.nextFloat();

        var scholarship = (gpa < 3.0f || gpa > 4.0f) ? 0
                : (gpa >= 3.6f) ? 10_000_000
                : (gpa >= 3.2f) ? 5_000_000
                : 3_500_000;

        var numberFormat = new DecimalFormat("#,###");
        var result = numberFormat.format(scholarship);
        System.out.println(STR."Scholarship amount = \{result}đ");

    }
}

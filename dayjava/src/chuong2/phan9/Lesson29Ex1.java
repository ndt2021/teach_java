package chuong2.phan9;

public class Lesson29Ex1 {
    public static void main(String[] args) {
        var number = 999999999999L;
        // in ra số nguyên:
        System.out.println("Giá trị gốc: ");
        var result = String.format("%d", number);
        System.out.println(result);
        System.out.printf("%d%n", number);


        // dành 10 vị trí in ra số nguyên number
        System.out.printf("%10d%n", number);
        System.out.printf("%-10d%n", number); // căn lề trái


        // in ra có dấu
        System.out.printf("%+d%n", number);


        // in ra có phân tách phần nghìn
        System.out.printf("%,+-15d%n", number);


        // in ra số nguyên ở dạng biểu diễn cơ số 8, 16, mã băm
        System.out.println("Chuyển đổi sang hệ cơ số 8, 16, hash code");
        System.out.printf("Hệ 8: %o%n", number);
        System.out.printf("Hệ 16: %x%n", number);
        System.out.printf("Hệ 16: %X%n", number); // viết hoa
        System.out.printf("Hash code: %h%n", number);
        System.out.printf("Hash code: %H%n", number); // mã băm cơ số 16 viết hoa
    }

}

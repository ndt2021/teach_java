package baithuchanhso4.bai14;
import java.math.BigInteger;
import java.util.Scanner;

public class ThaoTacSoNguyenLon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số nguyên lớn
        System.out.print("Nhập số nguyên lớn thứ nhất: ");
        String so1 = scanner.next();
        System.out.print("Nhập số nguyên lớn thứ hai: ");
        String so2 = scanner.next();

        // Chuyển đổi xâu thành BigInteger
        BigInteger bigSo1 = new BigInteger(so1);
        BigInteger bigSo2 = new BigInteger(so2);

        // Tổng hai số nguyên lớn
        BigInteger tong = bigSo1.add(bigSo2);
        System.out.println("Tổng hai số nguyên lớn: " + tong);

        // Hiệu hai số nguyên lớn
        BigInteger hieu = bigSo1.subtract(bigSo2);
        System.out.println("Hiệu hai số nguyên lớn: " + hieu);

        // Tích hai số nguyên lớn
        BigInteger tich = bigSo1.multiply(bigSo2);
        System.out.println("Tích hai số nguyên lớn: " + tich);

        // Đóng Scanner
        scanner.close();
    }
}

package baithuchanhso3.bai5;

public class SoThuanNghichVaNguyenTo {
    public static void main(String[] args) {
        System.out.println("Các số thuận nghịch và nguyên tố có sáu chữ số:");

        for (int i = 100000; i <= 999999; i++) {
            if (laSoThuanNghich(i) && laSoNguyenTo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean laSoThuanNghich(int n) {
        int reverse = 0;
        int original = n;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        return original == reverse;
    }

    public static boolean laSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

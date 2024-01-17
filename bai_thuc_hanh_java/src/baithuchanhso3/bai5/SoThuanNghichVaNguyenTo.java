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
        int reverse = 0; // 12321
        int original = n;
// 123  321    123%10  3    123/10  = 12    12%10   2    1   0
        //  0+3  = 3  => 30+2 =32   320+1 321
        while (n > 0) {
            int digit = n % 10;  // digit để lưu trữ phần dư
            reverse = reverse * 10 + digit;  //30+2 =32
            n /= 10;  // n = n/10
        }

        return original == reverse; //   123/10  = 12
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

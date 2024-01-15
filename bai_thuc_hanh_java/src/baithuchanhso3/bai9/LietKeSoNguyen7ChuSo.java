package baithuchanhso3.bai9;

public class LietKeSoNguyen7ChuSo {
    public static void main(String[] args) {
        System.out.println("Các số nguyên có 7 chữ số thoả mãn các điều kiện là:");

        // Liệt kê các số nguyên có 7 chữ số
        for (int i = 1000000; i <= 9999999; i++) {
            if (kiemTraSoNguyenTo(i) && kiemTraTatCaChuSoNguyenTo(i) && kiemTraSoNguyenTo(DaoNguocSo(i))) {
                System.out.println(i);
            }
        }
    }

    // Phương thức kiểm tra xem một số có phải là số nguyên tố hay không
    private static boolean kiemTraSoNguyenTo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Phương thức kiểm tra xem tất cả các chữ số của số có phải là số nguyên tố hay không
    private static boolean kiemTraTatCaChuSoNguyenTo(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (!kiemTraSoNguyenTo(digit)) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    // Phương thức đảo ngược số
    private static int DaoNguocSo(int num) {
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}

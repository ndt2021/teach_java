package baithuchanhso3.bai8;

public class LietKeSoNguyen {
    public static void main(String[] args) {
        System.out.println("Các số nguyên thoả mãn các điều kiện là:");

        // Liệt kê các số nguyên có từ 6 đến 8 chữ số
        for (int i = 100000; i <= 99999999; i++) {
            if (kiemTraSoNguyenTo(i) && kiemTraSoThuanNghich(i) && kiemTraTongChuSoChiaHetCho5(i)) {
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

    // Phương thức kiểm tra xem một số có phải là số thuận nghịch hay không
    private static boolean kiemTraSoThuanNghich(int num) {
        String strNum = String.valueOf(num);  // int 123=> String "123"
        String reverseStrNum = new StringBuilder(strNum).reverse().toString(); // String builder "123" => Stringbuilder "321" => string
        return strNum.equals(reverseStrNum);
    }

    // Phương thức kiểm tra xem tổng các chữ số có chia hết cho 5 hay không
    private static boolean kiemTraTongChuSoChiaHetCho5(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum % 5 == 0;
    }
}

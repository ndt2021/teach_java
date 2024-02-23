package chuong3.phan5.baitap;


import java.util.Scanner;

public class Exercises8 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt();

        // tạo ra một biến để lưu giá trị đảo
        var revert = 0;
        // tiến hành lấy giá trị đảo của n
        for (int i = n; i > 0; i /= 10) { // chừng nào n > 0
            // đảo = đảo * 10 + phần đơn vị của i
            revert = revert * 10 + i % 10;
            // sau đó i phải loại bỏ phần đơn vị bằng cách chia nguyên cho 10
        }

        // khi có giá trị đảo, kiểm tra xem chúng có khớp nhau không
        System.out.println(n == revert ? "YES" : "NO");
    }
}
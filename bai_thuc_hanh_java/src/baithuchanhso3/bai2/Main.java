package baithuchanhso3.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        System.out.println("Các cặp số nguyên tố cùng nhau trong đoạn [" + a + ", " + b + "]:");
        inCacCapSoNguyenToCungNhau(a, b);
    }

    public static int timUCLN(int a, int b) {
//        int UCLN=1;
//        for(int i=1; i< Math.min(a,b) ; i++){
//            if(a%i==0 && b%i==0){
//                UCLN =i;
//            }
//        }
//        return UCLN;
        while (b != 0) {
            int temp = b;
            b = a % b;  //  giải thuật Euclid
            a = temp;
        }
        return a;
    }

    public static void inCacCapSoNguyenToCungNhau(int a, int b) {
        for (int i = a; i <= b; i++) {
            for (int j = i + 1; j <= b; j++) {
                if (timUCLN(i, j) == 1) {  // 1 la UCLN   20 15   UC={1,5} UCLN={5}
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
    }
}

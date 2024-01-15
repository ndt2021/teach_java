package buoi11;

import java.util.Scanner;

public class Buoi11 {
    public static void main(String[] args) {
        int a,b,c,d;
//        int a = 5;
//        int b = a;
//        System.out.println(a +" " + b);
////        int[] sourceArray = {2, 3, 1, 5, 10};
////        int[] sourceArray1 = sourceArray;
//        String s1 = "thu2";
//        String s2 = s1;
//        System.out.println("s1 " + s1);
//        System.out.println("s2 " +s2);
//        s2 = s2 + "thu3";
//        System.out.println("s1 " + s1);
//        System.out.println("s2 " + s2);

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n = ");
        int n = sc.nextInt();
        System.out.println( n+"! =" + giaiThua(n) );

    }
    static int giaiThua(int n){
        if (n == 0){
            return 1;
        }else if (n==1){
            return 1;
        }else {
            return giaiThua(n-1)*n;
        }
    }

}

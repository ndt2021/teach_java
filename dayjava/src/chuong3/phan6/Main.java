package chuong3.phan6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        int x = 0;
        while (x < 0) {
            System.out.println(x);
            x++;
        }

        do {
            System.out.println(x);
            x++;
        } while (x < 0);
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0;
        int m = n;

        while (m>0){
            rev = rev*10 + m%10;
            m = m/10;
        }

        if(rev ==n){
            System.out.println("n la so dep");
        }else {
            System.out.println("n khong phai so dep");
        }

    }
}

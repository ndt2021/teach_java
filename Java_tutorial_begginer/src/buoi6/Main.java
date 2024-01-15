package buoi6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n= ");
        int n = sc.nextInt();

        int kq = 0;
/*
        for (int i=1; i<=n; i=i+2){
        //    if (i%2 ) 1  3  5  7
            kq = kq + i;
        }*/

        for (int i=0; i<=n; i=i+1){
            if (i%2 != 0){
                kq += i;  // kq = kq+i
            }
        }


        System.out.println("kq= " + kq);


    }
}

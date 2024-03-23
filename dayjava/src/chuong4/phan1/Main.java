package chuong4.phan1;

import java.util.Date;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //loop(5);
        System.out.println( tong(5,6) );
    }

    public static int tong(int a, int b){
        return a+b;
    }

    public static void loop(int n){
        for (int j=0;j<n;j++){
            System.out.println("*");
        }
    }

    public static boolean isPrime(int n) {
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

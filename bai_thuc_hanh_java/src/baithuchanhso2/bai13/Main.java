package baithuchanhso2.bai13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt(); //5     2  3  5 7 11
        int count = 0;
        int i = 0;
        do{
             if(laSoNguyenTo(i)){
                 System.out.println( "so nguyen to " + i );
                 count++;
             }
             i++;
        }while (count < n);
    }

    static boolean laSoNguyenTo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}

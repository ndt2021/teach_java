package buoi12;
import java.util.Scanner;

public class buoi12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i <= n-1; i++){
            System.out.println("arr["+i+"]= ");
            arr[i] = sc.nextInt();
        }

        for (int i =0; i< arr.length;i++ ){
            System.out.println("arr["+i+"]=" + arr[i]);
        }

    }
}

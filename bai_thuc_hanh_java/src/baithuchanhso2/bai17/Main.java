package baithuchanhso2.bai17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double pi=0;

        for (int i=0; i<=n; i++){
            pi= pi + 4*Math.pow(-1,i) * (1.0)/(2*i+1);
        }
        System.out.println("pik=" + pi);

    }
}

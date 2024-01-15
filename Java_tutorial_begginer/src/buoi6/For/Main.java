package buoi6.For;
//   nhập n =  ,,,, 5
//
//        **
//        ****
//        ******


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }

            System.out.printf("\n");

        }

    /*    for (int i =1 ; i <=n; i++){
            for (int j =1; j <= 2*i ; j=j+1){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
*/

    }
}

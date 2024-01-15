package buoi9;

import java.util.Scanner;

public class ar1 {
    public static void main(String[] args) {
//        int[] arr1 = new int[5];  //  0   1    2    3    4
//
//        arr1[0] = 5;
//        arr1[1] = 4;
//        arr1[2] = 3;
//        arr1[3] = 9;
//        arr1[4] = 1;
//
//        for (int i=0; i<5; i++){
//            System.out.println(arr1[i]);
//        }

        int[][] arr2 = new int[2][3];

        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                    System.out.println("arr2["+ i +"]["+j+"]" );
                    arr2[i][j] = scanner.nextInt();
            }
        }

        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println("");
        }





    }
}

package chuong5.phan3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {1,3,4,2,5};
//        int n = arr.length;
//
//        for(int i=0; i<n-1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    // Hoán đổi giá trị của arr[j] và arr[j+1]
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//
//        for (int i=0; i<5;i++){
//            System.out.println(arr[i]);
//        }


        int[] numbers = {9, 8, 5, 2, 3, 1, 0, 4, 7, 8, 9, 100, 7};

        Arrays.sort(numbers);
        for (int i=0; i< numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}

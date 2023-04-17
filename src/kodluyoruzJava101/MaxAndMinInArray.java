package kodluyoruzJava101;

import java.util.Scanner;
import java.util.Arrays;

public class MaxAndMinInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int[] arr = {8, 36, 17, -4, 11, -23, 1, 0};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (num <= arr[0]) {
                System.out.println("Smallest number in array: " + arr[0]);
                break;
            }
            if (num >= arr[arr.length - 1]) {
                System.out.println("Biggest number in array: " + arr[arr.length-1]);
                break;
            }
            if (arr[i] > num) {
                System.out.println("Closest and Biggest number: " + arr[i]);
                System.out.println("Closest and Smallest number: " + arr[i - 1]);
                break;
            }
            if (arr[i] == num) {
                System.out.println("Closest and Biggest number: " + arr[i + 1]);
                System.out.println("Closest and Smallest number: " + arr[i - 1]);
                break;
            }
        }




        // Without Arrays functions

        /*int smallestAndClosest = 0;
        int biggestAndClosest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < num && (smallestAndClosest == 0 || arr[i] > smallestAndClosest)) {
                smallestAndClosest = arr[i];
            }
            if (arr[i] > num && (biggestAndClosest == 0 || arr[i] < biggestAndClosest)) {
                biggestAndClosest = arr[i];
            }
        }
        if (smallestAndClosest == 0) {
            System.out.println("There is no smaller number than entered number in array");
        } else {
            System.out.println("Closest and Smallest number: " + smallestAndClosest);
        }
        if (biggestAndClosest == 0) {
            System.out.println("There is no bigger number than entered number in array");
        } else {
            System.out.println("Closest and Biggest number: " + biggestAndClosest);
        }

         */
    }
}

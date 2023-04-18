package kodluyoruzJava101;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Enter the " +(i+1) + ". value of array: ");
             arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorting: " + Arrays.toString(arr));
    }







}

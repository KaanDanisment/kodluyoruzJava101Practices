package kodluyoruzJava101;


public class DuplicateEvenNumberInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 6, 4, 7, 7, 5, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if (i != k && (arr[i] % 2 == 0 && arr[k] == arr[i])) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

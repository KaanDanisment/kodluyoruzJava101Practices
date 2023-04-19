package kodluyoruzJava101;

public class MatrixTranspose {
    static void transpose(int[][] arr) {
        int[][] arr2 = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[0].length; k++) {
                arr2[k][i] = arr[i][k];
            }
        }
        for (int[] i : arr2) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3},
                        {4, 5, 6}};
        transpose(arr);

    }
}

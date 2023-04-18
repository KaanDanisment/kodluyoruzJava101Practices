package kodluyoruzJava101;

public class FrequencyOfItemsInTheArray {
    static boolean isIn(int[] arr,int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }return false;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] frequency = new int[arr.length];
        int count;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int k = 0; k < arr.length; k++) {
                if (!isIn(frequency, arr[i])){
                    frequency[i] = arr[i];
                }
                if ( arr[i] == arr[k]) {
                    count++;
                }
            }if (frequency[i] != 0){
                System.out.println(frequency[i] + " is repeat " + count + " times");
            }
        }
    }
}

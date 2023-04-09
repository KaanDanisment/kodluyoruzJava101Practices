package kodluyoruzJava101;

import java.util.Scanner;

public class CreatingFunctionAccordingToThePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        function(num, num, false);
    }

    static void function(int num, int temp, boolean i) {
        System.out.print(num + " ");
        if (num <= 0 || i) {
            i = true;
            if (num != temp) {
                function(num + 5, temp, i);
            }
        } else {
            function(num - 5, temp, i);
        }
    }
}

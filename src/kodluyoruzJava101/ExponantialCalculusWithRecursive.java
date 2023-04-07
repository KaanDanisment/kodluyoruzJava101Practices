package kodluyoruzJava101;

import java.util.Scanner;

public class ExponantialCalculusWithRecursive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int a = scan.nextInt();
        System.out.print("Enter the power: ");
        int b = scan.nextInt();
        System.out.println(exponantial(a, b));
    }
    static int exponantial(int a, int b){;
        if(b == 0){
            return  1;
        }b--;
        return a * exponantial(a, b);
    }
}

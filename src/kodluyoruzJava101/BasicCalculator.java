package kodluyoruzJava101;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        int n1, n2, selection;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        n1 = input.nextInt();
        System.out.print("Pleasa enter the second number: ");
        n2 = input.nextInt();

        System.out.println("Please select the operation you want to do; ");
        System.out.println("1-Add\n2-Subtract\n3-Divide\n4-Multiply");
        System.out.print("Operation: ");

        selection = input.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Reslut: " + (n1 + n2));
                break;
            case 2:
                if (n1 > n2){
                    System.out.println("Result: " + (n1-n2));
                }
                else {
                    System.out.println("Result: " + (n2-n1));
                }
                break;
            case 3:
                if (n2 != 0){
                    System.out.println("Result: "+ (n1/n2));
                }
                else {
                    System.out.println("The number can not divisable by zero!");
                }
                break;
            case 4:
                System.out.println("Result: " + (n1*n2));
                break;
            default:
                System.out.println("Selection not found! Try Again");
        }

    }
}

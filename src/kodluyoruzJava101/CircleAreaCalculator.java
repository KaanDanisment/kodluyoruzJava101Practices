package kodluyoruzJava101;

import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args){
        double r, pi = 3.14, a;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the r: ");
        r = input.nextInt();
        System.out.print("Enter the a: ");
        a = input.nextInt();

        double area = (pi * (r*r) * a)/ 360;

        System.out.println("Area of The Circle: " + area);
    }
}

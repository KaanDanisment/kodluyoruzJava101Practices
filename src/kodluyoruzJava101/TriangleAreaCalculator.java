package kodluyoruzJava101;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args){
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Edge: ");
        a = input.nextInt();
        System.out.print("Enter Edge: ");
        b = input.nextInt();
        System.out.print("Enter Edge: ");
        c = input.nextInt();

        double u = (a+b+c)/2;
        System.out.println(u);

        double area =Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println(area);
    }
}

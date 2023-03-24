package kodluyoruzJava101;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args){
        double weight, height, index;
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Your Weight(kg Type): ");
        weight = input.nextInt();

        System.out.print("Please Enter Your Height(m Type): ");
        height = input.nextDouble();

        index = weight/ (height*height);
        System.out.println("Your Body Mass Index: " + index);
    }

}

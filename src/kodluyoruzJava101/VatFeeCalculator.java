package kodluyoruzJava101;

import java.util.Scanner;

public class VatFeeCalculator {
    public static void main(String[] args){
        double cost, vatRate;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the cost:");
        cost = input.nextInt();

        vatRate = (0 < cost && cost <= 1000) ? 0.18 : 0.08;

        double vatFee = cost * vatRate;
        double costWithFee = vatFee + cost;
        System.out.println("Vat Fee:" + vatFee);
        System.out.println("Total:" + costWithFee);
    }
}

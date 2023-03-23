package kodluyoruzJava101;

import java.util.Scanner;

public class TaximeterCalculator {
    public static void main(String[] args){
        double perKm = 2.20, distance;
        int taximeterOpening = 10;
        Scanner input = new Scanner(System.in);

        System.out.print("Distance: ");
        distance = input.nextInt();

        double cost = (distance * perKm) + taximeterOpening;

        double total = (cost < 20) ? 20 : cost;
        System.out.println(total);

    }
}

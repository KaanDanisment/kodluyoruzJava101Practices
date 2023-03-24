package kodluyoruzJava101;

import java.util.Scanner;

public class CashRegisterCalculator {
    public static void main(String[] args){
        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, aubergine = 5;
        Scanner input = new Scanner(System.in);

        System.out.print("How Many Kilos of Pear? :");
        double kilosOfPear = input.nextDouble();
        System.out.print("How Many Kilos of Apple? :");
        double kilosOfApple = input.nextDouble();
        System.out.print("How Many Kilos of Tomato? :");
        double kilosOfTomato = input.nextDouble();
        System.out.print("How Many Kilos of Banana? :");
        double kiloOfBanana = input.nextDouble();
        System.out.print("How Many Kilos of Aubergine? :");
        double kilosOfAubergine = input.nextDouble();

        double total = (kilosOfPear * pear) + (kilosOfApple * apple) + (kilosOfTomato * tomato) + (kiloOfBanana * banana) + (kilosOfAubergine * aubergine);
        System.out.println(total);
    }
}

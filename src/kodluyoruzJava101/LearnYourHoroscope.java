package kodluyoruzJava101;

import java.util.Scanner;

public class LearnYourHoroscope {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Birth Date ");
        System.out.print("Month: ");
        month = input.nextInt();
        System.out.print("Day: ");
        day = input.nextInt();

        if (month > 12){
            System.out.println("Month entry is wrong! Try again.");
        }else {
            if (day > 31) {
                System.out.println("Day entry is wrong! Try again.");
            } else if (day > 28 && month == 2){
                System.out.println("Day entry is wrong! Try again");
            } else if ((day >= 21 && month == 3) || (day <= 20 && month == 4)) {
                System.out.println("Aris");
            } else if ((day >= 21 && month == 4) ||(day <= 21 && month == 5)) {
                System.out.println("Taurus");
            } else if ((day >= 22 && month == 5) || (day <= 22 && month == 6)) {
                System.out.println("Gemini");
            } else if ((day >= 23 && month == 6) || (day <= 22 && month == 7)) {
                System.out.println("Cancer");
            } else if ((day >= 23 && month == 7) || (day <= 22 && month == 8)) {
                System.out.println("Leo");
            } else if ((day >= 23 && month == 8) || (day <= 22 && month == 9)) {
                System.out.println("Virgo");
            } else if ((day >= 23 && month == 9) || (day <= 22 && month == 10)) {
                System.out.println("Libra");
            } else if ((day >= 23 && month == 10) || (day <= 21 && month == 11)) {
                System.out.println("Scorpio");
            } else if ((day >= 22 && month == 11) || (day <= 21 && month == 12)) {
                System.out.println("Sagittarius");
            } else if ((day >= 22 && month == 12) ||(day <= 21 && month == 1)) {
                System.out.println("Capricorn");
            } else if ((day >= 22 && month == 1) || (day <= 19 && month == 2)) {
                System.out.println("Aquarius");
            } else if ((day >= 20 && month == 2)|| (day <= 20 && month == 3)) {
                System.out.println("Pisces");
            }

        }
    }
}

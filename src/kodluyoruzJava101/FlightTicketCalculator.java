package kodluyoruzJava101;

import java.util.Scanner;

public class FlightTicketCalculator {
    public static void main(String[] args) {
        int distance, age, ticketType;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Distance in km: ");
        distance = input.nextInt();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Ticket Type\n1-one direction\n2-round trip\nSelect the ticket type: ");
        ticketType = input.nextInt();


        double cost = distance * 0.10;

        double ageDiscount = 0;
        if (age <= 12) {
            ageDiscount = cost * 0.50;
        } else if (age > 12 && age <= 24) {
            ageDiscount = cost * 0.10;
        } else if (age > 65) {
            ageDiscount = cost * 0.30;
        }
        double discountedCost = (cost - ageDiscount);

        double roundTripTicketDiscount = 0;
        if (ticketType == 2){
          roundTripTicketDiscount = discountedCost * 0.20;
        }
        double total = discountedCost - roundTripTicketDiscount;

        if (distance < 0){
            System.out.println("Incorrect Information Entry");
        }else if (age < 0) {
            System.out.println("Incorrect Information Entry");
        }else if (ticketType != 1 && ticketType != 2) {
            System.out.println("Incorrect Information Entry");
        }else {
            System.out.println("Total: " + total);
        }
    }
}

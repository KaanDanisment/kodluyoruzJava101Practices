package kodluyoruzJava101;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName, password;
        Scanner scan = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Username :");
            userName = scan.nextLine();
            System.out.print("Password : ");
            password = scan.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to the Kodluyoruz Bank!");

                do {
                    System.out.println("1-Deposit\n" +
                            "2-Withdrawal\n" +
                            "3-Balance\n" +
                            "4-Exit");
                    System.out.print("Please Select The Action : ");
                    select = scan.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Cash Amount : ");
                            int price = scan.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Cash Amount : ");
                            price = scan.nextInt();

                            if (price > balance) {
                                System.out.println("insufficent balance!");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Balance: " + balance);
                            break;
                        default:
                            System.out.println("Incorrect Entry!");
                    }
                } while (select != 4);
                System.out.println("Goodbye!");
                break;
            } else {
                right--;
                System.out.println("Incorrect username or password! Try Again.");
                if (right == 0) {
                    System.out.println("Account blocked! Please contact your bank.");
                } else {
                    System.out.println("Remaining Trial: " + right);
                }
            }
        }
    }
}

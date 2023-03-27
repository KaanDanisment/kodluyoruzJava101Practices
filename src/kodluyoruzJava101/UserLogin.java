package kodluyoruzJava101;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName, password, newPassword, registeredUserName = "patika", registeredPassword ="java123";
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the user name: ");
        userName = input.next();
        System.out.print("Please enter the password: ");
        password = input.next();

        if (userName.equals(registeredUserName) && password.equals(registeredPassword)) {
            System.out.println("Logged in");
        } else if (userName.equals(registeredUserName) && (!password.equals(registeredPassword))) {
            System.out.println("The password is incorrect!Do you want to change it?\n1-Yes\n2-No");
            int q = input.nextInt();

            if (q == 1) {
                System.out.print("Please enter the new password: ");
                newPassword = input.next();
                if (newPassword.equals(registeredPassword)) {
                    System.out.println("New password can not be the same previous password!\nPlease try again!");
                } else {
                    registeredPassword = newPassword;
                    System.out.println("The password has been changed.");
                }
            } else if (q == 2) {
                System.out.println("Please Log In.");
            } else {
                System.out.println("Incorrect entry!");
            }
        }else {
            System.out.println("User name and password are incorrect, try again");
        }
    }
}
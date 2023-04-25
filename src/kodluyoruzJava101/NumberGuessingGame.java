package kodluyoruzJava101;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner scan = new Scanner(System.in);
        int right = 10;
        int i = 0;
        int[] wrongGuess = new int[5];
        boolean isWin = false;


        while (right > 0){
            System.out.print("Guess the number: ");
            int guess = scan.nextInt();

            if (guess < 0 || guess > 99){
                right--;
                if (right < 3){
                    System.out.println("You made too many wrong entries.");
                    break;
                }
                else System.out.println("Please enter a number in range 0 and 100");
                continue;
            }

            if (guess == number){
                System.out.println("Congratulations! Your guess is correct! The number is " + number);
                isWin = true;
                break;
            }
            else {
                right--;
                System.out.println("Your guess is wrong! You have " + right + " left!");
                wrongGuess[i++] = guess;
                if (right == 0){
                    break;
                }
                if (guess < number){
                    System.out.println("Your guess is smaller than the number!");
                }else System.out.println("Your guess is bigger than the number!");
            }
        }if (!isWin){
            System.out.println("You lost!");
            System.out.println("The number is " + number);
            System.out.println("Your predictions: " + Arrays.toString(wrongGuess));

        }
    }
}

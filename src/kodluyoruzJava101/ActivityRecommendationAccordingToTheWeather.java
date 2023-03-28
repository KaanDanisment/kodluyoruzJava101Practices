package kodluyoruzJava101;

import java.util.Scanner;

public class ActivityRecommendationAccordingToTheWeather {
    public static void main(String[] args) {
        int weather;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Weather:");
        weather = input.nextInt();
        
        if (weather < 5){
            System.out.println("You may go to ski.");
        } else if (5 <= weather && weather < 10 ){
            System.out.println("You may go to cinema.");
        } else if (10 <= weather && weather < 15) {
            System.out.println("You may go to cinema or picnic");
        } else if (15 <= weather && weather < 25 ) {
            System.out.println("You may go to picnic");
        }else {
            System.out.println("You may go to swim");
        }
    }
}

package kodluyoruzJava101;

import java.util.Scanner;

public class GradeAverageCalculator {
    public static void main(String[] args){
        int mat, physics, chemistry, turkish, history, music;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the notes!");

        System.out.print("mat:");
        mat = input.nextInt();

        System.out.print("physics:");
        physics = input.nextInt();

        System.out.print("chemistry:");
        chemistry = input.nextInt();

        System.out.print("turkish:");
        turkish = input.nextInt();

        System.out.print("history:");
        history = input.nextInt();

        System.out.print("music:");
        music = input.nextInt();

        Double average =(mat + physics + chemistry + turkish + history + music)/ 6.0;
        System.out.println("Grade Average:" + average);

        String status = (average < 60) ? "invalid":"valid";
        System.out.println(status);


    }

}

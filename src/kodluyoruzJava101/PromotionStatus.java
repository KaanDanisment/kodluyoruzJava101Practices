package kodluyoruzJava101;

import java.util.Scanner;

public class PromotionStatus {
    public static void main(String[] args) {
        int mat, physics, chemistry, turkish, history, music;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the notes!");

        System.out.print("mat:");
        mat = input.nextInt();
        if (mat < 0 || mat > 100) {
            mat = 0;
        } else {
            mat = mat;
        }

        System.out.print("physics:");
        physics = input.nextInt();
        if (physics < 0 || physics > 100) {
            physics = 0;
        } else {
            physics = physics;
        }

        System.out.print("chemistry:");
        chemistry = input.nextInt();
        if (chemistry < 0 || chemistry > 100) {
            chemistry = 0;
        }else {
            chemistry = chemistry;
        }

        System.out.print("turkish:");
        turkish = input.nextInt();
        if (turkish < 0 || turkish > 100){
            turkish = 0;
        }else {
            turkish = turkish;
        }

        System.out.print("history:");
        history = input.nextInt();
        if (history < 0 || history > 100){
            history = 0;
        }else {
            history = history;
        }

        System.out.print("music:");
        music = input.nextInt();
        if (music < 0 || music > 100){
            music = 0;
        }else {
            music = music;
        }

        double average =(mat + physics + chemistry + turkish + history + music)/ 6.0;
        System.out.println("Grade Average:" + average);
        if (average > 55){
            System.out.println("Enough grade for promotion!");
        }else System.out.println("insufficient grade for promotion");
    }
}

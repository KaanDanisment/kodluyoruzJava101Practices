package kodluyoruzJava101.MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("==========Welcome the Mine Sweeper Game==========");
        System.out.print("Please enter the Number of Row of The Palyground: ");
        int row = scan.nextInt();
        System.out.print("Please enter the Number of Column of The Playground: ");
        int col = scan.nextInt();
        MineSweeper mine = new MineSweeper(row,col);
        mine.run();
    }
}

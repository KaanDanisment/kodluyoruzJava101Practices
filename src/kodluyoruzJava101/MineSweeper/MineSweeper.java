package kodluyoruzJava101.MineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    String[][] map;
    String[][] board;
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new String[rowNumber][colNumber];
        this.board = new String[rowNumber][colNumber];
    }

    public void run() {
        minePlacement();

        boolean isOver = false;

        while (!isOver){
            System.out.print("Enter the Row Number: ");
            int enteredRow = scan.nextInt();
            System.out.print("Enter the Column Number: ");
            int enteredCol = scan.nextInt();
            if (enteredRow >= rowNumber || enteredCol >= colNumber || enteredRow<0 || enteredCol<0) {
                System.out.println("Entry is Outside The Playground! Please Try Again!");
                continue;
            }
            if (map[enteredRow][enteredCol].equals("*")) {
                System.out.println("==========Bomb! Game Over!==========");
                break;
            } else if (map[enteredRow][enteredCol].equals("-") && board[enteredRow][enteredCol].equals("-")) {
                int mineQuantity = 0;
                for (int i = enteredRow - 1; i <= enteredRow + 1; i++) {
                    for (int j = enteredCol - 1; j <= enteredCol + 1; j++) {
                        if (i >= 0 && j >= 0 && i < rowNumber && j < colNumber && map[i][j].equals("*")) {
                            mineQuantity++;
                            board[enteredRow][enteredCol] = Integer.toString(mineQuantity);
                            map[enteredRow][enteredCol] = Integer.toString(mineQuantity);
                        }else {
                            board[enteredRow][enteredCol] = Integer.toString(mineQuantity);
                            map[enteredRow][enteredCol] = Integer.toString(mineQuantity);
                        }
                    }
                }
                printBoard();
            } else{
                System.out.println("This cell has been entered before");
                continue;
            }
            int count = 0;
            for (int i = 0; i < board.length; i++){
                for (int j = 0; j < board[i].length; j++){
                    if (board[i][j].equals("-")){
                        count++;
                    }
                }
            }if (count == ((rowNumber * colNumber) / 4)){
                System.out.println("==========Congratulations! You Win!==========");
                isOver = true;
            }
        }
        printMap();
    }

    public void minePlacement() {
        int randRow, randCol, count = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = "-";
                board[i][j] = "-";
            }
        }

        while (count != ((rowNumber * colNumber) / 4)) {
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(colNumber);
            if (map[randRow][randCol].equals("-")) {
                map[randRow][randCol] = "*";
                count++;
            }
        }
        printMap();
        printBoard();
    }

    public void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("=======================");
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("=======================");
    }
}

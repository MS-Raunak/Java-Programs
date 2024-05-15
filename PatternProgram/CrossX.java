package PatternProgram;

import java.util.Scanner;


public class CrossX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size:");
        int rowSize = sc.nextInt();

        printX(rowSize);
    }

    private static void printX(int rowSize) {
        for (int row = 1; row <= rowSize; row++) {
            for (int col = 1; col <= rowSize; col++) {
                if (row == col || col == (rowSize - row) + 1) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}




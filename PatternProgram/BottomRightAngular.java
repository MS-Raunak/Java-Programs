package PatternProgram;

import java.util.Scanner;

/*

           *
           *
           *
           *
           *
 * * * * * *


 */
public class BottomRightAngular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size:");
        int rowSize = sc.nextInt();
/*
        for (int row=1; row<=rowSize; row++){
            if (row<rowSize){
                for (int space=1; space<=rowSize-1; space++)
                    System.out.print(" ");
                System.out.println("*");
            }
            else {
                for (int col=1; col<=rowSize; col++){
                    System.out.print("*");
                }
            }
        }
 */
        // Second method
        for (int row=1; row<=rowSize; row++){
            for (int col=1; col<=rowSize; col++){
                if (col==rowSize || row==rowSize)
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}

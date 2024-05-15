package PatternProgram;

import java.util.Scanner;
/*

 * * * * *
 *
 *
 *
 *

 */


public class TopLeftAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size:");
        int rowSize = sc.nextInt();

        // First Method

        for (int row=1; row<=rowSize; row++){
            if (row==1) {
                for (int col = 1; col <= rowSize; col++)
                    System.out.print("*");
            }
            else {
                for (int col=row; col<=row; col++)
                    System.out.print("*");
            }

            System.out.println();
        }


        System.out.println("\nSecond Method\n=============\n");

      // Second Method
        for (int row=1; row<=rowSize; row++){
            if (row>1) {
                for (int col=row; col<=row; col++)
                    System.out.print("*");
            }
            else {
                for (int col=1; col<=rowSize; col++)
                    System.out.print("*");
            }

            System.out.println();
        }
    }
}


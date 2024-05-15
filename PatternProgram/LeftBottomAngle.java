package PatternProgram;

import java.util.Scanner;

/*

*
*
*
*
* * * * *

 */

public class LeftBottomAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size:");
        int rowSize = sc.nextInt();

         // First Method
        for (int i=1; i<=rowSize; i++){
            if(i<rowSize){
                for (int j=i; j<=i; j++)
                    System.out.print("*");
            }
            else {
                for (int j=1; j<=i; j++)
                    System.out.print("*" + " ");
            }

            System.out.println();
        }

        System.out.println("\nSecond Method\n=============\n");

        //Second Method
        for (int row=1; row<=rowSize; row++){
            if (row<rowSize)
                System.out.println("*" + " ");
            else {
                for (int col = 1; col <= row; col++)
                    System.out.print("*" + " ");
            }
        }

        System.out.println("\nThird Method\n=============\n");

        for (int row=1; row<=rowSize; row++){
            for (int col = 1; col <= rowSize; col++){
                if (row == rowSize)
                    System.out.print("*" + " ");
                else {
                    System.out.print("*");
                    break;
                }
            }
            System.out.println();
        }

        System.out.println("\nFourth Method\n=============\n");

        for (int row=1; row<=rowSize; row++){
            for (int col=1; col<=rowSize; col++){
                if (col==1 || row==rowSize)
                    System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

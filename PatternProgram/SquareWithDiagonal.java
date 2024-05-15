package PatternProgram;/*

*  *  *  *  *
*  *    *   *
*     *     *
*  *     *  *
*  *  *  *  *

 */

import java.util.Scanner;

public class SquareWithDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row size:");
        int rowSize=scanner.nextInt();

        for (int row=1; row<=rowSize; row++){
            for (int col=1; col<=rowSize; col++){
                if (row==1 || col==1 || row==rowSize || col==rowSize || row==col || col==(rowSize-row)+1)
                    System.out.print("*" );
//                else if(col==row || col==(rowSize-row)+1)
//                    System.out.println("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}

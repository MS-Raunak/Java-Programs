package PatternProgram;

import java.util.Scanner;

public class XwithBorders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row size:");
        int rowSize = sc.nextInt();

        for (int row=1; row<=rowSize; row++){
            for (int col=1; col<=rowSize; col++){
                if (row == 1 || col == row || col == (rowSize - row) + 1 || row == rowSize || col == rowSize)
                    System.out.print("*");
                else if(col == 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
/*

 **********
 **      **
 * *    * *
 *  *  *  *
 *   **   *
 *   **   *
 *  *  *  *
 * *    * *
 **      **
 **********

 */

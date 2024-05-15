package PatternProgram;

import java.util.Scanner;

/*

 *
 *
 *
 *
 * * * * *

 */

public class RightTopAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size:");
        int rowSize = sc.nextInt();

        for (int row=1; row<=rowSize; row++){
            if (row==rowSize){
                for (int col=1; col<=rowSize; col++) {
                    System.out.print("*");
					
                    if (col==rowSize) return;
                }

            }
            else {
                for (int space=1; space<rowSize; space++)
                    System.out.print(" ");
            }

            System.out.println("* ");
        }
    }
}

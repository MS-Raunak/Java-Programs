package PatternProgram;

import java.util.Scanner;

/*

 * * * * *          =====> First Part
 *
 *
 *
 *
 * * * * *          ====> Second Part
 *
 *
 *
 * * * * * *        =====> Third Part

 */

// Break this pattern into three part

public class PrintE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size:");
        int rowSize = sc.nextInt();
//        int size =rowSize;
/*
        // First Part
        for (int row=1; row<=rowSize; row++){
            if (row==1){
                for (int col=1; col<=rowSize; col++)
                    System.out.print("* ");
            }
            else {
                for (int col=row; col<=row; col++)
                    System.out.print("*");
            }
            System.out.println();
        }

        // Second Part
        for (int row=1; row<=rowSize; row++){
            if (row==1){
                for (int col=1; col<=rowSize; col++)
                    System.out.print("* ");
            }
            else {
                for (int col=row; col<=row; col++)
                    System.out.print("*");
            }
            System.out.println();
        }

        // Third Part
        for (int col=1; col<=rowSize; col++)
            System.out.print("* ");
 */

        // Second Methods
        for (int row=1; row<=rowSize; row++){
            if (row==1 || row==rowSize || row==(rowSize/2+1)) {
                for (int col = 1; col <= rowSize; col++)
                    System.out.print("* ");
            }
            else{
                        System.out.print("* ");
            }
            System.out.println();
        }
    }

}

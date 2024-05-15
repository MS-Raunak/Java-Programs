package PatternProgram;

import java.util.Scanner;
class PyramidPattern {
    // Simple Pyramid
    static void pyramid(int nth_row) {
/*
             *
           * * *
         * * * * *
*/
        System.out.println("\nPyramid");

       for (int row=1; row <= nth_row; row++) {
           // space
           for (int space = 1; space <= nth_row - row; space++)
               System.out.print(" ");
           // star
           for (int star=1; star <= row; star++)
               System.out.print("*" + " ");


           System.out.println();
       }
    }

    // Reverse Simple Pyramid
    static void simpleReversePyramid(int nth_row){
        System.out.println("\nHolo Reverse Pyramid");

    }

    // Holo Pyramid
    static void holoPyramid(int nth_row) {
    /*
             *
           *   *
         *       *
        * * * * * *
    */
        System.out.println("\nHolo Pyramid");

        for (int row=1; row <= nth_row; row++) {
            // space
            for (int space = 1; space <= nth_row - row; space++)
                System.out.print(" ");
            // print star
            for (int col=1; col <= row; col++){
                if (col==1 || col==row || row == nth_row)
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }

            System.out.println();
        }
    }

    //
}


public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rowNumber:");
        int rows = sc.nextInt();

        PyramidPattern.pyramid(rows);
        PyramidPattern.simpleReversePyramid(rows);

        PyramidPattern.holoPyramid(rows);

    }
}



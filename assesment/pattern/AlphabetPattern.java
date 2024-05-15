package assesment.pattern;

public class AlphabetPattern {
    // print -X
    public static void printX(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=row; j++){
                if (i==j ){
                    System.out.print("*");
                }
                else if (j==row-i+1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }


    // print-S
    public static void printS(int rows) {
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=rows; j++){
                if ( i<=rows/2+1 && (i==1 || i==rows || j==1 || i==rows/2+1))
                    System.out.print("*");
                else if (i>rows/2+1 && (j==rows || i==rows))
                    System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();
        }
    }

    //print - E
    public static void printE(int rows) {
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=rows; j++) {
                if ((i<=rows/2) && j==1 || i==1)
                    System.out.print("*");
                else if (i==rows/2+1 || j==1 || i==rows)
                    System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();
        }
    }

    //print-F
    public static void printF(int rows) {
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=rows; j++) {
                if (i==1 || i==rows/2+1 || j==1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    //print - P
    public static void printP(int rows) {
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=rows; j++){
                if (i==1 || i==rows/2+1 || j==1 || (i<=rows/2+1 && j==rows))
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    //print-A
    public static void printA(int rows) {
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=rows; j++) {
                if (i==1 || i==rows/2+1 || j==1 || j==rows)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }


    //Test Application
    public static void main(String[] args) {
//        printX(5);
//        printS(9);
//        printE(9);
//        printF(9);
//        printP(9);
        printA(9);
    }
}

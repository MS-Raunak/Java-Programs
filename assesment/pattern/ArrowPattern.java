package assesment.pattern;

import java.util.Scanner;

public class ArrowPattern {

    //Simple RightArrow
    public static void rightArrow(int rows) {
        System.out.println("Simple Right Arrow Pattern!");
        for (int i=1; i<=rows; i++) {
           if (i<=rows/2+1){
               for (int j=1; j<=i; j++){
                   System.out.print("*" + " ");
               }
           }
           else {
               for (int j=1; j<=rows-i+1; j++){
                   System.out.print("*" + " ");
               }
           }

            System.out.println();
        }
    }

    //Holo RightArrow
    public static void holoRightArrow(int rows) {
        System.out.println("\nHolo Right Arrow Pattern!");
        for (int i=1; i<=rows; i++) {
            if (i<=rows/2+1) {
                for (int j=1; j<=rows; j++) {
                    if (j==i || j==1)
                        System.out.print("*" + " ");
                    else System.out.print(" " + " ");
                }
            }
            else{
                for (int j=1; j<=rows; j++){
                    if (j==1 || j==rows-i+1)
                        System.out.print("*" + " ");
                    else System.out.print(" " + " ");
                }
            }

            System.out.println();
        }
    }

    //Left Arrow Pattern
    public static void leftArrow(int rows){
        System.out.println("\nSimple Left Arrow Pattern");

        for (int i=1; i<=rows; i++) {
            if (i<=rows/2+1){
                for (int sp=1; sp<rows-i; sp++)
                    System.out.print(" ");

                for (int j=1; j<=i; j++) {
                    System.out.print("*");
                }
            }
            else {
                for (int sp=1; sp<2*i-rows ; sp++)
                    System.out.print(" ");
//                for (int j=1; j<=rows)
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter rows: ");
        int rows = sc.nextInt();

        rightArrow(rows);
        holoRightArrow(rows);
        leftArrow(rows);
    }
}

package PatternProgram;

import java.util.Scanner;
/*

         *
       * *
     * * *
   * * * *
 * * * * *

 */
public class Triangle4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int size = sc.nextInt();

        for (int i=1; i<=size; i++){
            if (i>=size){
                for (int j=1; j<=size; j++)
                    System.out.print("*");
            }
            else{
                for (int space=size-i; space<size; space++){
                    System.out.print(" ");
                }
                for (int j=1; j<=i; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

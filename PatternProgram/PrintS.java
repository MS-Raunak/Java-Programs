package PatternProgram;

import java.util.Scanner;

public class PrintS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n / 2 + 1 || i == n) {
                    System.out.print("*" + " ");
                } else if (i > 1 && i <= n / 2) {
                    System.out.print("*" + " ");
                    break;
                }
                else if (i>n/2+1 && i<n && j==n){
                    System.out.print("*");
                }
                else
                    System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}


/*

* * * * * * *
*
*
* * * * * * *
            *
            *
* * * * * * *

 */

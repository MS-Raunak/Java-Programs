package PatternProgram;

import java.util.Scanner;


public class Number_Border {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n:");
        int n = sc.nextInt();

        // It will work with only n=4
        for (int i=1; i<=n*2-1; i++){
            for (int j=1; j<=n*2-1; j++){
                if (i==1 || j==1 || i==n*2-1 || j==n*2-1)
                    System.out.print(n + " ");

                else if(j==2 || i==2 || j==(n*2-1)-1 || i==(n*2-1)-1)
                    System.out.print(n-1 + " ");

                else if(j==3 || i==3 || j==(n*2-1)-2 || i==(n*2-1)-2)
                    System.out.print(n-2 + " ");

                else if(j == 4 || i == 4)
                    System.out.print(n-3 + " ");
                else
                    System.out.print(" " + " ");
            }

            System.out.println();
        }

        System.out.println("\nSecond Method\n=================");
        // It will work with any number
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                System.out.print(Math.max(Math.abs(n - i), Math.abs(n - j)) + 1 + " ");
            }
            System.out.println();
        }
    }
}
/*
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4

 */


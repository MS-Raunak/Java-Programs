package PatternProgram;

import java.util.Scanner;

/*

---------*
--------* *
-------* * *
------* * * *
-----* * * * *
----* * * * * *
---* * * * * * *
--* * * * * * * *
-* * * * * * * * *
* * * * * * * * * *
---------*
--------* *
-------* * *
------* * * *
-----* * * * *
----* * * * * *
---* * * * * * *
--* * * * * * * *
-* * * * * * * * *
* * * * * * * * * *
--------* *
--------* *
--------* *
--------* *
--------***


 */
public class ChrismasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();

        // First Pyramid
        for (int i=1; i<=n; i++){
            for (int space=1; space<=n-i; space++)
                System.out.print(" ");
            for (int j=1; j<=i; j++)
                System.out.print("*" + " ");

            System.out.println();
        }

        // Second Pyramid
        for (int i=1; i<=n; i++){
            for (int space=1; space<=n-i; space++)
                System.out.print(" ");
            for (int j=1; j<=i; j++)
                System.out.print("*" + " ");

            System.out.println();
        }

    }
}

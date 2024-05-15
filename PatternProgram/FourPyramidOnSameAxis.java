package PatternProgram;

import java.util.Scanner;

public class FourPyramidOnSameAxis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n =sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (i==j)
                    System.out.print(" " + " ");
                else if(i+j == n+1)
                    System.out.print(" " + " ");
                else
                    System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

/*
j1j2j3j4j5               space          space
- * * * -  => i=1 =>   i1 = j1 OR i1 + j5 = 6 (num+1)
* _ * _ *  => i=2 =>   i2 = j2 OR i2 + i4 = 6 (num+1)
* * - * *  => i=3 =>   i3 = j3 OR i3 + j3 = 6 (num+1)
* _ * _ *  => i=4 =>   i4 = j4 OR i4 + j2 = 6 (num+1)
_ * * * _  => i=5 =>   i5 = j5 OR i5 + j1 = 6 (num+1)

Algorithm:
1: start n=5
2: i=1...i=n {j=1...j=n}
3: if i==j : print space
4: else if i+j == num + 1 print space
5 else print *

 */
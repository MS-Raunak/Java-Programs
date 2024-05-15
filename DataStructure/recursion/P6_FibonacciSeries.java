package DataStructure.recursion;

import java.util.Scanner;

public class P6_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();

        for (int i=0; i<=n; i++) {
            System.out.print(fibo(i) + " ");;
        }
    }

    private static int fibo(int n) {
        //base case
        if (n==0 || n==1) return n;
        return fibo(n-1) + fibo(n-2);

        /*
          we can expand above statement
          int prev = fibo(n-1);
          int nextToPrev = fibo(n-2);
          int f = prev + nextToPRev
          return f;
         */
    }
}

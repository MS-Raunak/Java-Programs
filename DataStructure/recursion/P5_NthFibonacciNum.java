package DataStructure.recursion;

import java.util.Scanner;

public class P5_NthFibonacciNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();

        System.out.println(fibo(n));
    }

    private static int fibo(int n) {
        if (n==0 || n==1) return n;
        // prevVal + nextToPrevVal
        return fibo(n-1) + fibo(n-2);


    }


}

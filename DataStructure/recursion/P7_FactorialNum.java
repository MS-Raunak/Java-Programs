package DataStructure.recursion;

import java.util.Scanner;

public class P7_FactorialNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();

       int fact =  findFact(n);
        System.out.println("Factorial of " + n + "= " + fact);

    }

    private static int findFact(int n) {
        if (n==0) return 1;
        return  n * findFact(n-1);
    }
}

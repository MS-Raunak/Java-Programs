package NumberProgram;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of fibonacci series: ");
        int n = sc.nextInt();

        int a=0,b=1;
        for (int i=1; i<=n; i++){
            int c = a+b;
            System.out.print(a + " ");
            a=b;
            b=c;
        }
    }
}

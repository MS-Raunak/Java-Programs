package NumberProgram;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println(factorial(num));
    }

    private static int factorial(int num) {
        if (num==0 || num==1) return 1;
        int fact = 1;
        for (int i=num; i>0; i--){
            fact*=i;
        }
        return fact;
    }
}

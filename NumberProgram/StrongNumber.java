package NumberProgram;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (isStrong(num)) System.out.println(num + " is a Strong Number");
        else System.out.println(num + " is not a Strong Number");
    }

    //Checking strong number or not
    private static boolean isStrong(int num) {
        int sum=0;
        for (int i=num; i>0; i/=10){
            int digit=i%10;
            sum = sum + fact(digit);
        }
        if (sum==num) return true;
        return false;
    }

    //Factorial of each digit
    private static int fact(int num) {
        int fact=1;
        for (int i=num; i>0; i--){
            fact*=i;
        }
        return fact;
    }
}

/*
Strong Number : Sum of factorial of each digit = given number
EX: 145
    1! + 4! + 5! = 1+24+120 = 145
*/
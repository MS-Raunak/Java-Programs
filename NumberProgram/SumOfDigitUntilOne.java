package NumberProgram;

import java.util.Scanner;

public class SumOfDigitUntilOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        while (num>=1){
            int sum=0;
            for (int i=num; i>0; i/=10){
                int digit = i%10;
                sum+=digit;
            }
            System.out.println("Sum: " + sum);
            if (sum>9)
                num=sum;
            else return;
        }
    }
}

/*
Input a number and display the sum of all digit until number get single digit
EX:
9992 => Input
Expl:    9+9+9+2 = 29(Two Digit)
			 2+9 = 11(Two digit)
			 1+1 = 2  => OUTPUT
*/

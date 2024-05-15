package NumberProgram;

import java.util.Scanner;

public class PerfactNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (isPerfect(num)) System.out.println(num + " is a Perfact Number");
        else System.out.println(num + " is not a Perfact Number");
    }


    private static boolean isPerfect(int num) {
        int sum=0;
        for (int i=1; i<=num/2; i++){
           if (num%i==0){
               sum +=i;
           }
        }
        if (sum==num) return true;
        return false;
    }
}

/*
Perfect Number: GivenNum = sum of all divisor of given number except given number
EX: 6 = 1+2+3
   divisor(6) = 1,2,3 => 6 = 1+2+3
   Note: Number 6 will not be included

*/

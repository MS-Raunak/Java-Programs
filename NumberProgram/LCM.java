package NumberProgram;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();


        int leastMultiple=0;
        for (int i=num1; ; i++){
            if (i%num1==0 && i%num2==0){
                leastMultiple=i;
                break;
            }
        }
        System.out.println("LCM of " + num1 + " and " + num2 + "= " + leastMultiple);
    }
}

/*
LCM => The Least common multiples
The smallest value which is divisible by all the given numbers
10 is the smallest value which is divisible by 5 and 10
so the LCM of 5 and 10 is 10.
 */

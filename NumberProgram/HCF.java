package NumberProgram;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int maxDivisor=0;
        for (int i=1; i<=num1 && i<=num2; i++){
            if ((num1%i==0) && (num2%i==0))
                maxDivisor=i;
        }
        System.out.println("HCF of " + num1 + " and " + num2 + "= " + maxDivisor);
    }
}


/*
HCF means The Highest common factor
HCF(12 and 16) => Highest common factor = 4
=> the highest common factor 4 is HCF
 */
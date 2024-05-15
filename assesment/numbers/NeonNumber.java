package assesment.numbers;

import java.util.Scanner;


/**
 * square of number that is equal to the sum of their digit
 * EX: (9)^2 => 8 + 1 =9
 */
public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number:");
        int num = sc.nextInt();

        neon(num);
    }

    private static void neon(int num) {
        int sum=0;
        for (int i=num; i>0; i/=10) {
            sum += i%10;
        }

        if (sum==num) System.out.println("Neon Number");
        else System.out.println("Not a neon number");
    }
}

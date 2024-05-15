package interview;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CheckEvenWithoutUsingModulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if ((n & 1) == 0) System.out.println("Even");
        else System.out.println("Not Even");
    }
}


/*
Explanation:
- Binary representation of 1 is 1.
- Last digit of every odd number binary representation is 1
- Last digit of every even number binary representation is 0
for example:
bin(2)=10
bin(5)=101
2 & 1 => 10 & 1 => 0 means even number
5 % 1 => 101 & 1 => 1 means odd number
 */
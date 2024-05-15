package NumberProgram;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();

        System.out.println("Before swapping: " + num1 + ", " + num2);

        usingThirdVar(num1,num2);
        withoutThirdVar(num1,num2);
        withoutUsingPlusOperator(num1,num2);

    }


    //Using third variable
    private static void usingThirdVar(int num1, int num2) {
        System.out.println("\nUsing 3rd variable");
        int temp = num1;
        num1 = num2;
        num2=temp;

        System.out.println("After swapping: " + num1 + ", " + num2);
    }

    //Without using third variable
    private static void withoutThirdVar(int num1, int num2) {
        System.out.println("\nWithout using 3rd variable");
        num1 = num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swapping: " + num1 + ", " + num2);
    }

    //without using plus(+) operator
    private static void withoutUsingPlusOperator(int num1, int num2) {
        System.out.println("\nwithout using plus(+) operator");
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
        System.out.println("After swapping: " + num1 + ", " + num2);
    }
}

/*
XOR swapping algorithm with num1 = 8 and num2 = 15.

Binary Representation:

num1 = 8 in binary is 1000.
num2 = 15 in binary is 1111.
Step-by-Step Explanation:

Before Swapping:

num1 in binary: 1000
num2 in binary: 1111
First XOR Operation (num1 = num1 ^ num2):

num1 becomes 1000 ^ 1111 = 0111 (binary)
num2 remains 1111
Second XOR Operation (num2 = num1 ^ num2):

num1 remains 0111
num2 becomes 0111 ^ 1111 = 1000 (binary)
Third XOR Operation (num1 = num1 ^ num2):

num1 becomes 0111 ^ 1000 = 1111 (binary)
num2 remains 1000
After Swapping:

num1 in binary: 1111
num2 in binary: 1000

After the XOR swapping, the values are num1 = 15 and num2 = 8.
 */

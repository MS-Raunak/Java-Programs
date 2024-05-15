package assesment.numbers;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number-1:");
        int num1 = sc.nextInt();
        System.out.print("Enter number-2: ");
        int num2 = sc.nextInt();

        System.out.println("\nBefore Swapping:");
        System.out.println("num-1 = " + num1);
        System.out.println("num-2 = " + num2);

        swapTemp(num1, num2);
        swapWithoutTemp(num1, num2);
        swapWithoutArithmetic(num1, num2);
    }

    private static void swapTemp(int num1, int num2) {
        int temp = num1;
        num1=num2;
        num2=temp;

        System.out.println("\nAfter Swapping:");
        System.out.println("num-1 = " + num1);
        System.out.println("num-2 = " + num2);
    }

    private static void swapWithoutTemp(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1-num2;
        num1 = num1-num2;

        System.out.println("\nAfter Swapping:");
        System.out.println("num-1 = " + num1);
        System.out.println("num-2 = " + num2);
    }

    private static void swapWithoutArithmetic(int num1, int num2) {
        num1 = num1^num2;
        num2 = num1^num2;
        num1=num1^num2;

        System.out.println("\nAfter Swapping:");
        System.out.println("num-1 = " + num1);
        System.out.println("num-2 = " + num2);
    }




}

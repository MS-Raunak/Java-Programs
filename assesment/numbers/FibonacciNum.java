package assesment.numbers;

import java.util.Scanner;

public class FibonacciNum {
    //print fibonacci series for n length
    public static void fibo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length: ");
        int length = sc.nextInt();

        int a=0, b=1, c=0;

        for (int i=1; i<=length; i++) {
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
        }
    }

    //Fibonacci series upto n number
    public static void uptoFibo(int num) {
        int a=0, b=1;

        for (int i=1; ; i++){
            if (a < num) {
                System.out.print(a + " ");
                int c=a+b;
                a=b;
                b=c;
            }
            else break;
        }
    }

    // find nth fibonacci
    public static void nthFibo(int num) {
        int a=0,b=1;
        int count=0;

        for (int i=1; ; i++) {
            count++;
            if (count==num) {
                System.out.print(a + " ");
                break;
            }
            else {
                int c = a + b;
                a = b;
                b = c;
            }

        }
    }

    //Nth fibo recursively
    public static int findNthFibo(int num) {
        if (num==0 || num ==1) return num;
        return findNthFibo(num-1) + findNthFibo(num-2);
    }
    // Check the number is the part of fibo series or not
    public static void checkNumIfFibo(int num) {
        if (isPerfactSquare(5 * (num*num) + 4) || isPerfactSquare(5 * (num*num) - 4))
            System.out.println(num + " is a part of fibonacci series");
        else System.out.println("Given number is not available in fibonacci series");
    }

    private static boolean isPerfactSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return num == (sqrt*sqrt);
    }

    //Application Testing
    public static void main(String[] args) {
//        fibo();
//        uptoFibo(115);
        nthFibo(8);
//        checkNumIfFibo(55);
    }
}

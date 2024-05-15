package assesment.numbers;

import java.util.Scanner;

/**
 * number that equals the sum of the factorial of its digits.
 * EX 145 = 1! + 4! + 5!
 */
public class StrongNumber {
    // Strong number
    public static boolean isStrong(int num) {
        int sum=0;
        for (int i=num; i>0; i/=10){
           sum += factorial(i%10);
        }
        if (num==sum) return true;
        return false;
    }
    public static int factorial(int num) {
        if (num==0) return 1;
        return num*factorial(num-1);
        //int fact=1;
        //for (int i=1; i<=num; i++)  fact=fact*i;
    }

    //Strong number in range
    public static void strongInRange(int start, int end) {
        for (int num=start; num<=end; num++) {
            if (isStrong(num))
                System.out.println(num + " is a Strong Number");
        }
    }

    // Alternative Strong Number
    public static void alterStrong(int start, int end) {
        int count=0;
        for (int num=start; num<=end; num++){
            if (isStrong(num)){
                count++;
                if (count%2==0)
                    System.out.println(num + " is a Strong Number");
            }
        }
    }

    // Second last strong number
    public static void secondLastStrong(int start, int end) {
        int temp = start;
        start = end;
        end=temp;

        int count=0;

        for (int num=start; num>=end; num--){
            if (isStrong(num)){
                count++;
                if (count==2)
                    System.out.println(num + " is a Strong Number in given series");
            }
        }
    }

    //Test the application
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selct input\n1-input\n2-input");
        int ch = sc.nextInt();

        int n=0;
        int n2=0;
        switch (ch){
            case 1:
                System.out.println("Enter input: ");
                n = sc.nextInt();
                break;
            case 2:
                System.out.println("Enter input-1: ");
                n = sc.nextInt();
                System.out.println("Enter input-2: ");
                n2 = sc.nextInt();
                break;
            default:
                System.out.println("Please enter 1 or 2 only");
        }

//        System.out.println(isStrong(n));
//        strongInRange(n, n2);
//        alterStrong(n, n2);
        secondLastStrong(n, n2);
    }
}

package assesment.numbers;

import java.util.Scanner;

/**
 * Perfect Numbers: Numbers that are equal to the sum of
 * their proper divisors (excluding themselves).
 * EX: 6 = 1 + 2 + 3
 * 28 = 1 + 2 + 4 + 7 + 14
 */
public class PerfactNumber {
    //perfact number
    public static boolean isPerfact(int num) {
        int sum = 0;
        for (int i=1; i<=num/2; i++) {
            if (num%i==0)
                sum+=i;
        }
        if (sum==num) return true;
        return false;
    }

    // perfect number in range
    public  static void perfactInRange(int start, int end) {
        for (int num=start; num<=end; num++){
            if (isPerfact(num))
                System.out.println(num + " is a perfect number");
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

//        System.out.println(isPerfact(n));
        perfactInRange(n, n2);
    }
}

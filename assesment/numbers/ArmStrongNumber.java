package assesment.numbers;

import java.util.Scanner;

/**
 *  a number that is equal to the sum of its own digits each raised to the
 *  power of the number of digits.
 *  For example:
 *
 * 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 * 371 = 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371
 */
public class ArmStrongNumber {
    // Armstrong Number
    public static boolean isArmstrong(int num) {
        int powVal = countDigit(num);
        int sum=0;

        for (int i=num; i>0; i/=10){
            sum= (int) (sum+Math.pow(i%10, powVal));
        }
        if (sum==num) return true;
        return false;
    }
    //count digit
    public static int countDigit(int num) {
        int count=0;
        for (int i=num; i>0; i/=10) {
            count++;
        }
        return count;
    }

    // Armstrong in range
    public static void armstrongInRange(int start, int end) {
        for (int num=start; num<=end; num++) {
            if (isArmstrong(num))
                System.out.println(num + " is an Armstrong number");
        }
    }

    // Alternate armstrong number
    public static void alternate(int start, int end) {
        int count=0;
        for (int num=start; num<=end; num++) {
            if (isArmstrong(num)){
                count++;
                if (count%2==0)
                    System.out.println(num + " is an Armstrong number");
            }
        }
    }

    // Second last Armstrong number
    public static void secondLast(int start, int end) {
        int temp = start;
           start=end;
           end=temp;

        int count=0;

        for (int num=start; num>=end; num--) {
            if (isArmstrong(num)) {
                count++;
                if (count==2)
                    System.out.println(num + " is the second last Armstrong number in the given series");
            }
        }

    }
    //Test Application
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

//        System.out.println(isArmstrong(n));
//        armstrongInRange(n, n2);
//        alternate(n, n2);
        secondLast(n,n2);
    }


}

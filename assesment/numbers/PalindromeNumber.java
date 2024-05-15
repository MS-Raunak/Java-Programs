package assesment.numbers;

import java.util.Scanner;

public class PalindromeNumber {

    //Palindrome number
    public static boolean isPalindrome(int num) {
        int reverse=0;
        for (int i=num; i>0; i/=10) {
            reverse = reverse*10 + i%10;
        }

        if (reverse==num) return true;
        return false;
    }

    // Palindrome number in range
    public static void palindromeInRange(int start, int end) {
        for (int num=start; num<=end; num++) {
            if (isPalindrome(num))
                System.out.println(num + " is a palindrome number");
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

//        System.out.println(isPalindrome(n));
        palindromeInRange(n, n2);
    }
}

package NumberProgram;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) System.out.println(num + " is a Palindrome Number");
        else System.out.println(num + " is not a Palindrome Number");
    }

    private static boolean isPalindrome(int num) {
        int reverse=0;
        for (int i=num; i>0; i/=10){
            int digit=i%10;
            reverse=(reverse*10) + digit;
        }
        if (num==reverse) return true;
        return false;
    }
}

/*
The number which is same after reversing
101 => 101
 */

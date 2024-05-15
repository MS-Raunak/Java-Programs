package DataStructure.recursion;

import java.util.Scanner;

public class P3_PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();

        if (isPalindrome(s, 0, s.length()-1))
            System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }

    private static boolean isPalindrome(String s, int st, int lt) {  //first and last arg
        if (st >= lt) return true;

        s=s.toLowerCase();
        if (s.charAt(st)!=s.charAt(lt)) return false;

        return isPalindrome(s, st+1, lt-1);

    }
}

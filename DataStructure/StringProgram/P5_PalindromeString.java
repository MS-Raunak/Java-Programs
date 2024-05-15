package DataStructure.StringProgram;

import java.util.Scanner;

public class P5_PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();

//        if(isPalindrome(s)) System.out.println(s + " is Palindrome String");
//        else  System.out.println(s + " is not palindrome");

        if(checkPalindrome(s, 0, s.length()-1)) System.out.println(s + " is Palindrome String");
        else  System.out.println(s + " is not palindrome");


    }

    //Without Recursion
    private static boolean isPalindrome(String s) {
        char []chars = s.toLowerCase().toCharArray();
        int st = 0;
        int last = s.length()-1;

        while (st < last) {
            if (chars[st] != chars[last]) return false;
            else {
                st++;
                last--;
            }
        }
        return true;
    }


    //With Recursion
    private static boolean checkPalindrome(String s, int i, int j) {
        if (i >= j) return true;

        if (s.charAt(i)!=s.charAt(j)) return false;
        return checkPalindrome(s,i+1, j-1);
    }
}

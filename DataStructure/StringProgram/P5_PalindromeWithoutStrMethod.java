package DataStructure.StringProgram;

import java.util.Scanner;

public class P5_PalindromeWithoutStrMethod {
    public static void main(String[] args) {
        String s = "hello wow madam sir";

        Scanner sc = new Scanner(s);
        sc.useDelimiter(" ");

        while (sc.hasNext()){
            String str = sc.next();
            if (isPalindrome(str))
                System.out.println(str + " is Palindrome");
            else
                System.out.println(str + "  is not Palindrome");

        }
    }

    private static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String s = String.valueOf(sb.reverse());

        if (str.equals(s)) return true;
        return false;
    }
}

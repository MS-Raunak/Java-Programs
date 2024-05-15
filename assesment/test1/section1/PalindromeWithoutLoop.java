package assesment.test1.section1;

public class PalindromeWithoutLoop {
    public static void main(String[] args) {
        isPalindrome("malayalam");
    }

    private static void isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        String rev = new String(sb.reverse());

//        System.out.println(s.equals(rev));

        if (s.equals(rev))
            System.out.println("Palindrome");
        else System.out.println("Not Palindrome");

    }
}

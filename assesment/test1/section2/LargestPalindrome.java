package assesment.test1.section2;

public class LargestPalindrome {
    public static void main(String[] args) {
        String s = "madam lives in malayalam but maam is staying is oho";

        String[]strings = s.split(" ");

        String res="";
        for (String str: strings) {
            if (getPalindrome(str).length() > res.length()) {
                res = getPalindrome(str);
            }
        }
        System.out.println(res + " is a longest Palindrome word");
    }

    private static String getPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String rev = new String(sb.reverse());

        String palindrome="";
        if (rev.equals(str))
            palindrome=rev;

        return palindrome;
    }
}

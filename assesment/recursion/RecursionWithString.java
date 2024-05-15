package assesment.recursion;

public class RecursionWithString {
    //Driver method
    public static void main(String[] args) {

        /* *******REMOVE GIVEN OCCURRENCE CHARACTER ********* */
        //System.out.println(removeOccurrence("chhaya", 0));
        //System.out.println(removeOccurrence("chhaya"));

        /* ********REVERSE********* */
        //System.out.println(reverse("chhaya", 0));
        //System.out.println(reverse("chhaya"));

        /* ******** Palindrome String ********* */
        System.out.println(isPalindrome("madami", 0));

    }



    /******** Remove 'a' occurrence- Approach-1 *********/
    private static String removeOccurrence(String s, int i) {
        if (i==s.length())  return "";

        String str = removeOccurrence(s, i+1);
        char currentChar = s.charAt(i);
        if (currentChar!='a')
            return currentChar+str;
        else
            return str; //if only a chars found then it will return empty string ""
    }

    /*********** Remove 'a' occurrence- Approach-2 ***********/
    private static String removeOccurrence(String s) {
        if (s.isEmpty())  return "";

        String str = removeOccurrence(s.substring(1));
        char currentChar = s.charAt(0);
        if (currentChar!='a')
            return currentChar+str;
        else
            return str; //if only a chars found then it will return empty string ""
    }

    /*********** Reverse String: Approach-1 ***********/
    private static String reverse(String s, int i) {
        if (i==s.length()) return "";

        String str = reverse(s, i+1);
        return str + s.charAt(i);
    }

    /************** Reverse String: Approach-2 *********/
    private static String reverse(String s) {
        if (s.isEmpty()) return "";

        String str = reverse(s.substring(1));
        return str + s.charAt(0);
    }

    /************** Palindrome String: Approach-2 *********/
    private static boolean isPalindrome(String s, int i) {
       if (i>=s.length()/2) return true;

       if (s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
       return isPalindrome(s, i+1);
    }

}

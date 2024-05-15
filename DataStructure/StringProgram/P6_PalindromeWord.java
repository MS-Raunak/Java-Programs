package DataStructure.StringProgram;

public class P6_PalindromeWord {
    public static void main(String[] args) {
        String s = "madam sir wow";
        String strings[] = s.split(" ");

        for (int i=0; i< strings.length; i++){
            if(isPalindrome(strings[i])) System.out.println(strings[i] + " is Palindrome word");
        }
    }

    private static boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)) return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}

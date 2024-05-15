package DataStructure.StringProgram;

/**
 If two string are same, it's known as Anagram
 EX: s1 = "Hello"
     s2 = "Hello"
 */


public class P9_Anagram {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "heroo";

        if (isAngram(s1,s2)) System.out.println("Anagram");
        else System.out.println("NOT");
    }

    private static boolean isAngram(String s1,String s2) {
        if (s1.length()!=s2.length()) return false;
        for (int i=0; i<s1.length(); i++){
            if (s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
}

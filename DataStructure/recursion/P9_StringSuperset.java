package DataStructure.recursion;

/**
 * EX: String s = "abc"
 * output = {"abc", "ab", "ac", "bc", "a", "b", "c", " "} <= superset
 */



public class P9_StringSuperset {
    public static void main(String[] args) {
        String s = "abc";
        String curr = "";
        superSet(s, curr, 0);
    }

    private static void superSet(String s, String curr, int i) {
        if (i==s.length()){
            System.out.println(curr);
            return;
        }

        superSet(s, curr + s.charAt(i), i+1);
        superSet(s, curr,i+1);
    }
}

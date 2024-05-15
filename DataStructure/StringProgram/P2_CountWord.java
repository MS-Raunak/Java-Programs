package DataStructure.StringProgram;

public class P2_CountWord {
    public static void main(String[] args) {
        String s = "  My name is Ronu  ";
        System.out.println(countWord(s));
    }

    private static int countWord(String s) {
        char[]chars = s.toCharArray();
        int count=0;

        for (int i=0; i< chars.length; i++){
            if (i==0 && chars[i]!=' ') count++;
            else if (chars[i]!=' ' && chars[i-1]==' ') count++;
        }

        return count;
    }
}

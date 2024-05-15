package DataStructure.StringProgram;

public class P14_StringPermutation {
    public static void main(String[] args) {
        String str = "Abc";
        char[]chars = str.toCharArray();
        int length = chars.length-1;
        permutation(str, 0, length);
    }
    private static void permutation(String str, int st, int end) {
        if (st==end){
            System.out.println(str);
            return;
        }
        for (int i=st; i<=end; i++){
            String s1 = swap(str,st,i);
            permutation(s1, st+1, end);
        }
    }
    private static String swap(String str, int i, int j) {
        char[]chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;

        return new String(chars);
    }
}

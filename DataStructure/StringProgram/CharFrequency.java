package DataStructure.StringProgram;

public class CharFrequency {
    public static void main(String[] args) {
        String s = "  Java is mava";

        String[]strings = split(s.trim());
        //System.out.println(Arrays.toString(strings));

        for (int i=0; i< strings.length; i++) {
            strings[i] = reverse(strings[i]);
        }

        String res="";
        for (String str : strings){
            res+=str+" ";
        }
        System.out.println(res.trim());
    }

    private static String reverse(String str) {
        char[]chars = str.toCharArray();
        int i=0;
        int j= chars.length-1;

        String rev="";

        while (i<=j) {
            rev+=chars[j];
            j--;
        }

        return rev;
    }

    private static String[] split(String s) {
        char[]chars = s.toCharArray();
        String[]sp = new String[countWord(s)];
        String res = "";
        int idx=0;

        for (int i=0; i<s.length(); i++){
            if (i==0 && chars[i]!=' '){
                res+=chars[i];
            }
            else if (chars[i-1]==' ' && chars[i]!=' ') {
                res+=chars[i];
            }
            else if (chars[i]==' ' || i == chars.length-1){
                res+=chars[i];
                sp[idx++]=res;
                res="";
            }
            else res+=chars[i];
        }

        //System.out.println(Arrays.toString(sp));
        return sp;
    }

    private static int countWord(String s) {
        char[]chars = s.toCharArray();
        int count=0;

        for (int i=0; i< chars.length; i++) {
            if (i==0 && chars[i]!=' ') count++;
            else if (chars[i-1]==' ') count++;
        }
        System.out.println(count);
        return count;
    }


}

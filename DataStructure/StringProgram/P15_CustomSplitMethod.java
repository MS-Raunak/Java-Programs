package DataStructure.StringProgram;

import java.util.Arrays;

public class P15_CustomSplitMethod {
    public static void main(String[] args) {
        String s = " My name is Ronu";
        String[]sArr = split(s.trim());

        System.out.println(Arrays.toString(sArr));
    }

    //Custom Split
    private static String[] split(String s) {
        char[]chars = s.toCharArray();

        String temp = "";
        String[] cusArr = new String[countWord(s)];
        int idx=0;

        for (int i=0; i< chars.length; i++) {
            if (i==0 && chars[i]!=' ') temp+=chars[i];
            else if (chars[i]!=' ' && chars[i-1]==' ') temp+=chars[i];
            else if (chars[i]==' ' || i== chars.length-1){
                temp+=chars[i];
                cusArr[idx++] = temp;
                temp="";
            }
            else temp+=chars[i];
        }

        return cusArr;
    }

    //It will count the words and return as length of custom array
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

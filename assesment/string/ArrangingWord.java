package assesment.string;

import java.util.Arrays;

public class ArrangingWord {
    static String[]strArr;

    public static void main(String[] args) {
        String s = "you3 ar2e c4hhaya how1";
        arrange(s);
        System.out.println(Arrays.toString(strArr));
    }
    private static void arrange(String s) {
        String[]strings = s.split(" ");

        strArr = new String[strings.length];

        for (String str : strings) {
            findDigit(str);
        }
    }

    private static void findDigit(String str) {
        char[]chars = str.toCharArray();
        String index="";
        String word="";
        for (char ch : chars) {
            if (Character.isDigit(ch)) index+=ch;
            else word+=ch;
        }
        strArr[Integer.parseInt(index)-1] = word;
    }
}

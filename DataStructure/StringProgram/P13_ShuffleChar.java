package DataStructure.StringProgram;

import java.util.Random;

public class P13_ShuffleChar {
    public static void main(String[] args) {
        String s = "hello";
        char[]chars = s.toCharArray();

        Random random = new Random();

        for(int i=0; i< chars.length; i++){
            int j= random.nextInt(chars.length);
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        System.out.println(chars);
    }
}

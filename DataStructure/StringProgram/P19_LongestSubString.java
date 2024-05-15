package DataStructure.StringProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class P19_LongestSubString {
    public static void main(String[] args) {
        String s = "Ramayana";

        char[] chars = s.toCharArray();

        StringBuilder res = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();

        for (char ch: chars) {
           if (!set.contains(ch)){
               set.add(ch);
           }
           else {
              break;
           }
        }

        for (Object ch : set.toArray())
            res.append(ch);



        System.out.println(res);
    }

}





package DataStructure.StringProgram;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Find starting sub string without repeating character
 * EX:Ramayana
 * OP: Ram
 */
public class P19_FirstSubString {
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

        //Printing result
        for (Object ch : set.toArray())
            res.append(ch);

        System.out.println(res);
    }

}





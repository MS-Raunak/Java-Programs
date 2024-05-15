package DataStructure.StringProgram;

import java.util.HashMap;


public class P11_CharFrequency {
    public static void main(String[] args) {
        String s = "abacbbaba";
        countFrequency(s);
    }


    private static void countFrequency(String s) {
        char[] chars = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (char ch : chars) {
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else map.put(ch, 1);
        }

        //Displaying Character Frequency
        /*for (char ch : map.keySet()){
            System.out.println(ch + "=" + map.get(ch));
        }*/

        //Displaying using lambda java8
        map.forEach((key,val)->{
            System.out.println(key+":"+val);
        });

    }
}

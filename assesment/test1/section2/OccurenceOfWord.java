package assesment.test1.section2;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfWord {
    public static void main(String[] args) {
        occurance("Hello Chhaya Hello Shanaya Hello");
    }

    private static void occurance(String str) {
        String[]strings = str.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            if (map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            }
            else {
                map.put(s, 1);
            }
        }


        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

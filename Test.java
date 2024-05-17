import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String s = sc.next();
        test(s);
    }

    private static void test(String s) {
        char[]chars = s.toCharArray();

//        for (int i=0; i< chars.length; i++) {
//            int count=1;
//            for (int j=i+1; j< chars.length; j++) {
//                if (chars[i]==chars[j]) {
//                    count++;
//                    chars[j] = ' ';
//                }
//            }
//
//            if (chars[i]!=' '){
//                System.out.println(chars[i]+": " + count);
//            }
//        }

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : chars) {
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }

        map.forEach((key, val) -> {
            System.out.println(key+": " + val);
        });

    }
}

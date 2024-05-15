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

        String res="";

        for (int i=0; i< chars.length; i++) {
            for (int j=i+1; j< chars.length; j++) {
                if (chars[i]==chars[j])
                    chars[j]=' ';
            }

            if (chars[i]!=' '){
                res+=chars[i];
            }
        }
        System.out.println(res);
    }
}

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

        int sum=0;
        String res="";

        for (char ch: chars) {
            if (!Character.isDigit(ch)){
                if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
                    res+=ch;
            }
        }

//        System.out.println(sum);
        System.out.println(res);
    }
}

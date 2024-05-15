package assesment.test1.section1;

public class SumOfAllDigitInString {
    public static void main(String[] args) {
        sum("he4ll2o4");
    }

    private static void sum(String s) {
        char[]chars =s.toCharArray();
        int sum=0;
        for (char ch : chars) {
            if (Character.isDigit(ch)) sum+=Integer.parseInt(ch+"");
        }
        System.out.println(sum);
    }
}

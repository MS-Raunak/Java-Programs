package DataStructure.StringProgram;

public class P18_SumOfDigitInString {
    public static void main(String[] args) {
        String s = "4Raunak@1234";

        char[]chars = s.toCharArray();

        int sum=0;
        for (char ch : chars) {
            if (Character.isDigit(ch)){
                sum+=Integer.parseInt(ch+"");
            }
        }

        System.out.println(sum); //14
    }
}

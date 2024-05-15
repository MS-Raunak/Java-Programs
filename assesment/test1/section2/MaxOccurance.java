package assesment.test1.section2;

//Replace Max occurrence with next char
public class MaxOccurance {
    public static void main(String[] args) {
        String s = "hello";
        replace(s);
    }

    private static void replace(String s) {
        char[]chars = s.toCharArray();
        int max=0;
        char maxOccChar=' ';
        for (int i=0; i< chars.length; i++) {
            int count=1;
            for (int j=i+1; j< chars.length; j++) {
                if (chars[i]==chars[j]) {
                    chars[j] = ' ';
                    count++;
                }
            }
            if (chars[i]!=' ' && count > max){
                max=count;
                maxOccChar = chars[i];
            }
        }
        String res="";
        for (char ch : s.toCharArray()) {
            if (ch==maxOccChar) {
                ch = (char) (ch+1);
                res += ch;
            }
            else res += ch;
        }
        System.out.println(res);
    }
}

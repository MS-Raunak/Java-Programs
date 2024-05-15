package assesment.test1.section3;

public class ReplaceMaxOcc {
    public static void main(String[] args) {
        replace("hello");
    }

    private static void replace(String s) {
        char[]chars = s.toCharArray();
        int max=0;
        char ch=' ';

        for (int i=0; i< chars.length; i++) {
            int count = 0;
            for (int j=i+1; j< chars.length; j++) {
                if (chars[i]==chars[j]){
                    count++;
                    chars[j]=' ';
                }
            }
            if (chars[i]!=' ' && count > max) {
                max=count;
                ch = chars[i];
            }
        }

        String res="";
        for (char c : s.toCharArray()) {
            if (c==ch){
                res+='$';
            }
            res+=c;
        }
        System.out.println(res);
    }
}

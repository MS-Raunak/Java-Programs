package DataStructure.StringProgram;

public class P3_MaxOccurrence {
    public static void main(String[] args) {
        String s = "hello";
        char[]chars = s.toCharArray();

        int max=0;
        char ch=' ';

        for (int i=0; i< chars.length; i++){
            int count=1;
            for (int j=i+1; j< chars.length; j++){
                if (chars[i]==chars[j]){
                    count++;
                    chars[j]=' ';
                }
            }
            if (chars[i]!=' ' && max<count){
                max=count;
                ch=chars[i];
            }
        }

        System.out.println("Max occured character is " + ch + "= " + max);
    }
}

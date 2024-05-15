package DataStructure.StringProgram;

public class P4_MinOccurrence {
    public static void main(String[] args) {
        String s = "chhayaa";
        int min=s.length();
        char[]chars = s.toCharArray();
        char ch= ' ';

        for (int i=0; i< chars.length; i++){
            int count=1;
            for (int j=i+1; j< chars.length; j++){
                if (chars[i]==chars[j]){
                    count++;
                    chars[j]=' ';
                }
            }
            if (chars[i]!=' ' && min>count){
                min=count;
                ch=chars[i];
            }
        }
        System.out.println("Minimum occured character is " + ch + "= " + min);
    }
}

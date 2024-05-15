package DataStructure.StringProgram;

public class P10_CountOccurrence {
    public static void main(String[] args) {
        String s = "hello";
        char[]chars = s.toCharArray();

        for (int i=0; i<s.length(); i++){
            int count=1;
            for (int j=i+1; j<s.length(); j++){
                if (chars[i]==chars[j]){
                    count++;
                    chars[j]=' ';
                }
            }
            if (chars[i]!=' '){
                System.out.println(chars[i] + "= " + count);
            }
        }
    }
}

package assesment.test1.section3;

//Replace repeated char with underscore
//EX:Class => Cla__
public class RemoveRepeatedChar {
    public static void main(String[] args) {
        String s = "Class";
        replace(s);
    }

    private static void replace(String s) {
        char[]chars = s.toCharArray();
        for (int i=0; i< chars.length; i++) {
            boolean isRepeated = false;
            for (int j=i+1; j<chars.length; j++){
                if (chars[i]==chars[j]) {
                    isRepeated=true;
                    chars[j]='_';
                }

            }
            if (isRepeated && chars[i]!=' ') chars[i]='_';
        }

        System.out.println(chars);
    }
}

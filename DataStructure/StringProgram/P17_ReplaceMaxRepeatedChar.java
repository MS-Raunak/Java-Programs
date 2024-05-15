package DataStructure.StringProgram;

public class P17_ReplaceMaxRepeatedChar {
    public static void main(String[] args) {
        String s = "Ramayana";

        //replace(s); // R$m$y$n$
        replaceWithAscii(s);
    }

    //Replace max Occurring character with $
    private static void replace(String s) {
        char[]chars = s.toCharArray();
        int max=0;

        char ch =' ';

        for (int i=0; i< chars.length; i++){
            int count=1;
            for (int j=i+1; j< chars.length; j++){
                if (chars[i]==chars[j]){
                    count++;
                   chars[j]='/';
                }
            }
            if (chars[i]!='/' && max < count) {
                max=count;
                ch = chars[i];
            }
        }

        //Replacing
        char[]res = s.toCharArray();
        for (int i=0; i< res.length; i++) {
            if (res[i]==ch)
                res[i]='$';
        }
        System.out.println(res);
    }

    //Replace max Occurring character with ASCII
    private static void replaceWithAscii(String s) {
        char[]chars = s.toCharArray();

        int max=0;
        char resChar=' ';

        for (int i=0; i< chars.length; i++) {
            int count=1;
            for (int j=i+1; j< chars.length; j++) {
                if (chars[i]==chars[j]) {
                    count++;
                    chars[j]=' ';
                }
            }

            if (chars[i]!=' ' && max < count) {
                max=count;
                resChar = chars[i];
            }
        }

        int ascii = resChar;
        char[]chars1 = s.toCharArray();
        StringBuilder res = new StringBuilder();

        for (char ch : chars1) {
            if (ch==resChar) res.append(ascii);
            else res.append(ch);
        }

        System.out.println(res);
    }
}

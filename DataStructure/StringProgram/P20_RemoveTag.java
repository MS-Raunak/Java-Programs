package DataStructure.StringProgram;

public class P20_RemoveTag {
    public static void main(String[] args) {
        String s = "<h1>Hello World</h1><h2>Chhaya</h2>";
        removeTag(s);
    }

    private static void removeTag(String s) {
        char[]chars = s.toCharArray();
        boolean flag=true;
        String res="";

        for (int i=0; i< chars.length; i++) {
            if (chars[i]=='<') flag=false;
            else if (chars[i]=='>') {
                flag=true;
                continue;
            }
            if (flag){
                res+=chars[i];
            }
        }
        System.out.println(res);
    }
}

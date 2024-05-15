package DataStructure.StringProgram;

public class P8_Panagram {
    public static void main(String[] args) {
        String s = "zabcdefghijklmnopqrstuvwxyz";
        if (isPanagram(s)) System.out.println("Panagram");
        else System.out.println("NOT");
    }

    private static boolean isPanagram(String s) {
        if (s.length()<26) return false;
        int i=0;
        for (char ch='a'; ch<='z'; ch++){
            if (s.charAt(i)!=ch) return false;
            else i++;
        }
        return true;
    }
}

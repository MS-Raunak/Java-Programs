package DataStructure.StringProgram;

public class P22_RemoveAllSpace {
    public static void main(String[] args) {
        String s = "Hello  World";

        System.out.println(s.replaceAll("\\s", ""));
    }
}

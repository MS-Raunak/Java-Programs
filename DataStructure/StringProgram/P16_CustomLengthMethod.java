package DataStructure.StringProgram;

import java.util.Scanner;

public class P16_CustomLengthMethod {
    public static void main(String[] args) {
        String s = "Welcome";

        lenUsingStringMethod(s);
        lenWithoutUsingStringMethod(s);
    }

    //Approach-1: using String inbuilt method
    private static void lenUsingStringMethod(String s) {
        char[]chars = s.toCharArray();

        int count=0;
        for (char ch : chars) count++;

        System.out.println("Length of given string: " + count);
    }

    //Approach-2: Without using String inbuilt method(Scanner's method)
    private static void lenWithoutUsingStringMethod(String s) {
        Scanner sc = new Scanner(s);

        sc.useDelimiter("");

        int count=0;
        while (sc.hasNext()) {
            count++;
            sc.next();
        }

        System.out.println("Length of given string: " + count);
    }
}

package DataStructure.StringProgram;

import java.util.Scanner;


//Finding length without using string inbuilt method
public class P12_LengthWithoutInbuiltMethod {
    public static void main(String[] args) {
        String s = "Chhaya";
        findLength(s);
    }

    private static void findLength(String s) {
        Scanner sc  = new Scanner(s);
        sc.useDelimiter("");
        int count = 0;

        while (sc.hasNext()){
            count++;
            sc.next();
        }
        System.out.println(count);

    }
}

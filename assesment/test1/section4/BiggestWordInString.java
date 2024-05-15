package assesment.test1.section4;

import java.util.Scanner;

//BiggestWord in String Without using any String method
public class BiggestWordInString {
    public static void main(String[] args) {
        String s = "Hello I am Chhaya or Shanaya";

        Scanner sc = new Scanner(s);
        sc.useDelimiter(" ");

        int max=0;
        String max_res="";

        while (sc.hasNext()) {
            String s1 = sc.next();
            int current =greater(s1);
           if (current > max) {
               max = current;
               max_res=s1;
           }
        }
        System.out.println(max_res);
    }

    private static int greater(String s) {
        Scanner sc = new Scanner(s);
        sc.useDelimiter("");
        int count=0;
        while (sc.hasNext()){
            count++;
            sc.next();
        }

        return count;
    }
}

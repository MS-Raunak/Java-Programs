package DataStructure.StringProgram;

import java.util.Arrays;
import java.util.Scanner;

public class P1_ReverseString {
    public static void main(String[] args) {
        String s = "namaste world";

        reverseChar(s); //OP: dlrow etsaman
        reverseWord(s); // world namaste
        reverseWordUsingSplit(s); // world namaste
       reverseWordWithoutAnyStringMethod(s);//world namaste
        reverseWordsChars(s); // etsaman dlrow
    }


    //Reverse Character from given string
    private static void reverseChar(String s) {
        String rev="";
        for (int i = s.length()-1; i>=0; i--){
            rev+=s.charAt(i);
        }
        System.out.println("Reverse String: " + rev);
    }

    //Reverse Word without using split method
    private static void reverseWord(String s){
        char[]chars = s.toCharArray();
        String temp = "";
        String rev="";
        for (int i=0; i<s.length(); i++){
            temp+=chars[i];
            if (chars[i]==' ' || i== chars.length-1){
                if (temp.length()>=1){
                    rev = temp + " " + rev;
                }
                temp="";
            }
        }
        System.out.println("Reverse Word: " + rev);
    }

    //Reverse Word using split method
    private static void reverseWordUsingSplit(String s){
        String[] strings = s.split(" ");
        String rev="";
        for (int i= strings.length-1; i>=0; i--){
            if (i>0)rev+=strings[i] + " ";
            else rev+=strings[i];
        }
        System.out.println("Reverse Word: " + rev);
    }

    //Reverse Word using Scanner's class method
    private static void reverseWordWithoutAnyStringMethod(String s) {
        Scanner sc = new Scanner(s);

        sc.useDelimiter(" ");

        String rev="";
        while (sc.hasNext()) {
            rev = sc.next()+" " + rev;
        }
        System.out.println("Reverse Word: " + rev.trim());
    }

    //Reverse character of the word
    private static void reverseWordsChars(String s) {
        String[]strings = s.split(" ");

        for (int i=0; i< strings.length; i++) {
           strings[i] =  reverse(strings[i]);
        }

        System.out.println(Arrays.toString(strings));
    }

    private static String reverse(String str) {
        char[]chars = str.toCharArray();

        int i=0;
        int j=str.length()-1;

        String res="";
        while (i<=j){
            res+=chars[j--];
        }
        return res;
    }
}

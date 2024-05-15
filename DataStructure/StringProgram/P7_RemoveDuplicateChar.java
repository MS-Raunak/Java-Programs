package DataStructure.StringProgram;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P7_RemoveDuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any string: ");
        String s = sc.next();

        System.out.println(removeFirstApproach(s));
        System.out.println(removeSecondApproach(s));
        System.out.println(removeThirdApproach(s));
        removeFourthApproach(s);
    }

    //First Approach - remove duplicate character from string
    private static String removeFirstApproach(String s) {
        char[]chars = s.toCharArray();
        String temp="";
        for (int i=0; i< chars.length; i++){
            for (int j=i+1; j< chars.length; j++){
                if (chars[i]==chars[j]){
                    chars[j]='.';
                }
            }
            if (chars[i]!='.'){
                temp+=chars[i];
            }
        }
        return temp;
    }

    //Second Approach - remove duplicate character
    private static String removeSecondApproach(String s) {
        char[]chars = s.toCharArray();
        StringBuilder res = new StringBuilder();

        for (int i=0; i< chars.length; i++) {
            boolean repeated=false;
            for (int j=i+1; j< chars.length; j++){
                if (chars[i]==chars[j]){
                    repeated=true;
                    break;
                }
            }
            if (!repeated){
                res.append(chars[i]);
            }
        }

        return new String(res);
    }

    //Third Approach - Remove duplicate char
    private static String removeThirdApproach(String s) {
        char[]chars = s.toCharArray();

        StringBuilder res = new StringBuilder();
        for (char ch : chars) {
            if (res.toString().indexOf(ch)==-1){
                res.append(ch);
            }
        }
        return res.toString();
    }

    //Fourth Approach - Remove duplicate char
    private static void removeFourthApproach(String s){
        char[]chars = s.toCharArray();
        Set<Character>set = new HashSet<>();

        for (char ch : chars) {
            set.add(ch);
        }

        StringBuilder res = new StringBuilder();

        for (char ch : set) {
            res.append(ch);
        }

        System.out.println(res);
    }
}

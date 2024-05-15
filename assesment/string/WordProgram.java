package assesment.string;

import java.util.Arrays;
import java.util.Random;

/**
 * 1. Write a program to count total number of word in the given string
 * 2. Reverse each word of given string (Ex: input: ma'am is madam output: madam is ma'am)
 * 3. Check the number of palindrome words in given string.
 * 4. String permutation
 * 5. Word Shuffling
 * 6. Remove TAG
 * 7. Arranging Word //see the program in seperate class
 * 8. Reverse character of each word
 */
public class WordProgram {

    //App Driver
    public static void main(String[] args) {
        //countWord("  Chhaya    is Shanaya");
       // reverseWord("Chhaya is Shanaya");
        //palindromeWord("Hello sir and madam wow");
        //permutation("abc", 0, "abc".length());
        //wordShuffle("Mai Chhaya or Shanaya");
        //removeTag("<p>Hello Chhaya!</p>");
        //reverseCharOfWord("java is easy");
        //maxRepeatedWord("hello chhaya hey chhaya hello hello hello");
        secondMaxRepeatedWord("hello chhaya hey chhaya hello hello hello");
    }

    //1. Count Word
    public static void countWord(String s) {
        int count=0;
        for(int i=0; i<s.length(); i++) {
            if ((i==0 && s.charAt(i)!=' '))
                count++;
            else if (i>0 && s.charAt(i)!=' ' && s.charAt(i-1)==' ') count++;
        }
        System.out.printf("Number of word= " + count);
    }

    // 2. Reverse Word using split method
    public static void reverseWord(String s) {
        String[] strings = s.split(" ");
        String res = "";
        for (int i= strings.length-1; i>=0; i--) {
           res +=strings[i]+" ";
        }
        System.out.printf(res.trim());
    }

    // 3. Palindrome word
    public static void palindromeWord(String s) {
        String[]strArr = s.split(" ");

        for (int i=0; i<strArr.length; i++) {
            if (palindrome(strArr[i]))
                System.out.println(strArr[i] + " is palindrome");
        }
    }
    private static boolean palindrome(String s) {
        int i=0;
        int j=s.length()-1;

        while (i<j) {
            if (s.charAt(i)!=s.charAt(j)) return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }

    // 4. String permutation
    public static void permutation(String s, int st, int end){
        if (st==end){
            System.out.println(s);
            return;
        }
        for (int i=st; i<s.length(); i++) {
            String str = swap(s, st, i);
            permutation(str, st+1,end);
        }
    }
    public static String swap(String s, int i, int j){
        char[]chars = s.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }

    //5. Word Shuffling
    public static void wordShuffle(String s) {
        String[] strings = s.split(" ");

        Random random = new Random();
        for (int i=0; i< strings.length; i++) {
            int j = random.nextInt(strings.length);
            String temp = strings[i];
            strings[i] = strings[j];
            strings[j] = temp;
        }
        System.out.println(Arrays.toString(strings));
    }

    //6. Remove TAG
    public static void removeTag(String s) {
        String res="";
        boolean flag=true;

        for (char ch : s.toCharArray()) {
            if (ch=='<') flag=false;
            else if (ch=='>'){
                flag=true;
                continue;
            }
            if (flag) res+=ch;
        }
        System.out.println(res);
    }

    // 8. Reverse character of each word
    public static void reverseCharOfWord(String s) {
        String[]strings = s.split(" ");
        String res ="";
        for (int i=0; i< strings.length; i++) {
            String revWord = reverseChar(strings[i]);
            res+=revWord+" ";
        }

        System.out.println(res.trim());
    }
    public static String reverseChar(String s) {
        String revStr="";
       for (int i=s.length()-1; i>=0; i--) revStr+=s.charAt(i);
       return revStr;
    }

    //Find Max Repeated Word
    public static void maxRepeatedWord(String s) {
        String[]strings = s.split(" ");
        if (strings.length == 1) {
            System.out.println(s);
            return;
        }
        int max=0;
        String w="";
        for (int i=0; i< strings.length; i++) {
            int count=1;
            for (int j=i+1; j< strings.length; j++){
                if (strings[i].equals(strings[j])){
                    count++;
                    strings[j] = " ";
                }
            }
            if (!strings[i].equals(" ") && max <count){
                w=strings[i];

                max=count;
            }
        }
        System.out.println(w + ": " + max);
    }

    public static void secondMaxRepeatedWord(String s) {
        String[]strings = s.split(" ");
        if (strings.length==1){
            System.out.println(s + ":" + 1);
            return;
        }

        int max=0;
        int secMax=0;
        String maxWord="";
        String secMaxWord="";

        for (int i=0; i< strings.length; i++){
            int count=0;
            for (int j=i+1; j< strings.length; j++) {
                if (strings[i].equals(strings[j])){
                    count++;
                    strings[j]=" ";
                }
            }
            if (!strings[i].equals(" ")){
                if (max < count) {
                    secMax=max;
                    secMaxWord = maxWord;
                    max=count;
                    maxWord=strings[i];
                }
                else if (count > secMax && count < max ){
                    secMax=count;
                    secMaxWord = strings[i];
                }
            }
        }
        if (!secMaxWord.equals(" "))
            System.out.println(secMaxWord + " is the second max occurred word");
    }
}

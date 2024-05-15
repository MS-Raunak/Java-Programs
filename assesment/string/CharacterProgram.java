package assesment.string;

import java.util.*;


/**
 * 1.   to find length of given string without using length method
 * 2. Write a program to find length without using any string method.
 * 3. Write a program to check whether the given string palindrome or not
 * 4. Write a program to convert given string in lowercase.
 * 5. Write a program to convert given string in uppercase.
 * 6. Write a program to convert character of given string in uppercase to lower and vice-versa.
 * 7. Write a program to convert first character of given string in uppercase and remaining in lowercase.
 * 8. Write a program to find minimum occurrence of character.
 * 9. Write a program to find maximum occurrence of character.
 * 10. Write a program to count occurrence of each characte.
 * 11. Write a program to Remove duplicate character.
 * 12. Write a program to find Missing Character
 * 13. Write a program to Find index number of given character in specified string.
 * 14. Write a program to Find Character Frequency or occurrence of character using Map.
 * 15. Write a program to check whether the given string is Anagram or not.
 * 16. Write a program to check whether the given string P anagram or not.
 * 17. Write a program to Shuffle character of given string.
 * 18. Write a program to arranging character of given string.
 * 19. Write a program to find sum of digit which are present in given string(Ra123=>6ans)
 * 20. Write a program to find 2nd max occurrence char.
 * 21. Write a program to replace given character with its occurrence(abcb => replace b => a1c2ans)
 * 22. Write a java program to replace max occurrence char with their ascii value.
 * 23. Write a java program to find first non-repeating char ing given String.
 * 24. Write a java program to Reverse String using StringBuffer
 * 25. Write a java program to Reverse String using StringBuilder
 * 26. Write a java program to Remove Special Character of given string
 * 27. Write a java program to Remove White Spaces in given string
 * 28. Write a java program to Remove duplicate characters in given string
 */

public class CharacterProgram {
    //App driver
    public static void main(String[] args) {
        //lengthWithoutLength("Chhaya");
        //lengthWithoutStrMethod("Chhaya");
        //isPalindrome("madam");
        //convertLower("CHHAYA");
        //convertUpper("chhaya");
        //convertLetterCase("Chhaya");
        //convertFirstCharUpper("  RAunAk");
        //maxOccurance("Chhaya");
        //minOccurance("Chhayan");
        //charOccurrences("Chhaya");
        //removeDuplicate("chhaya");
        //missingChar("chhaya");
        frequencyOfChar("chhaya");
        //anagram("Ram", "Rama");
        //panagram("abcddefghjklmnopqrstuvwxyzi");
        //suffleChar("abc");
        //sortingChar("bca");
        //sumOfNumChar("2Ch1haya@1239");
         //secondMaxOccurrenceChar("success");
        //replaceCharacter("opentext", 't');
       // replaceMaxOccurrenceWithAscii("banana");
       // firstNonRepeatChar("acbdanadbnac");
        //reverseStringUsingStrBuff("hello");
       // reverseStringUsingStrBuilder("hello");
       // removeSpecialChar("Chhaya@123");
       // removeWhiteSpace(" C hh ay a");
        //removeDuplicateChar("hello");

    }

    //1. Length of String without length method
    public static void lengthWithoutLength(String s) {
        char[]chars = s.toCharArray();
        int length=0;
        for (char ch : chars) length++;
        System.out.println("Length of given string: " + length);
    }

    //2. Length of string without any string method
    public static void lengthWithoutStrMethod(String s) {
        Scanner sc = new Scanner(s);
        sc.useDelimiter("");

        int length=0;
        while (sc.hasNext()){
            sc.next();
            length++;
        }

        System.out.println("Length of given string: " + length);
    }

    //3. Palindrome String
    public static void isPalindrome(String s) {
        char []chars = s.toCharArray();
        int st=0;
        int end= chars.length-1;

        while (st<end) {
            if (chars[st] != chars[end]) {
                System.out.println("Not Palindrome");
                return;
            }
            st++;
            end--;
        }
        System.out.println("Palindrome String");
    }

    //4. Convert to Lower
    public static void convertLower(String s) {
        char[]chars = s.toCharArray();
        String res="";

        for (int i=0; i< chars.length; i++) {
            if (chars[i] < 97) {
                chars[i] = (char) (chars[i] + 32);
                res+=chars[i];
            }
            else res+=chars[i];
        }
        System.out.println(res);
    }

    //5. Convert to Upper
    public static void convertUpper(String s) {
        char[] chars = s.toCharArray();
        String res="";

        for (char ch : chars) {
            if (ch >= 97) {
                ch = (char) (ch-32);
                res+=ch;
            }
            else res+=ch;
        }
        System.out.println(res);
    }

    //6. Convert upper to lower & lower to upper
    public static void convertLetterCase(String s) {
        char[] chars = s.toCharArray();
        String res="";

        for (char ch : chars) {
            if (ch >=97){
                ch= (char) (ch-32);
                res+=ch;
            }
            else {
                ch= (char) (ch+32);
                res+=ch;
            }
        }
        System.out.println(res);
    }

    //7. Converted First Char in Capital letter
    public static void convertFirstCharUpper(String s) {
        s = s.trim();
        char[]chars = s.toCharArray();
        for (int i=0; i< chars.length; i++) {
            if (chars[0] >= 97)
                chars[0] = (char) (chars[0] - 32);
            else if (i>=1){
                if(chars[i] < 97) chars[i] = (char) (chars[i] + 32);
            }
        }
        System.out.println(chars);
    }

    //8. Max Occurrence
    public static char maxOccurance(String s) {
        char[]chars = s.toCharArray();
        int max=1;
        char ch=' ';

        for (int i=0; i< chars.length; i++) {
            int count=1;
            for (int j=i+1; j< chars.length; j++) {
                if (chars[i]==chars[j]){
                    chars[j]='0';
                    count++;
                }
            }
            if (chars[i]!='0' && max < count){
                ch=chars[i];
                max=count;
            }
        }
//        System.out.println("Max Occured char: " + ch + " " + max);
        return ch;
    }

    //9. min occurrence
    public static void minOccurance(String s) {
        char[]chars = s.toCharArray();
        int min= chars.length;
        char ch=' ';

        for (int i=0; i< chars.length; i++) {
            int count=1;
            for (int j=i+1; j< chars.length; j++) {
                if (chars[i]==chars[j]){
                    chars[j]='0';
                    count++;
                }
            }
            if (chars[i] != '0' && min >= count){
               if (min==count)
                   System.out.println("Min Occured char: " + ch + " " + min);
                ch=chars[i];
                min=count;
            }
        }
        System.out.println("Min Occured char: " + ch + " " + min);
    }

    //10. Count occurrences of chars
    public static void charOccurrences(String s) {
        char[]chars = s.toCharArray();

        for (int i=0; i< chars.length; i++) {
            int count = 1;
            for (int j=i+1; j< chars.length; j++){
                if (chars[i]==chars[j]){
                    chars[j]='0';
                    count++;
                }
            }
            if (chars[i]!='0'){
//                System.out.print(chars[i] + "" + count);
                System.out.println(chars[i] + ": " + count);
            }
        }
    }

    //11. Remove duplicate char
    public static void removeDuplicate(String s) {
        char[] chars = s.toCharArray();
        String res = "";
        for (int i=0; i< chars.length; i++){
            for (int j=i+1; j< chars.length; j++){
                if (chars[i]==chars[j])
                    chars[j]='0';
            }
            if (chars[i]!='0')
                res += chars[i];
        }
        System.out.println(res);
    }

    //12. Missing char
    public static void missingChar(String s) {
        s=s.toLowerCase();

        for (char ch='a'; ch<='z'; ch++) {
            if (indexOfChar(s, ch)==-1) {
                System.out.print(ch);
            }

        }
    }

    //13. index number of character
    public static int indexOfChar(String s, char ch ) {
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == ch) return 1;
        }
        return -1;
    }

    //14. character frequency
    public static void frequencyOfChar(String s) {
        char[]chars = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : chars) {
            if (map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
            else  map.put(ch, 1);
        }
        for (Map.Entry<Character, Integer> entry: map.entrySet())
           System.out.println(entry.getKey() + ":" + entry.getValue());
    }

    //15. Anagram
    public static void anagram(String s1, String s2) {
        if (s1.length()!=s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        for (int i=0; i<s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }

    //16. Panagram
    public static void panagram(String s) {
        if (s.length() < 26){
            System.out.println("Not Panagram");
            return;
        }

        for (char ch='a'; ch<='z'; ch++) {
            if (indexOfChar(s, ch)==-1){
                System.out.println("Not Panagram");
                return;
            }
        }
        System.out.println("Panagram");
    }

    //17. Suffle Character
    public static void suffleChar(String s) {
        char[]chars = s.toCharArray();
        Random random = new Random();

        for (int i=0; i<chars.length; i++){
           int j = random.nextInt(chars.length);
           char temp = chars[i];
           chars[i] = chars[j];
           chars[j] = temp;
        }
        System.out.println(chars);
    }

    //18. Arranging Character
    public static void sortingChar(String s) {
        char[]chars = s.toCharArray();

        for (int i=0; i<chars.length; i++) {
            for (int j=i+1; j<chars.length; j++){
                if (chars[i] > chars[j]){
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        System.out.println(chars);

        //Second Approach
        char[]chars1 = s.toCharArray();
        Arrays.sort(chars1);
        System.out.println(new String(chars1));
    }

    //19. Sum of character which are present in string
    public static void sumOfNumChar(String s) {
        int sum = 0;

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)>= '0' && s.charAt(i) <='9'){
                //sum+= Integer.parseInt(String.valueOf(s.charAt(i)));
                //sum += s.charAt(i)-'0';
                int num =Integer.parseInt( s.charAt(i)+"");
                sum += num;
            }
        }
        System.out.println(sum);
    }

    //20. Second max occurrence character
    public static void secondMaxOccurrenceChar(String s) {
        char[] chars = s.toCharArray();
        int firstMax = 0;
        int secondMax = 0;
        char maxChar = ' ';
        char secondMaxChar = ' ';

        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = ' ';
                }
            }
            if (chars[i]!=' ') {
                if (count > firstMax) {
                    secondMax = firstMax;
                    secondMaxChar= maxChar;
                    firstMax=count;
                    maxChar=chars[i];
                }
                else if (count > secondMax && count < firstMax){
                    secondMax=count;
                    secondMaxChar = chars[i];
                }
            }
        }
        if (secondMaxChar != ' ') {
            System.out.println("Second max occurrence is " + secondMaxChar + ": " + secondMax);
        } else {
            System.out.println("No second max occurrence found.");
        }
    }


    //21.Replace a given character with their occurrence
    public static void replaceCharacter(String s, char targetChar) {
        if (s.indexOf(targetChar)==-1) return;

        int count=1;
        String res="";

        for (char ch : s.toCharArray()){
            if (ch==targetChar){
                res+=count;
                count++;
            }
            else res+=ch;
        }
        System.out.println(res);
    }


    //22. Replace max occurrence with ascii val
    public static void replaceMaxOccurrenceWithAscii(String s){
        char maxOccurrence = maxOccurance(s);

        int ascii = maxOccurrence;

        String res="";
        for (char ch : s.toCharArray()) {
            if (ch==maxOccurrence) res+=ascii;
            else res+=ch;
        }
        System.out.println(res);
    }

    //23. First Non-Repeating Character
    public static void firstNonRepeatChar(String s) {
        char[]chars = s.toCharArray();
        String str="";
        for (int i=0; i<chars.length; i++) {
            for (int j=i+1; j<chars.length; j++){
                if (chars[i]==chars[j]){
                    str+=chars[j];
                }
            }
        }

        for (char ch : chars) {
            if (str.indexOf(ch)==-1){
                System.out.println(ch + " is the first non-repeating character");
                return;
            }
        }
        System.out.println("There is no any non-repeating character in given string");
    }

    //24. Reverse String using StringBuffer
    public static void reverseStringUsingStrBuff(String s) {
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());
    }

    //24. Reverse String using StringBuilder
    public static void reverseStringUsingStrBuilder(String s) {
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());
    }

    //25.Remove Special Character
    public static void removeSpecialChar(String s) {
        String res="";
        for (char ch : s.toCharArray()) {
            if ((ch>='a' && ch <='z') || (ch>='A' && ch <='Z') || (ch>='0' && ch <='9'))
                res+=ch;

        }
        System.out.println(res);
    }

    //26. Remove white space
    public static void removeWhiteSpace(String s) {
        //Using ReplaceAll method
        //'//s' is an unicode, represent single space and single space replacing by "";
        //String trimmedStr = s.replaceAll("\\s", ""); //
        //System.out.println(trimmedStr);

        //Without using replaceAll method
        String res="";
        for (char ch : s.toCharArray()){
            if (ch!=' ') res+=ch;
        }
        System.out.println(res);
    }

    //27.Remove duplicate Character
    public static void  removeDuplicateChar(String s) {
        //Approach-1 : java8
        StringBuilder sb = new StringBuilder();
        //s.chars() convert char to stream
        s.chars().distinct().forEach((c) -> sb.append((char) c));
        System.out.println(sb);

        //Approach-2
        StringBuilder sb2 = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            int index = s.indexOf(s.charAt(i), i+1);
            if(index==-1) sb2.append(s.charAt(i));
        }
        System.out.println(sb2);

        //Approach-3
        StringBuilder sb3 = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            boolean isRepeated = false;
            for (int j=i+1; j<s.length(); j++) {
                if (s.charAt(i)==s.charAt(j)){
                    isRepeated=true;
                    break;
                }
            }
            if (!isRepeated) sb3.append(s.charAt(i));
        }
        System.out.println(sb3);

        //Approach-4
        StringBuilder sb4 = new StringBuilder();
        Set<Character> set = new LinkedHashSet();

        for (char ch : s.toCharArray()){
            set.add(ch);
        }

        for (Character ch : set){
            sb4.append(ch);
        }
        System.out.println(sb4);
    }
}

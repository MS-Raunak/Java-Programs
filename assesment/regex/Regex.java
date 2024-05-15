package assesment.regex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1.Simple text matched
 * 2.Print first index and last index of matching sustring
 * 3. print any matching  : use dot(.) operator
 * 4. Print Matching Character: USe Character classes or CharSet represented by []
 * 5. Print matching with CharSet1 and Specified Char
 * 6. simple dot(.) and [.]
 * 7.Escape Sequence Matcher
 * 8.String with Regex(only two method supports 1.replaceAll 2.split)
 * 9.Quantifier : Used to match previous character occurrence
 * 10.Mobile Number Validation
 * 11.Email Validation
 */
public class Regex {
    public static void main(String[] args) {
       // matchSimpleText();
       // printMatchingIndex();
        //anyMatch();
        //printMatchingChar();
       //charSetAndSpecifiedChar();
       // dotMatch();
        //escapeMatch();
        //strWithRegex();
        //mobNumValidate();
        //gmailValidation();
        quantifierMatcher();
    }

    //1.Simple text matched
    public static void matchSimpleText() {
        String expression = "ab";
        String target = "abcmbab";

        Pattern p = Pattern.compile(expression);
        Matcher m = p.matcher(target);
        int count=0;
        //find() is use to check all matching substring and return boolean
        while (m.find()) {
            System.out.println(m.group());  //used to print all valid substring
            count++;
        }
        System.out.println("total matches: " + count);
    }

    //2.Print first index and last index of matching sustring
    public static void printMatchingIndex() {
        String expression = "abc";
        String targetStr = "ddccabceabcacd"; //first: 4-7 last:11-13

        Pattern p = Pattern.compile(expression);
        Matcher m = p.matcher(targetStr);

        while (m.find()) {
            System.out.println("Matched sustring: " + m.group());
            System.out.println("First index of matched substring: " + m.start());
            System.out.println("Last index of matched substring: " + m.end()); //last index = last index + 1, and it is exclusive

            System.out.println("***************************");
        }
    }

    //3. print any matching  : use dot(.) operator
    public static void anyMatch() {
        String expression = ".";
        String targetStr= "abcmno";

        Pattern p = Pattern.compile(expression);
        Matcher m = p.matcher(targetStr);

        while (m.find()) {
            System.out.println(m.group());
        }
    }

    //4. Print Matching Character: USe Character classes(It's deal with character only)
    public static void printMatchingChar() {
        //1.print each matching character separately in abc
        String expression = "[abc]";
        String targetStr = "manobharcab";

        Pattern p = Pattern.compile(expression);
        Matcher m = p.matcher(targetStr);
        //while (m.find()) System.out.println(m.group());

        //2.print all character except given abc
        expression = "[^abc]";
        targetStr = "cobra";
        p = Pattern.compile(expression);
        m = p.matcher(targetStr);
        //while (m.find())  System.out.println(m.group()); //or

        //3. print any matching char from a-z, A-Z and 0-9
        expression = "[a-zA-Z0-9]";
        targetStr="Maharaj@a09";
        p = Pattern.compile(expression);
        m = p.matcher(targetStr);
        //while (m.find()) System.out.print(m.group()); // M a h a r a j a 0 9

        //4 print any matching from a-z and A-Z
        expression = "[a-zA-Z]";
        targetStr="Maharaj@a09";
        p = Pattern.compile(expression);
        m = p.matcher(targetStr);
        //while (m.find()) System.out.print(m.group()); // M a h a r a j a

        //5. print any matching from A-Z
        expression = "[A-Z]";
        targetStr="Maharaj@a09";
        p = Pattern.compile(expression);
        m = p.matcher(targetStr);
        //while (m.find()) System.out.print(m.group()); // M

        //6. print any matching from a-z
        expression = "[a-z]";
        targetStr="maharaj@A09";
        p = Pattern.compile(expression);
        m = p.matcher(targetStr);
        //while (m.find()) System.out.print(m.group()); // m a h a r a j

        //7. print all matching special character
        expression = "[^a-zA-Z-0-9]";
        targetStr="Maharaj@A09#";
        p = Pattern.compile(expression);
        m = p.matcher(targetStr);
        while (m.find()) System.out.print(m.group()); // @#
    }

    //5. Print matching with CharSet1 and Specified Char
    public static void charSetAndSpecifiedChar() {
        //example-1: two character matching
        String expression = "a[sla]";  //1st char should be a and 2nd could be any one from sla
        String targetStr = "asanarala";
        Pattern p = Pattern.compile(expression);
        Matcher m = p.matcher(targetStr);
       // while (m.find()) System.out.println(m.group()); //as al

        //example-2: 3 matchin
        expression = "a[rbi]m";//1st should be a and 2nd could be any one char from rbi and last char is m
        targetStr = "ancpqqarm";
        p = Pattern.compile(expression);
        m = p.matcher(targetStr);
       // while (m.find()) System.out.println(m.group()); //arm

        //example: apple matching
        expression = "app[a-n]e";
        targetStr = "appljaplappleano";
        p = Pattern.compile(expression);
        m = p.matcher(targetStr);
        while (m.find()) System.out.println(m.group()); //apple

    }

    //6. Dot Matching: Use dot operator(. has diff meaning here)
    public static void dotMatch() {
        //example-1 : only dot(.) means any character
        String expression = "a.b";  //1st char should be a and 2nd could be any one char and 3rd should be b
        String targetStr = "asanacbralaabb";
        Pattern p = Pattern.compile(expression);
        Matcher m = p.matcher(targetStr);
        //while (m.find()) System.out.println(m.group()); //acb aab

        //example-2 : [.] means dot character
        expression = "a[.]d";  //1st char should be a and 2nd should be dot char and 3rd should be d
        targetStr = "abbcadba.d";//
        p = Pattern.compile(expression);
        m = p.matcher(targetStr);
        //while (m.find()) System.out.println(m.group()); //a.d

        //Example-3 : [.]. means one dot and any second any charcter
        expression = "m[.].";  //1st char should be a and 2nd should be dot char and 3rd could be any char
        targetStr = "abbcadbm.9";//
        p = Pattern.compile(expression);
        m = p.matcher(targetStr);
        while (m.find()) System.out.println(m.group()); //m.9
    }

    //7.Escape Sequence Matcher
    public static void escapeMatch() {
        String expression = "\\."; //match all dot
        //String expression = "[.]"; //same work as above expression
        String targetStr = "a8.hj.sd.asdeee3";

        Pattern p = Pattern.compile(expression);
        Matcher m = p.matcher(targetStr);
        while (m.find()) System.out.print(m.group() + " "); // . . .
    }

    //8.String function with REGEX
    public static void strWithRegex() {
        //1-> replaceAll method
        String s = "Hello Chhaya! How are you' Where are u going'";
        System.out.println(s.replaceAll("'", "!"));

        //2-> split method
        s = "Hello Chhaya! How are you'' Where are u going'";
        String[]strings = s.split("'", 2);
        System.out.println(Arrays.toString(strings));
    }

    //10.Quantifier: deals with previous character occurrence
    public static void quantifierMatcher() {
        //1. {} : used to indicate previous character count
        String expression = "[0-9]{10}";
        String targetStr = "880928472142933874"; //only first 10 char will get matched
        Pattern p = Pattern.compile(expression);
        Matcher m = p.matcher(targetStr);
        //while (m.find()) System.out.println(m.group());//8809284721

        //2.{1, 5} : means at-least one char and at-most 5 char
        expression = "[a-z]{1,5}";
        targetStr = "umbrella@123";
        p = Pattern.compile(expression);
        m = p.matcher(targetStr);
        //while (m.find()) System.out.print(m.group() + " ");//umbre lla

        //3.{1,} : means at-least one char and at-most n char
        expression = "[a-z]{1,}";
        targetStr = "um#brella@123";
        p = Pattern.compile(expression);
        m = p.matcher(targetStr);
        //while (m.find()) System.out.print(m.group() + " ");//um brella

        //4. * : previous character occurrence at-least zero and at-most more than zero
        //expression = "ab*"; //b should be either 0 or more than 0: a abb a
        expression = "a*b"; //a should be either 0 or more than 0
        targetStr = "acabbad";
        p = Pattern.compile(expression);
        m = p.matcher(targetStr);
        //while (m.find()) System.out.print(m.group() + " ");//ab b

        //5. + : means previous character occurrence either 1 or more than one
        expression = "an+";
        targetStr = "abcannabca";
        p = Pattern.compile(expression);
        m = p.matcher(targetStr);
        //while (m.find()) System.out.print(m.group() + " ");//ann

        //5. ? : means previous cha occurrence either will be 0 or 1
        expression = "an?";
        targetStr = "abcannabca";
        p = Pattern.compile(expression);
        m = p.matcher(targetStr);
        while (m.find()) System.out.print(m.group() + " ");//a an a a
    }


    //10. Mobile Number Validation
    public static void mobNumValidate() {
        String expression = "[6-9][0-9]{9}";
        Scanner sc = new Scanner(System.in);
        System.out.print("enter mobile number: ");
        String mobNum = sc.next();

        Pattern p = Pattern.compile(expression);
        Matcher m = p.matcher(mobNum);

        if (m.matches()){ //matches match entire string but find match any matched substring
            System.out.println("Valid mobile number");
        }
        else System.out.println("Invalid mobile number");
    }

    //11.Gmail Validation
    public static void gmailValidation() {
        String expression = "[a-z0-9_.]+@gmail[.]com";
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your gmail: ");
        String mobNum = sc.next();

        Pattern p = Pattern.compile(expression);
        Matcher m = p.matcher(mobNum);

        if (m.matches()){ //matches match entire string but find match any matched substring
            System.out.println("Valid email number");
        }
        else System.out.println("Invalid email number");
    }

}

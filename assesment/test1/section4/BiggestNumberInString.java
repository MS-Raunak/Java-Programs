package assesment.test1.section4;


//Find The Greatest Number in String
public class BiggestNumberInString {
    public static void main(String[] args) {
        String s = "j257av21a189";
        char[]chars = s.toCharArray();

        int max=0;
        for (char ch : chars) {
            if (ch>='0' && ch<='9'){
                if (Integer.parseInt(ch+"") > max)
                    max=Integer.parseInt(ch+"");
            }
        }
        System.out.println(max + " is a greatest number in the given string");
    }

}

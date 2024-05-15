package PatternProgram;

public class GreatestOfThreeNumInSingleLine {
    public static void main(String[] args) {
        int x=45,y=3,z=4;
        int res=x>y?(x>z?x:z):(y>z?y:z);
        System.out.println(res);
    }
}

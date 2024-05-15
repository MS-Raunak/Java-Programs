package interview;/* Calling main() method more than once*/

public class CallMainMoreThanOne {
    public static void s()
    {
        main(null);
    }
    public static void main(String[] args)
    {
        System.out.println("This is main method");
        s();
    }
}

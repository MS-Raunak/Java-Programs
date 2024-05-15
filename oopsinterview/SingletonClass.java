package oopsinterview;

class Singleton {
    private static Singleton s;

    //private constructor
    private Singleton(){
    }

    //factory method
    public static Singleton factory(){
        if (s==null) s = new Singleton();
        return s;
    }
}
public class SingletonClass {
    public static void main(String[] args) {
        Singleton s = Singleton.factory();
        Singleton s2 = Singleton.factory();
        System.out.println(s==s2);
    }
}

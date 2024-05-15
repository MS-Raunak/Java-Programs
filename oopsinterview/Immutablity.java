package oopsinterview;

class Strings{
    private String s;

    //constructor
    Strings(String s){
        this.s = s;
    }

    // method to checking
    public Strings m1(String s){
        if (this.s.equals(s)) return this;
        else return new Strings(s);
    }
}

public class Immutablity {
    public static void main(String[] args) {
        Strings s = new Strings("Hello");
        Strings s2 = s.m1("Hello");
        Strings s3 = s.m1("Hi");
        System.out.println(s.equals(s2));
        System.out.println(s.equals(s3));
    }
}

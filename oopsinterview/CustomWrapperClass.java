package oopsinterview;

class Wrapper{
    private int a;

    //Constructor
    Wrapper(int a){
        this.a = a;
    }

    //getter method
    public int getA(){
        return a;
    }
    //setter method
    public void setA(int a){
        this.a = a;
    }

    public String toString(){
        return Integer.toString(a);
    }
}

public class CustomWrapperClass {
    public static void main(String[] args) {
        Wrapper w = new Wrapper(10);
        System.out.println(w);

    }
}

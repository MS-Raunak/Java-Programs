package oopsinterview.loosecoupling;

public class Laptop implements Computer{
    @Override
    public void writeCode() {
        System.out.println("Write code on Laptop");
    }
}

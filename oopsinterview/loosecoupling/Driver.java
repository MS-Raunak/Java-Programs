package oopsinterview.loosecoupling;

public class Driver {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();

        Laptop laptop = new Laptop();
        Desktop desktop = new Desktop();
        programmer.writeCodeOnComputer(laptop);
        programmer.writeCodeOnComputer(desktop);
    }
}

package interview;

class TestStringImmutable{
    String s;

    TestStringImmutable(String s){
        this.s = s;
    }

    public TestStringImmutable modify(String s){
        if (this.s.equals(s)) return this;
        else return new TestStringImmutable(s);
    }
}

public class CustomStringImmutable {
    public static void main(String[] args) {
        TestStringImmutable t1 = new TestStringImmutable("chhaya");
        TestStringImmutable t2 = t1.modify("chhaya");

        System.out.println(t1.equals(t2));
    }
}

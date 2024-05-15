package interview;

class Test {
    int i;

    Test(int i){
        this.i = i;
    }

    public Test modify(int i){
        if (this.i == i)
            return this;
        else
            return new Test(i);
    }
}

public class ImmutableClass {
    public static void main(String[] args) {
        Test test1 = new Test(10);
        Test test2 = test1.modify(100); // false
//        interview.Test test2 = test1.modify(10); // true

        System.out.println(test1 == test2);
    }
}
